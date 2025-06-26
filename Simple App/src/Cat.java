public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat() {
        super.eat();
        System.out.println("Actually The cat is eating fish.");
    }
}
