package com.example;

import com.example.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApiService {

    private final TestRepository testRepository;

    public String getText(){
        return testRepository.getTest();
    }
}