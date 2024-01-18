package org.example;

import aa.bb.AA;  // 사용 후 메모리에서 삭제
/*
    1. 변수, 2. 연산자, 제어문(for, while, if, else if), 4.배열, 5. 클래스
 */
public class Main {
    // 다시 적어보기
    public static void main(String[] args) {
        int a = 10;
        int n = 20;

        AA aa = new AA();
        aa.doA();
        a = 30;

        int i = 0;
        while(i < 10) {
            i++;
        }
        for(i=0; i<10; i++) {

        }
    }
}