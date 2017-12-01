package org.fbz.gemini.domain.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.fbz.gemini.domain.common.DefaultEntity;
import org.fbz.gemini.domain.role.Role;
@Entity
@Table(name="s_user")
public class User extends DefaultEntity {
    private static final long serialVersionUID = -5959387339044725126L;
    private String username;
    private String password;
    private String nickname;
    @Transient
    private List<Role> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
