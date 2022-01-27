package com.example.demo.multipart.repository;

import com.example.demo.multipart.model.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileUploadRepository extends JpaRepository<FileModel,String>{
}
