import java.util.Scanner;

class Add{
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

public class AddDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add add = new Add();
        System.out.println("Enter Two numbers to add: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = add.add(num1,num2);
        System.out.println("The sum is: " + sum); 
        sc.close();
    }
}

// This program defines a class Add with a method to add two integers.