package refExam;



public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println(totalAmount);
    }

    private static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price*order.quantity;

        }
        return totalAmount;
    }

    private static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.productName+order.price+order.quantity);

        }
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;

    }
}
