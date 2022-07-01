package me.awakedev.designpatterns._03_behavioral_patterns._16_iterator._01_before;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Post> posts = new ArrayList<>();

    public void addPost(String post) {
        posts.add(new Post(post));
    }

    public List<Post> getPosts() {
        return posts;
    }
}
