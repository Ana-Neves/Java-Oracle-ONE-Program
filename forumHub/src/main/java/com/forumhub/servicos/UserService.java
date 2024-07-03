package com.forumhub.servicos;

import com.forumhub.entidades.User;
import com.forumhub.repositorios.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        // Implementação de lógica de validação, criptografia de senha, etc.
        return userRepository.save(user);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow();
    }
}
