package org.orcid.jaxb.model.v3.rc2.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;

@XmlRootElement(name = "sourceClientId")
@ApiModel(value = "SourceClientIdV3_0_rc2")
public class SourceClientId extends OrcidIdBase implements Serializable {

    private static final long serialVersionUID = 1L;

    public SourceClientId() {
        super();
    }

    public SourceClientId(String path) {
        super(path);
    }

    public SourceClientId(OrcidIdBase other) {
        super(other);
    }

}
