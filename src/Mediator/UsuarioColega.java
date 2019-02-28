
package Mediator;

public class UsuarioColega extends Colleague
{

    public UsuarioColega(IMediador mediator) 
    {
        super(mediator);
    }

    @Override
    public void Recibir(String mensaje)
    {
        System.out.println("[USUARIO] recibe: " + mensaje);
    }
    
}
