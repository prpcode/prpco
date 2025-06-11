//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

       // Scanner sc=new Scanner(System.in);

        Student st1=new Student(2,"MUMBAI","SHYAM");
      //Student st1=new Student(2,"MUMBAI","SHYAM");
        Dog d1=new Dog();
        d1.eating();
        d1.Bark();
        System.out.println(d1.color);

        st1.study();
        int k=st1.st();
        System.out.println(k);
    }


}