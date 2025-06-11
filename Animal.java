import java.util.Scanner;

public class Animal {
    Scanner sc=new Scanner(System.in);
     //instance
     String color;
     int a;
    public void eating() {
        System.out.println("Enter the color name");
        color=sc.nextLine();
        System.out.println("Enter the parent integer value");
        int a=sc.nextInt();
        System.out.println(color +" "+"Animal is eating");

    }


}
