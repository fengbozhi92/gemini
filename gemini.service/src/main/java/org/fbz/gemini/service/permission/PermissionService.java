package org.fbz.gemini.service.permission;

import java.util.List;

import org.fbz.gemini.domain.permission.Permission;

public interface PermissionService {
    List<Permission> findAll();
}
