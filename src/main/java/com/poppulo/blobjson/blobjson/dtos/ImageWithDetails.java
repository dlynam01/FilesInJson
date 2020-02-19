package com.poppulo.blobjson.blobjson.dtos;

import java.util.Base64;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImageWithDetails {

    private String filename;
    private String filetype;
    private byte[] filedata;


    public String getFilename() {
        return filename;
    }

    public String getFiletype() {
        return filetype;
    }

    public String getFiledata() {
        return Base64.getEncoder().encodeToString(filedata);
    }
}
