package com.burak.service;

import com.burak.repository.PhotoRepository;

public class PhotoService {
    PhotoRepository photoRepository;

    public PhotoService(){
        this.photoRepository = new PhotoRepository();
    }
}
