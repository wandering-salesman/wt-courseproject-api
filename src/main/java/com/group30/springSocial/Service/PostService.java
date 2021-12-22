package com.group30.springSocial.Service;

import com.group30.springSocial.Entity.Post;
import com.group30.springSocial.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    public ArrayList<Post> submitPostToDB(Post postData) {
        postRepo.save(postData);
        return retrievePostFromDB();
    }

    public ArrayList<Post> retrievePostFromDB() {
        postRepo.findAll();
        return postRepo.findAll();
    }

    public ArrayList<Post> deletePostFromDB(UUID postID) {
        postRepo.deletePostByID(postID);
        return retrievePostFromDB();
    }
}
