package com.eg.service;

import com.eg.model.User;

public interface UserService {
    void addUser(User user);
    void delete(User user);
    void edit(User user);
    User getUser(String login);
    User getUserById(int id);
}
