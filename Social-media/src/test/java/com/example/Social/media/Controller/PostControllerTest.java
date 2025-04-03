package com.example.Social.media.Controller;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
//CREATE TEST CTRL + SHIFT + T
class PostControllerTest {
    private PostController postController;

    public PostControllerTest() {
    }

    @BeforeAll
    public static void setupAll() {

        System.out.println("Should Print Before All Tests");
    }
    @BeforeEach
    public void setup() {
        System.out.println("Instantiating Contact Manager");
        this.postController = new PostController();
    }
    @Test
    @DisplayName("Should Create Contact")
    public void shouldCreatePostWhenGivenPayload() {

    }

}