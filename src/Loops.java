import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double grade = 0;
        double average = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            grade = keyboard.nextDouble();
            average += grade;
        }
        average /= 10;
        System.out.println("La calificacion media de la pelicula es: " + average);

    }
}
