# ๐ ๊ท์น ๊ธฐ๋ฐ ์ฑ๋ด(rule based chatbot)

## Description

> 2023.01.01.~ 2023.02.01. (๊ฐ์ธ ํ๋ก์ ํธ)

### Summary 
- ์ค๋ฌด์๋ค์ด ์์ฃผ ์ง๋ฌธํ๋ ๋ฐ์ดํฐ : ๊ทธ์ ๋ํ ์ง๋ฌธ์ ๋ฐ์ดํฐ๋ฅผ
๋ง๋ค์ด ๊ท์น ๊ธฐ๋ฐ ์ฑ๋ด ์ฌ์ดํธ๋ฅผ ๋ง๋ค์์ต๋๋ค.
- ๋งค๋ด์ผ ๋ฑ์ ํ์ผ ๋ค์ด๋ก๋๊ฐ ๊ฐ๋ฅํฉ๋๋ค.
- ๋ฐ์ดํฐ ์์ง์ด ๊ฐ๋ฅํ๋๋ก DB๋ฅผ ๊ตฌ์ถํ์ต๋๋ค.
- ์นด์นด์ค ์ฑ๋ด API ๋ฑ ์ธ๋ถ ์ฑ๋ด ์ ์์ด ๋ถ๊ฐ๋ฅํ ๊ณต๊ณต๊ธฐ๊ด ๋ด๋ถ๋ง ํน์ฑ์ผ๋ก ์ธํด
ํ๋ฐํธ ๋ฐฑ์๋ ๋ชจ๋ ๊ตฌํํ์ต๋๋ค.

## About Project

### rule based chatbot
<img src="https://img.shields.io/badge/Language-python-green"/>


- ์ฑ๋ด์ ๋์ ๋ชฉ์ ์ด ํน์ ํ ์๋ฌด ์ฒ๋ฆฌ๋ฅผ ์ํ ๊ฒ์ด๊ณ  ์ง๋ฌธ๊ณผ ๋ต๋ณ ์ธํธ๋ฅผ ๋ง๋ จํ  ์ ์๋ ๊ฒฝ์ฐ ๊ท์น ๊ธฐ๋ฐ์ ์ฑ๋ด์ ๊ตฌํํ๋ ๊ฒ์ด ํจ๊ณผ์ 
- ํน์  ์๋ฌด๋ณด๋ค๋ ํญ๋์ ๋ํ๊ฐ ํ์ํ๊ณ  ์ง์์๋ต ์ธํธ๋ฅผ ์ ์ํ๊ธฐ ์ด๋ ค์ด ๊ฒฝ์ฐ์๋ ์ธ๊ณต์ ๊ฒฝ๋ง ๊ธฐ๋ฐ์ ์ฑ๋ด์ ๊ตฌํํ๋ค. 

- ๋ฐ์ดํฐ๊ฐ ์ ์ด Ko-Bert๋ฅผ ์ด์ฉํด์ ์ฑ๋ด์ ๊ตฌํํ์ง๋ง ๋ชจ๋ธ์ด ๋๋ฌด ๋ฌด๊ฑฐ์ ๋ต๋ณ์ด 20๋ถ ๋ค์ ์ค๋ ๋ฌธ์ ๊ฐ ๋ฐ์ํ์ฌ ๊ท์น ๊ธฐ๋ฐ ์ฑ๋ด์ผ๋ก ๋ณ๊ฒฝ

### Web
<img src="https://img.shields.io/badge/Language-Java-green" /><img src="https://img.shields.io/badge/Server-Naver%20Cloud-blue"/><img src="https://img.shields.io/badge/DB-Naver%20Cloud%20DB%20for%20MySQL-yellow"/>
- ์ฌ์ฉ์๋ก๋ถํฐ ์๋ชป๋ ๋ต๋ณ ๋ฐ์ดํฐ๋ฅผ ์์ง
  - ๊ท์น ๊ธฐ๋ฐ ์ฑ๋ด์ ๊ฒฝ์ฐ ๋์ฉ๋์ ๋ฐ์ดํฐ๊ฐ ํ์ํ๊ธฐ ๋๋ฌธ์ ๊ทธ๋๊ทธ๋ ์ฌ์ฉ์๋ก๋ถํฐ
