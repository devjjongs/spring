package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    /**
     * [1주차]자바 기초 문법 -3
     *//*
    // 메소드가 있을때
    // public, static void 에 대해서는 곧 배웁니다! 우선은 넘어갈게요.
    public static void printInfo() {
        String title = "웹개발의 봄 Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);
    }

    // 파라미터 X, 반환값 X
    public static void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }

    // 파라미터 O, 반환값 X
    public static void simpleSum(int num1, int num2) {
        System.out.println("num1 :" + num1 + ", num2: " + num2);
    }

    // 파라미터 X, 반환값 O
    public static int simpleReturn() {
        return 3;
    }

    // 파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }


    // quiz
    public static int sub(int a, int b) {
        return a - b;
    }*/


    public static void main(String[] args) {

        /**[1주차]자바 기초 문법 -1*//*
        // System.out.println("안녕, 스파르타!");

        // 문자열 선언
        String myName = "홍길동";
        System.out.println(myName);

        // 숫자 선언
        // 정수형 선언
        int a = 7;
        int b = 3;
        // 소숫점
        float c = 3.7f;
        // 21억 이상
        Long d = 10000000000L;*/


        /**[1주차]자바 기초 문법 -2*//*
        // 참거짓
        int myAge = 20;
        boolean isAdult = myAge > 20;
        boolean isKid = myAge <= 20;
        System.out.println(isAdult);
        System.out.println(isKid);
        System.out.println(myAge == 20);    //  true
        System.out.println(myAge != 20);    //  false

        // 배열
        List<String> myList = new ArrayList<>();
        String course1 = "웹개발의 봄 Spring";
        String course2 = "프론트엔드의 꽃 React";
        myList.add(course1);
        myList.add(course2);
        System.out.println("myList : " + myList);
        System.out.println(myList.get(1));
        myList.remove(1);
        System.out.println("myList : " + myList);*/


        /**[1주차]자바 기초 문법 -3 *//*
        // 메소드
        // 메소드가 없을때
        String title = "웹개발의 봄 Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);

        // 메소드가 있을때
        printInfo();

        // 메소드 작성 규칙
         public 반환타입 메소드명(파라미터) {
               명령 모음
               return 결과값;
          }


        // 파라미터 X, 반환값 X
        simplePrint();

        // 파라미터 O, 반환값 X
        simpleSum(1, 2);

        // 파라미터 X, 반환값 O
        int ret = simpleReturn();
        System.out.println("simpleReturn ret : " + ret);

        // 파라미터 O, 반환값 O
        int ret2 = sum(10, 7);
        System.out.println("sum() ret2 : " + ret2);


        // quiz
        int ret3 = sub(9, 2);
        System.out.println(ret3);*/


        /**[1주차]자바 기초 문법 -4*/
        // 반복문
        // 과일 목록 준비
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");
        System.out.println("fruits list : " + fruits);
        System.out.println("=====");

        // 반복문 없을때
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));
        System.out.println(fruits.get(4));
        System.out.println(fruits.get(5));
        System.out.println(fruits.get(6));
        System.out.println(fruits.get(7));
        System.out.println(fruits.get(8));
        System.out.println(fruits.get(9));
        System.out.println(fruits.get(10));
        System.out.println(fruits.get(11));
        System.out.println(fruits.get(12));
        System.out.println("=====");

        // 반복문 있을때
        for (int i = 0; i < 13; i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }
        System.out.println("-----");
        // 매번 13개, 14개, 12개.. 개수 세어줘야 할까요?

        // 반복문 완성
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }

        // 연습퀴즈
        List<String> celebs = new ArrayList<>();
        celebs.add("아이유");
        celebs.add("린다G");
        celebs.add("은비");
        celebs.add("금비");
        celebs.add("비");
        celebs.add("차은우");
        celebs.add("남주혁");
        celebs.add("수지");
        celebs.add("정우성");
        celebs.add("제니");
        celebs.add("정국");

        System.out.println("==연습퀴즈==");
        for (int i = 0; i < celebs.size(); i++) {
            String celeb = celebs.get(i);
            System.out.println(celeb);
        }

        // 조건문
        int age = 20;
        if (age > 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

    }
}
