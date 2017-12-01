package org.fbz.gemini.service.user.impl;

import org.fbz.gemini.domain.user.User;
import org.fbz.gemini.service.user.UserRepository;
import org.fbz.gemini.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Object login(String username, String password) {
        // TODO Auto-generated method stub
        return null;
    }

}
