package shopping;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){//물건 장바구니 추가
        if(itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount++] = item;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i< itemCount; i++){//for 문으로 장바구니 상품 하나씩 출력, 이름, 상품가격
            Item item = items[i];
            System.out.println("상품명:" + item.getName()+", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체가격합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for(int i = 0; i<itemCount; i++){
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

}
