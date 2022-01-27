package com.example.demo.multipart.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileServiceInterface {
    public void uploadToDb(MultipartFile multipartFile) throws IOException;
}
