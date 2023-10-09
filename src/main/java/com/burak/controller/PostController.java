package com.burak.controller;

import com.burak.service.PostService;

public class PostController {
    PostService postService;

    public PostController() {
        this.postService = new PostService();
    }
}
