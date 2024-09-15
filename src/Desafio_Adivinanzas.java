import java.util.Random;
import java.util.Scanner;

public class Desafio_Adivinanzas {
    public static void main(String[] args) {
        int random_number = new Random().nextInt(100);
        int user_election;
        int left_attepts = 5;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bienvenido al juego de las adivinanzas \n Buena suerte aventurero!");
        while (left_attepts > 0) {
            System.out.printf("Tienes %d intentos para adivinar un numero entre 1 y 100. \n", left_attepts);
            System.out.println("Elige el numero de tu eleccion:");
            user_election = keyboard.nextInt();

            if (user_election == random_number){
                System.out.println("Felicidades, acertaste el numero secreto!");
                break;
            } else if (user_election > random_number){
                System.out.printf("El numero elegido %d es mas alto que el numero a adivinar", user_election);
            }else{
                System.out.printf("El numero elegido %d es menor que el numero a adivinar", user_election);
            }
            System.out.println();

            if (left_attepts - 1 == 0){
                System.out.println("Vuelve a intentarlo! Juego Terminado");
            }

            left_attepts --;
        }
    }
}
