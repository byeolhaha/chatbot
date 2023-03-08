package hello.chatbot.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class PythonFile_Reader {
    private String path;
    //private File file;
    private String fileName;
    private String methodName;

    private Map<String,String> output = new HashMap<>();
    public PythonFile_Reader(String path, String fileName, String methodName) throws Exception {
        this.path = path;
        this.fileName = fileName;
        this.methodName = methodName;
        reader();
    }

    private Map<String,String> reader() throws Exception {

        StringBuilder input_result = new StringBuilder();
        StringBuilder output_result = new StringBuilder();
        StringBuilder error_result = new StringBuilder();
        String line;

        String module = fileName.substring(0, fileName.lastIndexOf('.'));
        String command = "import " + module + "; "+module+ "." + methodName;
        List<String> items = Arrays.asList("python3", "-c", command); // 서버
        //List<String> items = Arrays.asList("python", "-c", command); // 로컬

        // cmd 창에 python 호출을 위한 : import bert_chatbot; bert_chatbot.method(매개변수)
        System.out.println("items:"+items);
        ProcessBuilder pb = new ProcessBuilder(items);
        pb.directory(new File(path));
        Process p = pb.start();
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream(),"utf-8"));
        BufferedReader out = new BufferedReader(new InputStreamReader(p.getInputStream(),"utf-8"));
        BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream(),"utf-8"));


        while ((line = in.readLine()) != null)
            input_result.append("\n").append(line);
        if (input_result.length() > 0)
              System.out.println(fileName + " : " + input_result);

        while ((line = out.readLine()) != null)
             output_result.append(" ").append(line);
        if (output_result.length() > 0)
                 System.out.println("Output : " + output_result);

        while ((line = error.readLine()) != null)
            error_result.append(" ").append(line);
        if (error_result.length() > 0)
            System.out.println("Error : " + error_result);

        in.close();
        out.close();
        error.close();
        output = FileLink_Maker.fileLinkMaker(input_result);
        return output;
    }


    public Map<String,String> getOutput(){
        return output;
    }

}
