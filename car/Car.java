package car;

public class Car {
    private static int carTotalCount;
    private String name;


    public Car(String name){
        System.out.println("차량구입, 이름 :"+ name);
        this.name = name;
        carTotalCount++;
    }

    public static void showTotalCars(){
        System.out.println("구매한차량수:" + carTotalCount++);

    }
}
