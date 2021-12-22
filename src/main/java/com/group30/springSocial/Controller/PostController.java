package com.group30.springSocial.Controller;
import com.group30.springSocial.Entity.Post;
import com.group30.springSocial.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/api/postService")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/save")
    public ArrayList<Post> submitPost(@RequestBody Post body) {
        return postService.submitPostToDB(body);
    }

    @GetMapping("/getPost")
    public ArrayList<Post> retrieveAllPost() {
        return postService.retrievePostFromDB();
    }

    @DeleteMapping("/delete")
    public ArrayList<Post> deleteThisPost(@PathVariable("postID") UUID postID) {
        return postService.deletePostFromDB(postID);
    }
}