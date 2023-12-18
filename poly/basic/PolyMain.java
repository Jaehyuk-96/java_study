package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //poly.childMethod(); 자식메서드 참조불가
    }
}
