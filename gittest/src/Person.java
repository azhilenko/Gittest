public class Person {               //Все поля по умолчанию паблик, кроме которых мы переназначили
    protected int height;
    protected float weight;
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
