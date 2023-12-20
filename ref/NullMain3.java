package ref;

public class NullMain3 {
    public static void main(String[] args) {


        BigData bigdata = new BigData();
        bigdata.data = new Data();//참조변
        System.out.println("bigdata = " + bigdata.count);
        System.out.println("bigdata = " + bigdata.data);

        System.out.println("bigdata.data.value = " + bigdata.data.value);
        

    }
}
