package com.example.cloudstorage.repository;

import com.example.cloudstorage.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {
    Optional<Users> findByLogin(String login);

    void deleteByLogin(String login);
}
