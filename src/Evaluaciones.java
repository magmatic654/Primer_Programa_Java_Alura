import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double grade = 0;
        double average = 0;
        double totalEvaluations = 0;

        while (grade != -1){
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            grade = keyboard.nextDouble();

            if (grade != -1){
                average += grade;
                totalEvaluations ++;

            }
        }
        average /= totalEvaluations;
        System.out.println("La calificacion media de la pelicula es: " + average);
    }
}
