/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author Administrador
 */
public class RetirarCmdConcreto implements IOperacionCmd
{
    private CuentaBancaria cuenta;
    private double monto;

    public RetirarCmdConcreto(CuentaBancaria cuenta, double monto)
    {
        this.cuenta = cuenta;
        this.monto = monto;
    }
    
    
    
    @Override
    public void execute()
    {
        this.cuenta.Retirar(this.monto);
    }
}
