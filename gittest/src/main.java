import java.util.Scanner;

public class main {
    public static void main(String[] args) {

//        Scanner num=new Scanner(System.in);                                           //        Ввод числа
//        int i=2018;
//        System.out.println("Enter your year of birth: ");
//        i-=num.nextInt();
//        System.out.println("Your age is - "+i);


//        Scanner str=new Scanner(System.in);                                           //        Ввод текста
//        String symbols;
//        System.out.println("Enter text in variable");
//        symbols=str.nextLine(); //для каждого типа переменных есть свою функция
//        System.out.println("My variable is: "+symbols);

        func (23, 74);
    }

    private static void func (int a, int b)
    {
        int res;
        res=a+b;
        System.out.println("Results is: "+res);
    }
}
