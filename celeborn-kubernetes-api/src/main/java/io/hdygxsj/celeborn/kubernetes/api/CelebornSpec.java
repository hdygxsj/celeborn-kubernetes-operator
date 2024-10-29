package io.hdygxsj.celeborn.kubernetes.api;

import io.hdygxsj.celeborn.kubernetes.api.master.MasterSpec;
import io.hdygxsj.celeborn.kubernetes.api.worker.WorkSpec;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CelebornSpec {

    private MasterSpec masterSpec;

    private WorkSpec workSpec;
}
