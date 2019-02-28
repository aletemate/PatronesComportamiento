
package Mediator;

public class CeoColega extends Colleague
{

    public CeoColega(IMediador mediator) 
    {
        super(mediator);
    }

    @Override
    public void Recibir(String mensaje) 
    {
        System.out.println("[CEO] recibe: " + mensaje);
    }
    
}
