package com.guimex.gtbackend.service;

import com.guimex.gtbackend.models.Role;
import com.guimex.gtbackend.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
