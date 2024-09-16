import java.util.Scanner;

public class bank_app {
    public static void main(String[] args) {

        String client_name = "Thor";
        String account_type = "Corriente";
        double balance = 2499.99;
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("""
                ***********************************************
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %.2f
                ***********************************************
                """, client_name, account_type, balance);
        while (true){
            System.out.println("** Escriba el número de la opción deseada **");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");
            System.out.print("\nIngrese el numero aqui: ");
            int option = keyboard.nextInt();
            switch (option){
                case 1:
                    System.out.printf("Saldo disponible: $%.2f\n", balance);
                    break;
                case 2:
                    while (true){
                        System.out.println("¿Cual cantidad deseas retirar?");
                        double withdraw = keyboard.nextDouble();
                        if (withdraw <= balance && withdraw > 0){
                            balance -= withdraw;
                            System.out.println("Retiro realizado exitosamente");
                            break;
                        }
                        System.out.println("Fondos insuficientes, prueba con otra cantidad");
                    }
                    break;
                case 3:
                    while (true){
                        System.out.println("¿Cual cantidad deseas ingresar?");
                        double deposit = keyboard.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Deposito realizado exitosamente");
                        break;
                        }
                        System.out.println("Cantidad no posible, intente nuevamente");
                    }
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("No has elegido ninguna opcion valida, intenta nuevamente");
                    break;
            }
        }
    }
}
