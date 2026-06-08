interface A{
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("In Show");
    }

    public void config(){
        System.out.println("In Config");
    }
}

public class interfacesEx{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();

    }
}