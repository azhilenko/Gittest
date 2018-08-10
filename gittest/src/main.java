import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*Scanner num=new Scanner(System.in);
        int i=2018;
        System.out.println("Enter your year of birth: ");
        i-=num.nextInt();
        System.out.println("Your age is - "+i);*/

        Scanner str=new Scanner(System.in);
        String symbols;
        System.out.println("Enter text in variable");
        symbols=str.nextLine();
        System.out.println("My variable is: "+symbols);
    }
}
