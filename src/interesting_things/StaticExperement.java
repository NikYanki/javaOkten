package interesting_things;

public class StaticExperement {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        increment1(num1);
        increment2(num2);
        System.out.println(num1+"|"+num2);


    }
    public static void increment1(int num){
        num+=1;
    }
    public static int increment2(int num){
        return num+=1;
    }
}
