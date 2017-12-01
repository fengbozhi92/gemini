package org.fbz.gemini.domain.permission;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.fbz.gemini.domain.common.DefaultEntity;
@Entity
@Table(name="s_permission")
public class Permission extends DefaultEntity {
    private static final long serialVersionUID = 7540480361140381462L;

    private String functionId;
    private String functionName;

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}
