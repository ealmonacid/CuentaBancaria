import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op=0;
        double saldo;
        String titular, numeroCuenta;
        //Ingresa los datos de la persona
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese el nombre del titular");
        titular=src.nextLine();
        System.out.println("Ingrese su saldo inicial");
        saldo=src.nextInt();
        src.nextLine();
        System.out.println("Ingrese su numero de cuenta");
        numeroCuenta=src.nextLine();
        //Los datos ingresados se asignan a los parametros del constructor
        CuentaBancaria cuenta1 = new CuentaBancaria(titular,saldo,numeroCuenta);
        System.out.println("¡Hola "+titular+"!");
        //Menu mediante el cual interactua con los metodos
        while(op<4){
            System.out.println("MENÚ CUENTA BANCARIA\n1.Depositar dinero\n2.Retirar dinero\n3.Mostrar informacion de la cuenta\n4.Finalizar");
            op=src.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingrese el valor a consignar");
                    cuenta1.consignarDinero(src.nextDouble());
                    break;
                case 2:
                    System.out.println("Ingrese el valor a retirar");
                    cuenta1.retirarDinero(src.nextDouble());
                    break;
                case 3:
                    cuenta1.mostrarInformacion();
                    break;
            }
        }
    }
}