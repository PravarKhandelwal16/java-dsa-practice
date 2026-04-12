abstract class car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Music Playing");
    }
}

abstract class Audi extends car{
    public void drive(){
        System.out.println("Driving...");
    }
}

class updatedAudi extends Audi{
    public void fly(){
        System.out.println("Flying...");
    }
}

public class abstractEx {
    public static void main(String[] args) {
        car obj = new updatedAudi();

        obj.drive();
        obj.playMusic();
        obj.fly();
        
    }
}
