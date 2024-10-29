package io.hdygxsj.celeborn.kubernetes.api.master;

import io.hdygxsj.celeborn.kubernetes.api.ingress.IngressSpec;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MasterSpec {

    private IngressSpec ingressSpec;
}
