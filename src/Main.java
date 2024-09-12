public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to Screen Match");
        System.out.println("Movie: Matrix");

        int releaseDate = 1999;
        boolean planInclude = true;
        double filmRating = 8.2;

        double average = (8.2 + 9.5 + 9.0) / 3;

        System.out.println(average);

        String synospis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:
                """ + releaseDate + ", Su calificacion es: " + average + " Incluido: " + planInclude;
        System.out.println(synospis);
        float rating = (float) average / 2;
        System.out.println(rating + " estrellas");
    }
}