package io.hdygxsj.celeborn.kubernetes.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize()
@Group(CrdConstants.API_GROUP)
@Version(CrdConstants.API_VERSION)
@ShortNames({"celeborndep"})
public class CelebornCluster extends CustomResource<CelebornSpec, CelebornStatus> implements Namespaced {

    private CelebornSpec spec;


}
