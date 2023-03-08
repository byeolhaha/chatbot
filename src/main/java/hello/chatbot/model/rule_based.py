#jar 파일 내부에 있을 수 없습니다.
# 외부로 빼주셔야 합니다.

import pandas as pd
import os.path


import sys
import io
sys.stdout = io.TextIOWrapper(sys.stdout.detach(), encoding='utf-8')
sys.stderr = io.TextIOWrapper(sys.stderr.detach(), encoding='utf-8')


def chat(request):
    file_path = "train_data_min_rule.xlsx"
    abs_file_path = os.path.abspath(file_path)
    train_data = pd.read_excel(abs_file_path)
    #train_data = pd.read_excel("D:/tool/chatbot/src/main/resources/static/train_data_min_rule.xlsx")# 로컬 연습
    chat_dic = {}
    row=0
    for rule in train_data['rule']:
        chat_dic[row]=rule.split('|')
        row+=1
    for k,v in chat_dic.items():
        chat_flag=False
        for word in v:
            if word in request:
                chat_flag = True
            else:
                chat_flag = False
                break
        if chat_flag:
            return print(train_data['A'][k])

    return print('더 공부할게요🥲')