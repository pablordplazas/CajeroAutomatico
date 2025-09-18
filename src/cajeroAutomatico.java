//necesito usar constructor vacio, con todos los metodos, tostring, metodo ingresar, metodo retirar
//extreccion rapida "20% de el saldo" de debe validar si la cuenta tiene el dinero suficiente para
//para realizar las intrucciones, metodos, consulta, saldo.
public class cajeroAutomatico {


    private double numerodecuenta;
    private double ceduladelcliente;
    private double Saldoactual;

    //Constructor vacio


    public cajeroAutomatico() {

    }
    //Constructor con parametro


    public cajeroAutomatico(double numerodecuenta, double ceduladelcliente, double saldoactual) {
        this.numerodecuenta = 123456789;
        this.ceduladelcliente = 1014271382;
        Saldoactual = 100.000;
    }
    //Getter-Setter

    //Get

    public double getNumerodecuenta() {
        return numerodecuenta;
    }

    public double getCeduladelcliente() {
        return ceduladelcliente;
    }

    public double getSaldoactual() {
        return Saldoactual;
    }

    //Set


    public void setNumerodecuenta(double numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public void setCeduladelcliente(double ceduladelcliente) {
        this.ceduladelcliente = ceduladelcliente;
    }

    public void setSaldoactual(double saldoactual) {
        Saldoactual = saldoactual;
    }

    @Override
    public String toString() {
        return "cajeroAutomatico{" +
                "numerodecuenta=" + numerodecuenta +
                ", ceduladelcliente=" + ceduladelcliente +
                ", Saldoactual=" + Saldoactual +
                '}';
    }
}