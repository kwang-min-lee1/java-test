import java.util.Scanner;

// 문제5. 상품 주문 클래스 만들기.
public class Test5 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("주문 개수를 입력해주세요: ");
            int orderNumber = scanner.nextInt();
            ProductOrder[] orders = new ProductOrder[orderNumber];

            for (int i = 0; i < orderNumber; i++) {
                System.out.println(i+1 +"번째 주문을 입력해주세요");

                System.out.print("상품명 : ");
                String productName = scanner.next();
                System.out.print("가격 : ");
                int price = scanner.nextInt();
                System.out.print("수량 : ");
                int quantity = scanner.nextInt();
                scanner.nextLine();


                orders[i] = createOrder(productName, price, quantity);
            }


            printOrder(orders);


            int totalPayment = getTotalPayment(orders);
            System.out.println("총 결제금액 : " + totalPayment + "원");
        }


        private static void printOrder(ProductOrder[] orders) {
            for (ProductOrder order : orders) {
                System.out.println("상품명: " + order.productName + "," +
                        " 가격 :" + order.price + ", 수량 : " + order.quantity);
            }
        }
// 문제5. 상품 주문 클래스 만들기

        private static int getTotalPayment(ProductOrder[] orders) {
            int totalPayment = 0;
            for (ProductOrder order : orders) {
                totalPayment += order.price * order.quantity;
            }
            return totalPayment;
        }


        public static ProductOrder createOrder(String productName, int price, int quantity) {
            ProductOrder productOrder = new ProductOrder();
            productOrder.productName = productName;
            productOrder.price = price;
            productOrder.quantity = quantity;
            return productOrder;
    }
}
