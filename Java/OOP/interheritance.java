public class interheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(5, 2);
        int r3 = obj.multi(5, 2);
        int r4 = obj.div(4, 2);
        double r5 = obj.power(2, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
