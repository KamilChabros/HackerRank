public class Main {

    public static <T> void printArray(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {

        Main obj = new Main();
        obj.printArray(1);
        obj.printArray(2);
        obj.printArray(3);
        obj.printArray("Hello");
        obj.printArray("World");
//        obj.printArray(2.00);
    }
}
