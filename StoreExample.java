package oct16;


public class StoreExample {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome!");
        StoreDTO storeDTO = StoreDTO.builder()
                .name("가게이름")
                .lat(37.1234)
                .lng(1237.23322)
                .menu("쌈밥")
                .build();

        //순서 바꿔도 마음대로 쓸 수 있음.

        System.out.println(storeDTO);
    }
}
