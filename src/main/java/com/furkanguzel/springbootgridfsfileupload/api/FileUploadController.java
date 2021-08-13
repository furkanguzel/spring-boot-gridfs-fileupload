package com.furkanguzel.springbootgridfsfileupload.api;

import com.furkanguzel.springbootgridfsfileupload.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class FileUploadController {

    private final FileUploadService fileUploadService;

    public FileUploadController(FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }

    @PostMapping
    public void fileUpload(@RequestParam("file")  MultipartFile multipartFile) throws Exception {
        fileUploadService.uploadFile(multipartFile);
    }

}
