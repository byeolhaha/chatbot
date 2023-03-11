# 🔍 규칙 기반 챗봇(rule based chatbot)

## Description

> 2023.01.01.~ 2023.02.01. (개인 프로젝트)

### Summary 
- 실무자들이 자주 질문하는 데이터 : 그에 대한 질문쌍 데이터를
만들어 규칙 기반 챗봇 사이트를 만들었습니다.
- 매뉴얼 등의 파일 다운로드가 가능합니다.
- 데이터 수집이 가능하도록 DB를 구축했습니다.
- 카카오 챗봇 API 등 외부 챗봇 접속이 불가능한 공공기관 내부망 특성으로 인해
프런트 백엔드 모두 구현했습니다.

## About Project

### rule based chatbot
<img src="https://img.shields.io/badge/Language-python-green"/>


- 챗봇의 도입 목적이 특정한 업무 처리를 위한 것이고 질문과 답변 세트를 마련할 수 있는 경우 규칙 기반의 챗봇을 구현하는 것이 효과적
- 특정 업무보다는 폭넓은 대화가 필요하고 질의응답 세트를 정의하기 어려운 경우에는 인공신경망 기반의 챗봇을 구현한다. 

- 데이터가 적어 Ko-Bert를 이용해서 챗봇을 구현했지만 모델이 너무 무거워 답변이 20분 뒤에 오는 문제가 발생하여 규칙 기반 챗봇으로 변경

### Web
<img src="https://img.shields.io/badge/Language-Java-green" /><img src="https://img.shields.io/badge/Server-Naver%20Cloud-blue"/><img src="https://img.shields.io/badge/DB-Naver%20Cloud%20DB%20for%20MySQL-yellow"/>
- 사용자로부터 잘못된 답변 데이터를 수집
  - 규칙 기반 챗봇의 경우 대용량의 데이터가 필요하기 때문에 그때그때 사용자로부터
이상한 답변이 가는 데이터를 수집할 수 있도록 DB를 구축했습니다.
  - 사용자는 이상한 답변이 오면 "바보:이상한 답변을 받은 질문"을 서버에 보내고
그 데이터를 DB에 쌓이게 됩니다.
  - 개발자는 DB에 쌓인 데이터를 보고 올바른 질문과 답변 쌍을 업데이트 합니다.
- 네이버 클라우드의 서버를 생성하여 구축하였습니다.
- DB는 네이버 클라우드의 DB for MySQL을 이용하여 구축하였습니다.
- 사용자가 메뉴얼 등의 파일을 다운로드 받을 수 있는 기능
  -  답변 데이터에 HTML의 <a>태그가 포함됨 (엑셀 파일에 있는 답변 데이터 예시입니다.)
  
     ``` 2022년 공직자 민원응대 매뉴얼을 참고해주시기 바랍니다. <a href =\"공직자_민원응대_매뉴얼(개정).pdf\" download target="_self"> 🙌 공직자 민원응대 매뉴얼 </a>```
     
  - 이를 분리하기 위해 "FileLink_Maker.class"를 통해서 태그와 내용을 분리했고 분리한 내용을 HTML로 만들기 위해서 
   JavaScript의 ```linkDiv.innerHTML = `<span>${link_html}<span>`;``` 이용
   
  - <b>하지만 Thymeleaf의 Unscape 기능을 이용해서 태그가 HTML 엔티티도 인식되지 않도록 하는 문법을 발견하여 수정할 예정입니다.</b>
  
- 규칙 기반 검색 기능은 python파일이 담당합니다. 따라서 Java에서 외부 파일인 python을 호출하기 위해 ProcessBuilder를 이용했습니다.
  - Jar 파일 내부에 python파일을 두지 않도록 주의합니다. Jar파일은 압축 파일이기 때문에 서버 입장에서는 내부 경로를 알 수 없기 때문입니다. 
  
### Excel Data
  - 질문: 답변 데이터는 엑셀 파일에 저장했습니다. 엑셀 파일의 형태는 아래와 같습니다.
![image](https://user-images.githubusercontent.com/108210958/224477305-3606ae02-3e1b-4989-8a0b-c6adb83f2cc2.png)


## Result

![image](https://user-images.githubusercontent.com/108210958/224480835-f64d2c17-a6bb-4df8-a861-dc725a23a09e.png)

- Web page Link : http://www.minwonchatbot.site/


