package com.burak.service;

import com.burak.repository.PostRepository;

public class PostService {
    PostRepository postRepository;

    public PostService(){
        this.postRepository = new PostRepository();
    }
}
