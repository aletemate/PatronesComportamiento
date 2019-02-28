
package Command;

public class CuentaBancaria
{
    private String idCuenta;
    private double saldo;

    public CuentaBancaria(String idCuenta, double saldo) 
    {
        this.idCuenta = idCuenta;
        this.saldo = saldo;
    }
    
    
    public void Retirar(double monto)
    {
        this.saldo = saldo - monto;
        System.out.println("[RETIRAR]: Cuenta: " + this.idCuenta + " Saldo: " + this.saldo);
    }
    public void Depositar(double monto)
    {
        this.saldo = saldo + monto;
        System.out.println("[DEPOSITAR]: Cuenta: " + this.idCuenta + " Saldo: " + this.saldo);
    }
    
}
