package com.itemis.demo.imageprovider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ImageproviderRestController.class)
public class ImageproviderRestEndpointTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void imagesEndpointIsAvailable() throws Exception {
        mockMvc.perform(get("/images")).andExpect(status().isOk());
    }
}