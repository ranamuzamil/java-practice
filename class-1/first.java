import java.util.Scanner;
class Firtclass{
    
    public static void main(String args[]){

        // int a = 10;
        // int b = 25;
        // int sum = a + b;
        // int c = 110;
        // int diff = c - sum;
        // System.out.println(diff);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = sc.nextLine();
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();
        //  System.out.println("Hello, " + name + "! You are " + age + " years old.");
        //  sc.close();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long calculatation = (a + b) / (a * c);
        System.out.println(calculatation);
        sc.close();
    }
}