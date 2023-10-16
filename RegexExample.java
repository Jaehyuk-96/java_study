package oct16;

import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String name = "홍길동동동";
        String tel = "0101-1234-1234";
        String email = "tes@asdcom";

        boolean name_check = Pattern.matches("^[가-힣]*$", name);
        boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$",tel);
        boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?",email);


        System.out.println("이름 :" + name_check);
        System.out.println("전화번호 :" + tel_check);
        System.out.println("이메일 :" + email_check);


    }
}
