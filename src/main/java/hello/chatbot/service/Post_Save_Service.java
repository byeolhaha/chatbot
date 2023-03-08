package hello.chatbot.service;

import hello.chatbot.repository.PostRepository;
import hello.chatbot.repository.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Post_Save_Service {
    @Autowired
    private PostRepository postRepository;

    public void saveData(Post post) {
        postRepository.save(post);
    }


}
