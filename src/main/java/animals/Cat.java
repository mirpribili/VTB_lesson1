package animals;

public class Cat extends Animal{

    public Cat(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    public void voice() {
        //super.voice();
        System.out.println(name + " meow");
    }

    public static void doSomething(){
        System.out.println("I am doing something");
    }

    public void catMethod() {
        System.out.println("the cat suddenly freaks out");
    }
}
