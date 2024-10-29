package io.hdygxsj.celeborn.kubernetes.operator.server.controller;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.Operator;
import io.javaoperatorsdk.operator.api.config.ControllerConfigurationOverrider;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class OperatorBootstrap {

    @Autowired
    private KubernetesClient kubernetesClient;

    @Autowired
    private List<Reconciler<?>> reconcilers;

    private Operator operator;

    @PostConstruct
    public void init() {
        this.operator = new Operator(kubernetesClient);
    }

    public void start() {
        for (Reconciler<?> reconciler : reconcilers) {
            log.info("Register reconciler " + reconciler.getClass().getSimpleName());
            operator.register(reconciler);
        }

    }

    private void overrideControllerConfigs(ControllerConfigurationOverrider<?> overrider) {

    }

}
