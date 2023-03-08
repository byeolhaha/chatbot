package hello.chatbot.repository;

import groovy.transform.builder.Builder;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동 생성
    private Long id;
    private String data;

    @Builder
    public Post(String data){
        this.data= data;
    }
}
