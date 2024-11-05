public class AnimalTest{
    public static void main(String args[]){
        PolymorphismDemo demo = new PolymorphismDemo();
        demo.PolymorphismUsingFor();
        Cat dog = new Cat(); //fajok,
        demo.lyric(dog);
    }
}

abstract class Animal {
    public abstract String bark();
}

class Dog extends Animal{
    @Override 
    public String bark(){
        return "汪汪!";
    }
}

class Cat extends Animal{
    @Override 
    public String bark(){
        return "喵 ~ !";
    }
}

class Cow extends Animal{
    @Override 
    public String bark(){
        return "哞 ~ !";
    }
}

class PolymorphismDemo{
    public void PolymorphismUsingFor(){
        Animal[] animals = new Animal[3];
        animals [0] = new Dog();
        animals [1] = new Cat();
        animals [2] = new Cow();

        for (int i=0;i<animals.length; i++){
            System.out.println(animals[i].bark());
        }
    }

    public void lyric(Animal animal){
        System.out.println("隔壁傳來叫聲:"+animal.bark());
    }
}