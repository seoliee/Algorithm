public class Main {
    public static void main(String[] args) {
        printStars();
        printStars();
        printStars();
        printStars();
        printStars();
    }

    public static void printStars() {
        for(int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}