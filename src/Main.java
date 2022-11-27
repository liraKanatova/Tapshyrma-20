import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Parallelepiped parallelepiped = new Parallelepiped();

        try {
            parallelepiped.setLength(length);
        } catch (SquareException e) {
            System.err.println(e.getMessage());
        }try {
            parallelepiped.setWidth(width);
        }catch (InputMismatchException | SquareException e){
            System.err.println(e.getMessage());
        }
        try {
            parallelepiped.setHeight(height);
        }catch (SquareException e){
            System.err.println(e.getMessage());

        }
    }
        }


