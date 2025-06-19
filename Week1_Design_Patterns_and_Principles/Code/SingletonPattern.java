public class SingletonPattern {

    static class Singleton {
        private static Singleton instance;

        private Singleton() {
            System.out.println("Singleton instance created!");
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("Both are the same instance.");
        }
    }
}
