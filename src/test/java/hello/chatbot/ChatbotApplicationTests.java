package hello.chatbot;

import hello.chatbot.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChatbotApplicationTests {

	@Autowired
	private PostRepository postRepository;

	@Test
	void contextLoads() {

	}

}
