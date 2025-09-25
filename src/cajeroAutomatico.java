public class cajeroAutomatico {

    private String numeroCuenta;
    private String cedulaCliente;
    private double saldoActual;

    // Constante de saldo mínimo
    private static final double SALDO_MINIMO = 10000;

    // Constructor vacío
    public cajeroAutomatico() {
        this.numeroCuenta = "";
        this.cedulaCliente = "";
        this.saldoActual = 0;
    }

    // Constructor con parámetros
    public cajeroAutomatico(String numeroCuenta, String cedulaCliente, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.cedulaCliente = cedulaCliente;
        this.saldoActual = saldoInicial;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    // Métodos
    public void ingresar(double monto) {
        if (monto > 0) {
            saldoActual += monto;
            System.out.println("Ingreso exitoso. Nuevo saldo: " + saldoActual);
        } else {
            System.out.println("Monto inválido para ingresar.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto inválido.");
            return;
        }
        if (saldoActual - monto < SALDO_MINIMO) {
            System.out.println("No se puede retirar. El saldo no puede ser menor a " + SALDO_MINIMO);
            return;
        }
        saldoActual -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldoActual);
    }

    public void extraccionRapida() {
        double monto = saldoActual * 0.20;
        if (saldoActual - monto < SALDO_MINIMO) {
            System.out.println("No se puede realizar extracción rápida. El saldo no puede ser menor a " + SALDO_MINIMO);
            return;
        }
        saldoActual -= monto;
        System.out.println("Extracción rápida realizada. Monto: " + monto + ", Nuevo saldo: " + saldoActual);
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldoActual);
    }

    @Override
    public String toString() {
        return "Cuenta: " + numeroCuenta +
                " | Cédula: " + cedulaCliente +
                " | Saldo: " + saldoActual;
    }
}