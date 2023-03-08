const inputField = document.getElementById("question");
inputField.addEventListener("keypress", (e) => {
      if ( e.code === "Enter") {
        let input = inputField.value;
        inputField.value =""
         //console.log(input);
         enter(input);
         }
});
//http://localhost:8080/%EA%B3%B5%EC%A7%81%EC%9E%90_%EB%AF%BC%EC%9B%90%EC%9D%91%EB%8C%80_%EB%A7%A4%EB%89%B4%EC%96%BC(%EA%B0%9C%EC%A0%95).pdf/download
function enter(input) {
// 메세지에 대한 말풍선을 형성하는 함수 시작!
 const messagesContainer = document.getElementById("messages");
        // promise then을 이용했지만 두번째 ajax에서 Controller까지 응답이 없음 그렇다고 오류가 나는 것은 아니었다. 응답이 늦다. 아니 안온다...무한 대기
        // ajax에 순서 부여
        $.ajax({
               url:"./get",
               type:'post',
                data:{
                  question : input
                 },
                 success: function(data) {
                       $.ajax({
                                 url:"./service",
                                 type:'post',
                                 data:{},
                                 success: function(data) {
                                            var text = data.Text;
                                            botText.innerText =`${text}`;
                                            // 파일을 업로드해서 보여주는 경우를 위해서 말풍성 형성
                                           if(data.Link !=""){
                                                 var link_html=data.Link;
                                                  link_html=link_html.replaceAll("\\","");
                                                  //console.log(link_html);
                                                  let linkDiv = document.createElement("div");
                                                  linkDiv.id = "bot";
                                                  linkDiv.className = "bot response";
                                                  linkDiv.innerHTML = `<span>${link_html}<span>`;
                                                  messagesContainer.appendChild(linkDiv);
                                                  messagesContainer.scrollTop =
                                                  messagesContainer.scrollHeight - messagesContainer.clientHeight;
                                            }//if
                                    }//success
                                 }); //1차 ajax

                 }//2차 sucess
              }); // 2차 ajax


        // Client의 응답 말풍선 만들기
        let userDiv = document.createElement("div");
        userDiv.id = "user";
        userDiv.className = "user response";
        userDiv.innerHTML = `<span>${input}</span>`;
         messagesContainer.appendChild(userDiv);

         //서버의 응답 말풍선 만들기
         let botDiv = document.createElement("div");
         let botText = document.createElement("span");
         botDiv.id = "bot";
         botDiv.className = "bot response";
         botText.innerText = "Typing...";
         botDiv.appendChild(botText);
         messagesContainer.appendChild(botDiv);


         // 창에 알맞은 크기로
         messagesContainer.scrollTop =
         messagesContainer.scrollHeight - messagesContainer.clientHeight;











 }
