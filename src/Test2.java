
// 문제2. 간단한 계산기 만들기

import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요: ");
        double first = scanner.nextDouble();

        System.out.print("두번째 숫자를 입력하세요: ");
        double second = scanner.nextDouble();

        System.out.print("연산자를 입력하세요: ");
        String operator = scanner.next();

        switch (operator) {
            case  "+":
                System.out.println(first + second);
                break;
            case  "-":
                System.out.println(first - second);
                break;
            case  "*":
                System.out.println(first * second);
                break;
            case  "/":
                if (second == 0) {
                    System.out.println("0으로 나눌수 없습니다");
                } else {
                    System.out.println(first / second);
                }
                break;

        }
    }
}
