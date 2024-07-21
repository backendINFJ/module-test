package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {
    public String getTest() {
        return "multi module test";
    }
}
