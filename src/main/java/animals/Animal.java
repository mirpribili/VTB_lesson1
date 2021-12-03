package animals;

public abstract class Animal {
    String name;
    String color;
    int age;
    public Animal(String name, String color, int age){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
    public abstract void voice();

    public void info(){
        System.out.println(name + " " + color + " " + age);
    }
}

