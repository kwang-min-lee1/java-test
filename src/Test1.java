
// 문제1. 구구단 출력하기

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 단을 입력해주세요: ");
        int n = scanner.nextInt();

        for (int i = 1; i <=9; i++) {
            System.out.println(n + "*" + i + "=" + (n*i));

        }
    }
}
