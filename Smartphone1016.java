package oct16;

public class Smartphone1016 {
    private String company;
    private String os;

    public Smartphone1016(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company + "," +os;
    }
}
