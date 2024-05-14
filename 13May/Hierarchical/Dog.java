package Hierarchical;

public class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    void eat(String food) {
        System.out.println("Dog is eating " + food);
    }
}
