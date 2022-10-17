package com.example.cloudstorage.service;

import com.example.cloudstorage.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

}
