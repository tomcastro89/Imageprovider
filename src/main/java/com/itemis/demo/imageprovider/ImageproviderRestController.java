package com.itemis.demo.imageprovider;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ImageproviderRestController {
    @GetMapping(value = "/images")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Image> getImages(){
        List<Image> images = new ArrayList<>();
        images.add(new Image(
                "Itemis Logo",
                "https://raw.githubusercontent.com/tomcastro89/Imageprovider/master/itemis_logo.jpeg"
        ));
        return images;
    }
}
