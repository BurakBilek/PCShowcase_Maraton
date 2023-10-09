package com.burak.controller;

import com.burak.service.PhotoService;

public class PhotoController {
    PhotoService photoService;

    public PhotoController() {
        this.photoService=new PhotoService();
    }
}
