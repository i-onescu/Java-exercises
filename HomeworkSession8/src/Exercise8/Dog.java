package Exercise8;

public class Dog implements Mammal{
    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void walk() {
        System.out.println("Dog walking...");
    }
}
