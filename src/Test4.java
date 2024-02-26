
// 문제4. 2차원 배열의 합계 구하기.
public class Test4 {
    public static void main(String[] args) {

        int[][] matrixs = {
                {1,2,3,4},
                {5,6,7,8}
        };
        int sum =0;

        for (int[] matrix : matrixs) {
            for (int i : matrix ) {
                sum += i;
            }
        }
        System.out.println("2차원 배열의 모든 요소의 합계:" + sum );
    }

}
