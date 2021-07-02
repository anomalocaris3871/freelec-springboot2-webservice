package com.jojoldu.book.springboot.domain.posts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class PostsRepositoryTest {
    @Autowired PostsRepository postsRepository;

    @Test
    void test() {
        Posts posts = Posts.builder()
                .title("title")
                .content("content")
                .author("author")
                .build();

        postsRepository.save(posts);

        List<Posts> list = postsRepository.findAllDesc();
        for (Posts posts1 : list) {
            System.out.println("posts1 = " + posts1);
        }
    }
}