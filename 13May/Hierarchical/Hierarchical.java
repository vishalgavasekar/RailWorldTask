package Hierarchical;

public class Hierarchical {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();            // Calls Dog's eat() method
        cat.eat("fish");      // Calls Cat's eat(String food) method

        dog.bark();
        cat.meow();
    }
}
