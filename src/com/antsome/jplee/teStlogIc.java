package com.antsome.jplee;

import java.util.Scanner;

public class teStlogIc {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World!");

        loop1: while (true) {

            System.out.println("원하는 문제를 선택하세요.");
            System.out.println("----------------------------");
            System.out.println("1. 좌측하단직각삼각형 *찍기.");
            System.out.println("2. 정삼각형 *찍기.");
            System.out.println("3. 우측하단직각삼각형 *찍기.");
            System.out.println("4. 구구단 세로출력");
            System.out.println("5. 구구단 4단 단위 출력");
            System.out.println("0. 종료");
            System.out.println("----------------------------");
            int choiceNum = sc.nextInt();
            int num = 0;
            switch (choiceNum) {

                case 1:
                    System.out.println("1번문제 선택하셨습니다.");
                    System.out.println("원하는 Line 수를 입력하세요.");
                    num = sc.nextInt();
                    for (int i = 0; i < num; i++) {
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("---------------------");
                    break;

                case 2:
                    System.out.println("2번문제 선택하셨습니다.");
                    System.out.println("원하는 Line 수를 입력하세요.");
                    num = sc.nextInt();
                
                    for (int i = 1; i <= num; i++) { // 공백찍히는거 확인
                        for (int j = (num - 1); j >= i; j--) {
                            System.out.print(" ");
                        } // 추가시키기
                        for (int k = 0; k < (i * 2) - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    break;

                case 3:
                    System.out.println("3번문제 선택하셨습니다.");
                    System.out.println("원하는 Line 수를 입력하세요.");
                    num = sc.nextInt();
                    for (int i = 0; i < num; i++) {
                        for (int j = 0; j < num; j++) {
                            if (i < num - j - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("출력완료");
                    break;

                case 4:
                    System.out.println("4번문제 선택하셨습니다.");
                    System.out.println("원하는 단을 입력하세요.");
                    num = sc.nextInt();
                    for (int i = 2; i <= num; i++) {
                        System.out.println("-------------" + i + "단" + "--------------");
                        for (int j = 1; j <= 9; j++) {
                            System.out.println(i + " x " + j + " = " + i * j);
                        }
                    }
                    System.out.println("출력완료");
                    break;

                case 5:
                    System.out.println("5번문제 선택하셨습니다.");
                    System.out.println("원하는 단을 입력하세요. * 4단 단위로 출력됩니다.");
                    // 입력 받을 변수값 설정. 지금은 테스트를 위해 11로 셋팅
                    num = sc.nextInt();

                    for(int k=0;(k*4)+2<=num;k++){
                        for (int i=1;i<=9;i++){
                            if((k*4)+5>num){
                                for(int j =(k*4)+2;j<=num;j++){
                                    System.out.printf("%d x %d = %d\t", j, i, j*i);
                                }
                            }else if((k*4)+5<=num){
                                for(int j=(k*4)+2;j<=(k*4)+5;j++){
                                    System.out.printf("%d x %d = %d\t", j, i, j*i);
                                    }
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                    break;

                default: 
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
                    break;

                case 0:
                    System.out.println("종료합니다.");
                    break loop1;
                }

        }

    }
}
