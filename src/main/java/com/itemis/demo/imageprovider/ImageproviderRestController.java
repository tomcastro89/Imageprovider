package com.itemis.demo.imageprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageproviderRestController {
    @GetMapping(value = "/images")
    public void getImages(){
        return;
    }
}