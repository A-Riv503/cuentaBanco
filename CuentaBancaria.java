public class CuentaBancaria {

    String numeroCuenta;
    double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }


    public double depositar(float cantidadDepostiar){
        saldo+=cantidadDepostiar;
        return saldo;

    }

    public double retirar(float cantidadRetirar){
        saldo=saldo-cantidadRetirar;
        return  saldo;
    }

    public double obtenerSaldo(){
        return saldo;
    }






}
