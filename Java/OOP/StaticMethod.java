class Mobile{
    String brand;
    int price;
    static String name;


    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    
    static{
        name = "SmartPhone";
        System.out.println("In static block");
    }

    
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
      obj1.brand = "Samsung";
      obj1.price = 100000;
      Mobile.name = "SmartPhone";

      Mobile obj2 = new Mobile();

      obj1.show();
    }
}


// Understanding Static Block