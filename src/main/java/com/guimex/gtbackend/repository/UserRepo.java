package com.guimex.gtbackend.repository;

import com.guimex.gtbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User FindByUsername(String username);
}
