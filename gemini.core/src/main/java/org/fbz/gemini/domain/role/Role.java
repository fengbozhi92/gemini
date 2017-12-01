package org.fbz.gemini.domain.role;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.fbz.gemini.domain.common.DefaultEntity;
import org.fbz.gemini.domain.permission.Permission;
@Entity
@Table(name="s_role")
public class Role extends DefaultEntity{
    private static final long serialVersionUID = 565600053213611137L;
    private String name;
    @Transient
    private List<Permission> permissions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
