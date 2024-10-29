package io.hdygxsj.celeborn.kubernetes.operator.server;

import io.hdygxsj.celeborn.kubernetes.operator.server.controller.OperatorBootstrap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CelebornKubernetesControllerInitRunner implements ApplicationRunner {

    @Autowired
    private OperatorBootstrap operatorBootstrap;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Initializing Celeborn Kubernetes controller");
        operatorBootstrap.start();
    }
}
