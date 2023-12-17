package math;

public class MathArrayUtils {

    private MathArrayUtils(){
        //MATHARRAYUTILS 생성을 막음
    }
    public static int sum(int[] values) {//total을 0으로 초기화하고 total = total+value로 for문돌면서 합구함
        int total = 0;
        for(int value : values){
            total +=value;
        }
        return total;
    }

    public static double average(int[] values) {//total에서 values length 나눔 double
        return (double)sum(values)/values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for(int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = 0;
        for(int i =0; i<values.length; i++){
            for (int value : values) {
                if(value > maxValue){
                    maxValue = value;
                }
            }
        }
        return maxValue;
    }
}
