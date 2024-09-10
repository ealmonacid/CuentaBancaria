public class CuentaBancaria {
    //Atributos
    private String titular;
    private double saldo=0;
    private String numeroCuenta;

    //Constructor vacio
    public CuentaBancaria() {
    }

    //Contructor con parametros
    public CuentaBancaria(String titular, double saldo, String numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    //Getter and Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //ToString
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }

    //Metodo para consignar dinero
    public void consignarDinero(double monto){
        saldo=saldo+monto;
        System.out.println("Has depositado $"+monto);
        System.out.println("Tu saldo actual es $"+saldo);
    }

    //Metodo para retirar dinero
    public void retirarDinero(double retiro){
            if(saldo>retiro || saldo==retiro){
                saldo=saldo-retiro;
                System.out.println("Has retirado $"+retiro);
                System.out.println("Tu saldo actual es $"+saldo);
            } else if(saldo<retiro){
                System.out.println("El valor a retirar es mayor al saldo");
            }
    }

    //Metodo para mostrar informacion
    public void mostrarInformacion(){
        System.out.println("INFORMACIÓN DE TU CUENTA");
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: $"+saldo);
        System.out.println("Numero de cuenta: "+numeroCuenta);
    }
}
