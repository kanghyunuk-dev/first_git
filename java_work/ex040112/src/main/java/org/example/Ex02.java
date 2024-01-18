package org.example;

import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("문자열 입력");
//        String str = scan.next();
//        System.out.println("숫자 입력");
//        int n = scan.nextInt();
//
//        System.out.println(str);
//        System.out.println(n);
//
//        // i = 0,1,2,3,4 일때 동작 5번 반복
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        }
        String str = "abcde";
        System.out.println("String = " + str);
        char[] character = str.toCharArray();
        System.out.println("charArr = " + character[0]);
        System.out.println("charArr = " + character[1]);
        System.out.println("charArr = " + character[2]);
        System.out.println();
        System.out.println("characterLeng = " + character.length);
        String[] strArr = new String[character.length];
        System.out.println("strArrLeng = " + strArr.length);
        System.out.println("strArr" + String.valueOf(strArr[0]));
        System.out.println("strArrInput");
        for(int i=0; i<strArr.length; i++) {
            strArr[i] = String.valueOf(character[i]);
            System.out.println("strArr = " + strArr[i]);
        }
        System.out.println("strArr = " + strArr[4]);
        System.out.println(strArr[4].equals("e"));
        String let = "";
        System.out.println("let = " + let);
        System.out.println(let.equals(""));
        if(let.equals("")) {
            System.out.println("let check = " + true);
        }
    }
}
