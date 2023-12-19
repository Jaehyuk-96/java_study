package shopping;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        //이름을 가져오는 메서드
        return name;
    }

    public int getTotalPrice(){
        //전체 가격구하기
        return price * quantity;
    }
}
