package org.fbz.gemini.service.permission;

import org.fbz.gemini.domain.permission.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, String>{
    

}
