class AA{
    public void show(){
        System.out.println("in show");
    }

    class BB{
        public void config(){
            System.out.println("in config");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        AA obj = new AA();
        obj.show();

        AA.BB obj1 = obj.new BB();
        obj1.config();
    }
}
