import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<cajeroAutomatico> cuentas = new ArrayList<>();

        int opcion = 1;
        do {
            System.out.println("\n===== MENÚ CAJERO =====");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Extracción rápida (20%)");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Ver cuentas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número válido.");
                sc.nextLine();
                continue;
            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: // Crear cuenta
                    System.out.print("Número de cuenta: ");
                    String num = sc.nextLine();
                    System.out.print("Cédula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();

                    if (saldo < 10000) {
                        System.out.println("El saldo inicial debe ser mínimo de 10000.");
                    } else {
                        cuentas.add(new cajeroAutomatico(num, cedula, saldo));
                        System.out.println("Cuenta creada.");
                    }
                    break;

                case 2: // Ingresar
                    cajeroAutomatico c1 = buscar(cuentas, sc);
                    if (c1 != null) {
                        System.out.print("Monto a ingresar: ");
                        double monto = sc.nextDouble();
                        sc.nextLine();
                        c1.ingresar(monto);
                    }
                    break;

                case 3: // Retirar
                    cajeroAutomatico c2 = buscar(cuentas, sc);
                    if (c2 != null) {
                        System.out.print("Monto a retirar: ");
                        double monto = sc.nextDouble();
                        sc.nextLine();
                        c2.retirar(monto);
                    }
                    break;

                case 4: // Extracción rápida
                    cajeroAutomatico c3 = buscar(cuentas, sc);
                    if (c3 != null) c3.extraccionRapida();
                    break;

                case 5: // Consultar saldo
                    cajeroAutomatico c4 = buscar(cuentas, sc);
                    if (c4 != null) c4.consultarSaldo();
                    break;

                case 6: // Ver todas las cuentas
                    for (cajeroAutomatico c : cuentas) {
                        System.out.println(c);
                    }
                    break;

                case 0:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion !=0 );

        sc.close();
    }

    // Metodo para encontrar la cuenta
    public static cajeroAutomatico buscar(ArrayList<cajeroAutomatico> cuentas, Scanner sc) {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas.");
            return null;
        }
        System.out.print("Ingrese número de cuenta: ");
        String num = sc.nextLine();
        for (cajeroAutomatico c : cuentas) {
            if (c.getNumeroCuenta().equals(num)) return c;
        }
        System.out.println("Cuenta no encontrada.");
        return null;
    }
}
