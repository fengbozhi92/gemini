package org.fbz.gemini.service.user;


import org.fbz.gemini.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{
    User findByUsername(String username);
}
