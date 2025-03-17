package task2;

public class Cat2 implements Meowable2 {
    //поля
    private String name;
    private int meowCount;
    //свойства
    public String getName(){
        return this.name;
    }
    public int getMeowCount() {
        return meowCount;
    }
    //конструкторы
    public Cat2 (String name){
        this.name = name;
        this.meowCount = 0;
    }
    //методы
    public String toString (){
        return "кот: " + this.name;
    }
    //@Override
    public void meow(){
        System.out.print(this.name + ": мяу!");
        this.meowCount++;
    }
}