package com.example.cloudstorage.repository;

import com.example.cloudstorage.entity.Files;
import com.example.cloudstorage.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileRepository {
    Files findByUserAndFilename(Users user, String filename);
    void removeByUserAndFilename(Users user, String filename);
    List<Files> findAllByUser(Users user);

}
