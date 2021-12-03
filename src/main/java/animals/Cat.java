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
    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }
        if (!(object instanceof Cat)){
            return false;
        }
        Cat another = (Cat)object;
        return this.name.equals(another.name) && this.age == another.age && this.color.equals(another.color);
    }

    @Override
    public int hashCode(){
        return color.length() * 13 + age * 71 + name.length() * 15;
    }
}
