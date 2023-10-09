package com.burak.controller;

import com.burak.service.LikeService;

public class LikeController {
    LikeService likeService;

    public LikeController() {
        this.likeService =new LikeService();
    }
}
