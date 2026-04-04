public class WrapperClass {
    public static void main(String[] args) {
        int num = 10;
        Integer num1 = num; // Auto-Boxing
        System.out.println(num1);

        int num2 = num1 + 10; //Auto-unboxing
        System.out.println(num2);

        String str = "10101";
        int num3 = Integer.parseInt(str);
        System.out.println(num3);
    }
}
