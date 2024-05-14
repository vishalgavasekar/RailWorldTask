package Hierarchical;

public class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    void eat(String food) {
        System.out.println("Cat is eating " + food);
    }
}
