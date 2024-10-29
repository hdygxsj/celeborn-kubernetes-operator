package io.hdygxsj.celeborn.kubernetes.operator.server.controller;

import io.hdygxsj.celeborn.kubernetes.api.CelebornDeployment;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import org.springframework.stereotype.Component;

@ControllerConfiguration()
@Component
public class CelebornController implements Reconciler<CelebornDeployment> {


    @Override
    public UpdateControl<CelebornDeployment> reconcile(CelebornDeployment celebornDeployment,
                                                       Context<CelebornDeployment> context) throws Exception {
        return null;
    }
}
