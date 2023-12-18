package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //자식의 기능 호출 못함. 컴파일 오류발생
        //poly.childMethod();

        //다운캐스팅 (부모타입 -> 자식타입)
        Child child = (Child)poly;
        child.childMethod();
    }
}
