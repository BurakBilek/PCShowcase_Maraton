package com.burak.service;

import com.burak.repository.LikeRepository;

public class LikeService {
    LikeRepository likeRepository;

    public LikeService(){
        this.likeRepository = new LikeRepository();
    }
}
