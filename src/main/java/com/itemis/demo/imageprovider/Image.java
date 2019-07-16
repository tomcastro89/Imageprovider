package com.itemis.demo.imageprovider;

import lombok.Data;

@Data
public class Image {
    private String name;
    private String source;

    public Image(String name, String source) {
        this.name = name;
        this.source = source;
    }
}