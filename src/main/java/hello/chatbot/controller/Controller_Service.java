package hello.chatbot.controller;





import hello.chatbot.domain.Data;
import hello.chatbot.repository.Post;
import hello.chatbot.service.Post_Save_Service;
import hello.chatbot.model.PythonFile_Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;




@Controller
@RequestMapping("")
public class Controller_Service {


    // ajax가 클라이언트로부터 받은 데이터를 여기 Controller끼리 데이터를 주고 받아야 하는 상황이다.
    //그래서 Data라는 클래스를 만들어서 주고 받도록 했다.
    // 어떤 데이터 하나를 어떤 Controller가 읽고 어떤 Controller가 쓰는 것은 좋은 코드가 아니지만
    // 이렇게 클래스를 만들어서 주고 받는 것, private로 선언하는 것이 좋은 코드일까? 다시 생각해보자
   private Data data = Data.getInstance();
   @Autowired
   Post_Save_Service postsaveService;

   @GetMapping("/")
   public String home() {

    return "index";
    }

    @ResponseBody
    @PostMapping("get")
    public void get(
            @RequestParam("question") String input
     ) {
        data.setAnswer(input);

    }

    @ResponseBody
    @PostMapping("service")
    public Map<String,String> service() throws Exception{

        String input = data.getAnswer();


        Map<String, String> output = new HashMap<>();

        if(!input.contains("바보")) {
            String path = new File("").getAbsolutePath();

            String pyFileName = "rule_based.py";

            //String methodeName = "return_similar_answer(\"" + sb + "\")";
            String methodeName = "chat(\'" + input + "\')";


            System.out.println("methodName :" + methodeName);

            PythonFile_Reader pythonFile_reader;
            try {
                pythonFile_reader = new PythonFile_Reader(path, pyFileName, methodeName);
               // pythonFile_reader = new PythonFile_Reader(file, pyFileName, methodeName);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            //file.deleteOnExit();

            output = pythonFile_reader.getOutput();
        } else {
            System.out.println(input);
            postsaveService.saveData(new Post(input));
            output.put("Text","더 열심히 공부할게요. 도와주셔서 감사합니다. 🕵️");
            output.put("Link","");



        }

        return output;


    }


}
