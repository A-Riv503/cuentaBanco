import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String numeroCuenta= JOptionPane.showInputDialog("digite el numero de cuenta");
        int continuar=1;
        CuentaBancaria cuenta_bancaria=new CuentaBancaria(numeroCuenta,0.0);




    while(continuar==1){
        String aceptar=JOptionPane.showInputDialog("desea 1-depositar, 2-retirar, 3-obtener su saldo");//ingresar transaccion que desea

        switch (aceptar){
            case "1":

                float cantidadDepostiar=Float.parseFloat(JOptionPane.showInputDialog("INGRESE LA CANTIDAD A DEPOSITAR"));
                cuenta_bancaria.depositar(cantidadDepostiar);
                System.out.println("el saldo es de "+cuenta_bancaria.saldo);
                break;

            case "2":

                float cantidadRetirar=Float.parseFloat(JOptionPane.showInputDialog("INGRESE LA CANTIDAD A RETIRAR"));
                if(cuenta_bancaria.saldo==0){
                    System.out.println("no tiene saldo en su cuenta");
                }else{
                    cuenta_bancaria.retirar(cantidadRetirar);
                    System.out.println("el saldo despues de retirar es de "+cuenta_bancaria.saldo);

                }

                break;


            case "3":
                System.out.println("su saldo es de: "+cuenta_bancaria.obtenerSaldo());
                break;

        }
     continuar=Integer.parseInt(JOptionPane.showInputDialog("DESEA HACER OTRA TRANSACCION 1-SI 2-NO"));

    }



    }
}