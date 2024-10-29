package io.hdygxsj.celeborn.kubernetes.operator.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CelebornKubernetesOperatorServer {

    public static void main(String[] args) {
        SpringApplication.run(CelebornKubernetesOperatorServer.class, args);
    }
}
