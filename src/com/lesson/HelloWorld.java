import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
    }

    public static void menu(Scanner scanner) {
        System.out.println("Check one of: ");
        System.out.println("1: find a car");
        System.out.println("2: find all car");
        System.out.println("0: return on previous menu");
        switch (scanner.nextInt()) {
            case 0: {
                menu(scanner);
                break;
            }
            case 1: {
                callFindCarByIdMenuItem(scanner);
                menu(scanner);
            }
        }
    }

    public static void callFindCarByIdMenuItem(Scanner scanner) {
        System.out.println("enter car number");
        String s = scanner.nextLine();
        System.out.println("car with number " + s + " not found!");
        System.out.println("try again or type 0");
        if (scanner.hasNextInt() && scanner.nextInt() == 0) {
            return;
        } else {
            callFindCarByIdMenuItem(scanner);
        }
    }
}
