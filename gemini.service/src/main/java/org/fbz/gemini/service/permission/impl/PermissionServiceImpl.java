package org.fbz.gemini.service.permission.impl;

import java.util.List;

import org.fbz.gemini.domain.permission.Permission;
import org.fbz.gemini.service.permission.PermissionRepository;
import org.fbz.gemini.service.permission.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionRepository permissionRepository;
    
    public List<Permission> findAll() {
        return permissionRepository.findAll();
    }

}
