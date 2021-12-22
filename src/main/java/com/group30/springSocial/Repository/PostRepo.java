package com.group30.springSocial.Repository;

import com.group30.springSocial.Entity.Post;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface PostRepo extends CassandraRepository<Post, UUID> {
    ArrayList<Post> findAll();
    Post save(Post post);
    void deletePostByID(UUID postId);
}
