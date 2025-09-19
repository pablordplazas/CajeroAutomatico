public class cajeroAutomatico {

    private double numerodecuenta;
    private double ceduladelcliente;
    private double saldoactual;

    // Constructor vacío
    public cajeroAutomatico() {
        this.numerodecuenta = 0;
        this.ceduladelcliente = 0;
        this.saldoactual = 0;
    }

    // Constructor con parámetros
    public cajeroAutomatico(double numerodecuenta, double ceduladelcliente, double saldoactual) {
        this.numerodecuenta = numerodecuenta;
        this.ceduladelcliente = ceduladelcliente;
        this.saldoactual = saldoactual;
    }

    // Getters
    public double getNumerodecuenta() {
        return numerodecuenta;
    }

    public double getCeduladelcliente() {
        return ceduladelcliente;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    // Setters
    public void setNumerodecuenta(double numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public void setCeduladelcliente(double ceduladelcliente) {
        this.ceduladelcliente = ceduladelcliente;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    // Metodo Ingresar
    public void ingresar(double monto) {
        if (monto > 0) {
            saldoactual += monto;
            System.out.println("Ingreso exitoso. Nuevo saldo: " + saldoactual);
        } else {
            System.out.println("Monto inválido para ingresar.");
        }
    }

    // Metodo Retira
    public void retirar(double monto) {
        if (saldoactual >= 10000) {
            System.out.println("No se puede retirar: el saldo ha alcanzado el límite de 10000.");
            return;
        }
        if (monto > 0 && monto <= saldoactual) {
            saldoactual -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldoactual);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    // Metodo Extraccion rapida
    public void extraccionRapida() {
        if (saldoactual >= 10000) {
            System.out.println("No se puede realizar extracción rápida: el saldo ha alcanzado el límite de 10000.");
            return;
        }
        double monto = saldoactual * 0.20;
        if (monto <= saldoactual) {
            saldoactual -= monto;
            System.out.println("Extracción rápida realizada. Monto: " + monto + ", Nuevo saldo: " + saldoactual);
        } else {
            System.out.println("No hay suficiente saldo para extracción rápida.");
        }
    }


    // Metodo Consulta de el saldo
    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldoactual);
    }

    // toString
    @Override
    public String toString() {
        return "cajeroAutomatico{" +
                "numerodecuenta=" + numerodecuenta +
                ", ceduladelcliente=" + ceduladelcliente +
                ", saldoactual=" + saldoactual +
                '}';
    }
}
