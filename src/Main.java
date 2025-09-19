public class Main {
    public static void main(String[] args) {
        // Crear un objeto con el constructor con parámetros
        cajeroAutomatico cuenta1 = new cajeroAutomatico(123456, 987654321, 1000.0);

        // Mostrar el objeto con toString
        System.out.println(cuenta1);

        // Ingresar dinero
        cuenta1.ingresar(500);

        // Retirar dinero
        cuenta1.retirar(300);

        // Intentar retirar más de lo que hay
        cuenta1.retirar(2000);

        // Hacer extracción rápida
        cuenta1.extraccionRapida();

        // Consultar saldo
        cuenta1.consultarSaldo();

        // Crear un objeto con el constructor vacío y setear datos
        cajeroAutomatico cuenta2 = new cajeroAutomatico();
        cuenta2.setNumerodecuenta(654321);
        cuenta2.setCeduladelcliente(123456789);
        cuenta2.setSaldoactual(200);

        // Probar métodos
        cuenta2.consultarSaldo();
        cuenta2.ingresar(100);
        cuenta2.extraccionRapida();
        cuenta2.consultarSaldo();
    }
}
