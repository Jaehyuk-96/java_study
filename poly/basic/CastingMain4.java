package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();//문제 x

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod(); //런타임 오류 -ClassCastException
        child2.childMethod();//실행불가 메모리에 child 인스턴스가 없음
    }
}
