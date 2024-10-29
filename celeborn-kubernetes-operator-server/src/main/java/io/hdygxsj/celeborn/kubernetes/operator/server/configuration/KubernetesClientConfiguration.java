package io.hdygxsj.celeborn.kubernetes.operator.server.configuration;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Files;
import java.nio.file.Paths;


@Slf4j
@Getter
@Setter
@Configuration
@ConfigurationProperties("kubernetes.client")
public class KubernetesClientConfiguration {

    private String type;

    private String path;

    private String ca;

    private String token;

    private String masterUrl;

    @Bean
    public KubernetesClient kubernetesClient() {
        Config config = null;
        switch (type) {
            case "kubeconfig":
                log.info("Creating Kubernetes client with type: {}", type);
                try {
                    config = Config.fromKubeconfig(Files.readString(Paths.get(path), java.nio.charset.StandardCharsets.UTF_8));
                } catch (Exception e) {
                    log.error("Error loading kubeconfig: {}", e.getMessage());
                }
                break;
            case "token":
                log.info("Creating Kubernetes client use masterUrl,token,ca");
                config = new ConfigBuilder()
                        .withMasterUrl(masterUrl)
                        .withCaCertData(ca)
                        .withOauthToken(token)
                        .build();
                break;
            default:
                log.info("Creating Kubernetes client use service account");
                break;

        }
        return new KubernetesClientBuilder().withConfig(config).build();
    }

}
