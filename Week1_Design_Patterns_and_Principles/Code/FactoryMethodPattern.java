public class FactoryMethodPattern {

    interface Animal {
        void speak();
    }

    static class Dog implements Animal {
        public void speak() {
            System.out.println("Dog says: Woof!");
        }
    }

    static class Cat implements Animal {
        public void speak() {
            System.out.println("Cat says: Meow!");
        }
    }

    static class AnimalFactory {
        public Animal getAnimal(String type) {
            if ("dog".equalsIgnoreCase(type)) {
                return new Dog();
            } else if ("cat".equalsIgnoreCase(type)) {
                return new Cat();
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal a1 = factory.getAnimal("dog");
        a1.speak();

        Animal a2 = factory.getAnimal("cat");
        a2.speak();
    }
}
