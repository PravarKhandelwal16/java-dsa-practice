class A1{
    public void show(){
        System.out.println("This is A");
    }
}
class B1 extends A1{

    @Override
    public void show() {
        System.out.println("This is B");
    }
    
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A1 obj = new B1();
        obj.show();

        obj = new A1();
        obj.show();
    }
}
