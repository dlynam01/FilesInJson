package com.poppulo.blobjson.blobjson.apis;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.poppulo.blobjson.blobjson.dtos.ImageWithDetails;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

@RequestMapping("/v1/demo")
@Controller
public class RandomImageResource {

    @GetMapping(path="/image", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ImageWithDetails> getRandomImage() throws IOException {
        File duckImg = ResourceUtils.getFile("classpath:images/duckpng.png");
        FileInputStream fileInputStream = new FileInputStream(duckImg);
        byte[] filedata = IOUtils.toByteArray(fileInputStream);

        ImageWithDetails imageWithDetails = new ImageWithDetails(duckImg.getName(), "png", filedata);
        return ResponseEntity.ok(imageWithDetails);
    }
}
