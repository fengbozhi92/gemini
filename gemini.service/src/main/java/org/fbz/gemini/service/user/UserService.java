package org.fbz.gemini.service.user;

import org.fbz.gemini.domain.user.User;

public interface UserService {
    User findByUsername(String username);
    Object login(String username, String password);
    
}
