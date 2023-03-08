package hello.chatbot.model;

import java.util.HashMap;
import java.util.Map;

// chatbot에 파일을 업로드 하기 위해서 파일 자체 데이터에 <a>태그를 넣었고 그 <a>태그를 분리하기 위한 작업이다.
// <a href=\"서식민원처리안내.pdf\">  처리방법은 여기를 보세요</a> 이 부분만 따로 분리하고 이렇게 링크 부분을 마지막에 넣도록

public class FileLink_Maker {

    private static Map<String,String> file_link = new HashMap<>();


    public static Map<String, String> fileLinkMaker(StringBuilder pythonData){

        int start_html = pythonData.indexOf("<a");
        if(start_html!=-1) {
            file_link.put("Link", pythonData.substring(start_html));
            file_link.put("Text", pythonData.substring(0, start_html));
        }
        else {
            file_link.put("Link", "");
            file_link.put("Text", pythonData.toString());
        }
        return file_link;

    }
}
