package com.leosargino.workshopmongo.service;

import com.leosargino.workshopmongo.domain.User;
import com.leosargino.workshopmongo.repository.UserRepository;
import com.leosargino.workshopmongo.service.exception.ObjetcNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {

        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjetcNotFoundException("Objeto não encontrado"));
    }
}

