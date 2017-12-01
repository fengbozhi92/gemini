package org.fbz.gemini.service.role;

import org.fbz.gemini.domain.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String>{
}
