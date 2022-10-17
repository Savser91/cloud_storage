package com.example.cloudstorage.service;

import com.example.cloudstorage.entity.Files;
import com.example.cloudstorage.entity.Users;
import com.example.cloudstorage.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FileService {

    FileRepository fileRepository;
    UserRepository userRepository;

    public void uploadFile(String authToken, String filename) {

    }

    public void deleteFile(String authToken, String filename) {

    }


    public Files downloadFile(String authToken, String filename) {
        return null;
    }

    public void editFilename(String authToken, String filename, String newFilename) {

    }
    
    private Users getUser(String authToken) {
        return null;
    }

}