์ด์ํ ๋ต๋ณ์ด ๊ฐ๋ ๋ฐ์ดํฐ๋ฅผ ์์งํ  ์ ์๋๋ก DB๋ฅผ ๊ตฌ์ถํ์ต๋๋ค.
  - ์ฌ์ฉ์๋ ์ด์ํ ๋ต๋ณ์ด ์ค๋ฉด "๋ฐ๋ณด:์ด์ํ ๋ต๋ณ์ ๋ฐ์ ์ง๋ฌธ"์ ์๋ฒ์ ๋ณด๋ด๊ณ 
๊ทธ ๋ฐ์ดํฐ๋ฅผ DB์ ์์ด๊ฒ ๋ฉ๋๋ค.
  - ๊ฐ๋ฐ์๋ DB์ ์์ธ ๋ฐ์ดํฐ๋ฅผ ๋ณด๊ณ  ์ฌ๋ฐ๋ฅธ ์ง๋ฌธ๊ณผ ๋ต๋ณ ์์ ์๋ฐ์ดํธ ํฉ๋๋ค.
- ๋ค์ด๋ฒ ํด๋ผ์ฐ๋์ ์๋ฒ๋ฅผ ์์ฑํ์ฌ ๊ตฌ์ถํ์์ต๋๋ค.
- DB๋ ๋ค์ด๋ฒ ํด๋ผ์ฐ๋์ DB for MySQL์ ์ด์ฉํ์ฌ ๊ตฌ์ถํ์์ต๋๋ค.
- ์ฌ์ฉ์๊ฐ ๋ฉ๋ด์ผ ๋ฑ์ ํ์ผ์ ๋ค์ด๋ก๋ ๋ฐ์ ์ ์๋ ๊ธฐ๋ฅ
  -  ๋ต๋ณ ๋ฐ์ดํฐ์ HTML์ <a>ํ๊ทธ๊ฐ ํฌํจ๋จ (์์ ํ์ผ์ ์๋ ๋ต๋ณ ๋ฐ์ดํฐ ์์์๋๋ค.)
  
     ``` 2022๋ ๊ณต์ง์ ๋ฏผ์์๋ ๋งค๋ด์ผ์ ์ฐธ๊ณ ํด์ฃผ์๊ธฐ ๋ฐ๋๋๋ค. <a href =\"๊ณต์ง์_๋ฏผ์์๋_๋งค๋ด์ผ(๊ฐ์ ).pdf\" download target="_self"> ๐ ๊ณต์ง์ ๋ฏผ์์๋ ๋งค๋ด์ผ </a>```
     
  - ์ด๋ฅผ ๋ถ๋ฆฌํ๊ธฐ ์ํด "FileLink_Maker.class"๋ฅผ ํตํด์ ํ๊ทธ์ ๋ด์ฉ์ ๋ถ๋ฆฌํ๊ณ  ๋ถ๋ฆฌํ ๋ด์ฉ์ HTML๋ก ๋ง๋ค๊ธฐ ์ํด์ 
   JavaScript์ ```linkDiv.innerHTML = `<span>${link_html}<span>`;``` ์ด์ฉ
   
  
- ๊ท์น ๊ธฐ๋ฐ ๊ฒ์ ๊ธฐ๋ฅ์ pythonํ์ผ์ด ๋ด๋นํฉ๋๋ค. ๋ฐ๋ผ์ Java์์ ์ธ๋ถ ํ์ผ์ธ python์ ํธ์ถํ๊ธฐ ์ํด ProcessBuilder๋ฅผ ์ด์ฉํ์ต๋๋ค.
  - Jar ํ์ผ ๋ด๋ถ์ pythonํ์ผ์ ๋์ง ์๋๋ก ์ฃผ์ํฉ๋๋ค. Jarํ์ผ์ ์์ถ ํ์ผ์ด๊ธฐ ๋๋ฌธ์ ์๋ฒ ์์ฅ์์๋ ๋ด๋ถ ๊ฒฝ๋ก๋ฅผ ์ ์ ์๊ธฐ ๋๋ฌธ์๋๋ค. 
  
### Excel Data
  - ์ง๋ฌธ: ๋ต๋ณ ๋ฐ์ดํฐ๋ ์์ ํ์ผ์ ์ ์ฅํ์ต๋๋ค. ์์ ํ์ผ์ ํํ๋ ์๋์ ๊ฐ์ต๋๋ค.
![image](https://user-images.githubusercontent.com/108210958/224477305-3606ae02-3e1b-4989-8a0b-c6adb83f2cc2.png)


## Result

![image](https://user-images.githubusercontent.com/108210958/224480835-f64d2c17-a6bb-4df8-a861-dc725a23a09e.png)

- Web page Link : http://www.minwonchatbot.site/


