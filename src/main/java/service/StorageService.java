package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import entities.ImageData;
import entities.product;
import repositories.StorageRepository;
import util.ImageUtil;

import java.awt.Image;
import java.io.IOException;
import java.util.Optional;

@Service
public class StorageService {
    @Autowired
    private StorageRepository repository ;
    public String uploadImage(MultipartFile file) throws IOException {
    	ImageData imageData = repository.save(((String) ImageData.builder())
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .imageData(ImageUtil.compressImage(file.getBytes())).build());
        if(imageData!=null){
            return "file uploaded successfully : "+file.getOriginalFilename();

        }
        return null;
    }
   
}