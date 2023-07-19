public class CuentaBancaria {

    String numeroCuenta;
    float saldo;

    public CuentaBancaria(String numeroCuenta, float saldo){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }


    public float depositar(float cantidadDepostiar){
        float cantidadTotal=cantidadDepostiar+saldo;
        return cantidadTotal;

    }

    public float retirar(float cantidadRetirar){
        float saldoTotal=saldo-cantidadRetirar;
        return  saldoTotal;
    }

    public void cantidadDepostada(){
        System.out.println("la saldo total de la cuenta es de ");
    }






}
