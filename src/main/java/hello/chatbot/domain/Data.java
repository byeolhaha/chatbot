package hello.chatbot.domain;



//Controller끼리 client로부터 받은 데이터를 주고 받기 위한 클래스
public class Data {

    private static String answer ;
    private static final Data instance = new Data() ;

    public static Data getInstance() {
        return instance;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return answer;
    }
}
