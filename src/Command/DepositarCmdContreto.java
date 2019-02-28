package Command;

public class DepositarCmdContreto implements IOperacionCmd
{
    private CuentaBancaria cuenta;
    private double monto;

    public DepositarCmdContreto(CuentaBancaria cuenta, double monto)
    {
        this.cuenta = cuenta;
        this.monto = monto;
    }
    
    
    @Override
    public void execute()
    {
        this.cuenta.Depositar(monto);
    }
}
