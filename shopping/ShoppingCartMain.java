package shopping;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();//객체생성
        //상품넣기
        Item item1 = new Item("마늘", 2000,2);
        Item item2 = new Item("상추", 3000, 4);
        //장바구니 addItem으로추가
        cart.addItem(item1);
        cart.addItem(item2);

        //전체가격 출력하기
        cart.displayItems();
    }
}


