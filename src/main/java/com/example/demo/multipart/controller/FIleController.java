package com.example.demo.multipart.controller;

import com.example.demo.multipart.model.FileModel;
import com.example.demo.multipart.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping
public class FIleController {

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/upload")
    public void uploadToDb(@RequestParam("file")MultipartFile multipartFile) throws IOException {
        fileUploadService.uploadToDb(multipartFile);
    }


    @GetMapping("/files")
    public List<FileModel> getData(){
        return fileUploadService.getData();
   }
}
