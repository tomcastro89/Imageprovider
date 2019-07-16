package com.itemis.demo.imageprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ImageproviderRestController {
    @GetMapping(value = "/images")
    public List<Image> getImages(){
        return new ArrayList();
    }
}
