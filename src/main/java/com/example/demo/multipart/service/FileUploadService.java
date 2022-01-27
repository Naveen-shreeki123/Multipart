package com.example.demo.multipart.service;

import com.example.demo.multipart.model.FileModel;
import com.example.demo.multipart.repository.FileUploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class FileUploadService implements FileServiceInterface{

    @Autowired
    private FileUploadRepository fileUploadRepository;
    @Override
    public void uploadToDb(MultipartFile file) throws IOException {
        FileModel fileModel = new FileModel();
        fileModel.setData(file.getBytes());
        fileModel.setType(file.getContentType());
        fileModel.setName(file.getName());
        fileUploadRepository.save(fileModel);
    }

    public List<FileModel> getData() {
        return fileUploadRepository.findAll();
    }
}
