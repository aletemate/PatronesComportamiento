
package Mediator;

public class AdministradorColega extends Colleague
{

    public AdministradorColega(IMediador mediator)
    {
        super(mediator);
    }

    @Override
    public void Recibir(String mensaje)
    {
        System.out.println("[ADMINISTRADOR] recibe: " + mensaje);
    }
    
}
