package mentor_class;

public class Task1 {
    public static void main(String[] args) {


        int number = 10;
        System.out.println("The number is: " + number);


        String message = getMessage();
        System.out.println(message);
    }

    public static String printMessage() {
        System.out.println("Hello from the printMessage method!");
        return null;
    }
}