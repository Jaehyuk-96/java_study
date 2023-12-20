package shop;

public class Item {//멤버변수 private으로 선언
    private String name;
    private int price;

    public Item(String name, int price) {//생성자
        this.name = name;
        this.price = price;
    }

    public int getPrice(){//가격표시
        return price;
    }

    public void print(){//print표시
        System.out.println("이름:"+name+"가격:"+price);
    }
}
