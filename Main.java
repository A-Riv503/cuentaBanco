import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String numeroCuenta= JOptionPane.showInputDialog("digite el numero de cuenta");
        int saldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el saldo de su cuenta"));
        CuentaBancaria op=new CuentaBancaria(numeroCuenta,saldo);
        String aceptar=JOptionPane.showInputDialog("desea depositar, retirar, ontener su saldo");//ingresar transaccion que desea

        switch (aceptar){
            case "depositar":
            int cantidadDepostiar=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD A DEPOSITAR"));
            System.out.println("el saldo despues de depositar es de "+op.depositar(cantidadDepostiar));

        }

    }
}