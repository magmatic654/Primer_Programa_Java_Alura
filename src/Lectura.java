import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String movie = keyboard.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int realaseDate = keyboard.nextInt();
        System.out.println("Por ultimo dinos que nota le das a esta Pelicula");
        double note = keyboard.nextDouble();

        System.out.println(movie);
        System.out.println(realaseDate);
        System.out.println(note);

    }
}
