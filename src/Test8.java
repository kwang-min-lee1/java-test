// 문제8. 수학 유틸리티 클래스

import static java.lang.Long.sum;
import static java.lang.Math.max;
import static java.lang.Math.min;;

public class Test8 {
    public static void main(String[] args) {
        System.out.println("Max of 10, 20: " + max(10, 20));
        System.out.println("Min of 10, 20: " + min(10, 20));
        System.out.println("Sum of 10, 20: " + sum(10, 20));
        System.out.println("Factorial of 5: " + MathUtility.factorial(5));
    }
}
