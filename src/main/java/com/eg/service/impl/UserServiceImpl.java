package com.eg.service.impl;

import com.eg.model.User;
import com.eg.repository.UserRepository;
import com.eg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    @Override
    public void delete(User user) {
        userRepository.addUser(user);
    }

    @Override
    public void edit(User user) {
        userRepository.edit(user);
    }

    @Override
    public User getUser(String login) {
        return userRepository.getUser(login);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }
}
