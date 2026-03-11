class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand);
        System.out.println(price);
        System.out.println(name);
        System.out.println("");
    }
}

public class StaticVar {
    public static void main(String[] args) {
      Mobile obj1 = new Mobile();
      obj1.brand = "Samsung";
      obj1.price = 100000;
      Mobile.name = "SmartPhone";

      obj1.show();

      Mobile obj2 = new Mobile();
      obj2.brand = "Apple";
      obj2.price = 200000;
      Mobile.name = "Phone";
      
      obj1.show();
      obj2.show();

    }
}

// Understanding Static Keyword and usage of static variable