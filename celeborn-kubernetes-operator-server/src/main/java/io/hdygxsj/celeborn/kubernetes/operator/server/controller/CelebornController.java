package io.hdygxsj.celeborn.kubernetes.operator.server.controller;

import io.hdygxsj.celeborn.kubernetes.api.CelebornCluster;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import org.springframework.stereotype.Component;

@ControllerConfiguration()
@Component
public class CelebornController implements Reconciler<CelebornCluster> {


    @Override
    public UpdateControl<CelebornCluster> reconcile(CelebornCluster celebornCluster,
                                                    Context<CelebornCluster> context) throws Exception {
        return null;
    }
}
