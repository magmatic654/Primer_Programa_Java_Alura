public class Decisiones {
    public static void main(String[] args) {
        int releaseDate = 1999;
        boolean planInclude = true;
        double filmRating = 8.2;
        String planType = "plus";

// Codigo que prueba los operadores condicionales
        if (releaseDate >= 2022){
            System.out.println("Peliculas mas populares");
        }else {
            System.out.println("Peliculas Retro que aun vale la pena ver");
        }


        if (planInclude && planType == "plus"){
            System.out.println("Distrute de su pelicula");
        } else{
            System.out.println("Pelicula no disponible para su plan actual");
        }

//        Estructura de control Switch en Java
//        int day = 3;
//        switch (day) {
//            case 1:
//                System.out.println("El día 1 es lunes");
//                break;
//            case 2:
//                System.out.println("El día 2 es martes");
//                break;
//            case 3:
//                System.out.println("El día 3 es miércoles");
//                break;
//            // otros casos posibles...
//            default:
//                System.out.println("Día no válido");
//        }
    }
}
