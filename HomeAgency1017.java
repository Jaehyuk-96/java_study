package oct17.generic3;

public class HomeAgency1017 implements Rentable1017<Home1017>{

    @Override
    public Home1017 rent() {
        return new Home1017();
    }
}
