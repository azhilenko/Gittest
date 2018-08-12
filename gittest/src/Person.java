public class Person {               //Все поля по умолчанию паблик, кроме которых мы переназначили
    protected int height;
    protected float weight;

    public static int summ_pers = 0;    //к этой переменной я имею доступ с любого класса блягодаря static модификатору
                                        //без создания объекта класса и метод ниже
    public static void write (String str)
    {
        System.out.print(str);
    }


    protected void say (String str)
    {
        System.out.println(str);
    }

    Person (int height, float weight)                    //Конструктор, должен быть назван как и класс
    {
        this.height = height;                            //this.height говорит о том, что мы работает переменной класса,
        this.weight = weight;                            // а = height -это параметр конструктора
    }

    Person () {}                                         //Создаем пустой конструктор чтоб присваивание работало вместе
                                                         // с конструктором передачи параметров
}
