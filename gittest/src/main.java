import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Программа по вычислению возраста
//        Scanner num=new Scanner(System.in);                                           //        Ввод числа
//        int i=2018;
//        System.out.println("Enter your year of birth: ");
//        i-=num.nextInt();
//        System.out.println("Your age is - "+i);

        //Вывод введенного текста
//        Scanner str=new Scanner(System.in);                                           //        Ввод текста
//        String symbols;
//        System.out.println("Enter text in variable");
//        symbols=str.nextLine(); //для каждого типа переменных есть свою функция
//        System.out.println("My variable is: "+symbols);

        //Функция и возвращаемый метод
//        int temp = func (23, 74);             //передаем 2 значения в функцию и храним результат в переменной temp
//        System.out.println("Results is: "+temp);
        Person.summ_pers=3;
        Person.write("Quantity persons: ");
        System.out.println(Person.summ_pers + "\n");


        Person oleg = new Person();                                 //Присваиваем параметры переменным
        oleg.height = 195;
        oleg.weight = 96.7f;

        System.out.println("Height Oleg: " + oleg.height + "\nWeight: " + oleg.weight);


        Person maks = new Person(180, 78.4f);       //Вместо присваивания переменным мы передаем параметры через конструктор
//        maks.height = 180;
//        maks.weight = 78.4f;

        maks.say ("\nHi, i'm Maks");
        System.out.println("Height Maks: " + maks.height + "\nWeight: " + maks.weight);

        Student vova = new Student(156, 56f,3);
        System.out.println("Height Vova: " + vova.height + "\nWeight: " + vova.weight + vova.course);
}

    private static int func (int a, int b)    //private только для этого класса, public открыт для других классов,
    {                                         //protected только для этого класса и кслассов наследников
        int res;
        res=a+b;
        return res;                           //Возвращаем результат
    }
}
