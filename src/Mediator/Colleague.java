
package Mediator;

public abstract class Colleague
{
   private IMediador mediador;

    public Colleague(IMediador mediator) 
    {
        this.mediador = mediator;
    }

   
    public IMediador getMediador()
    {
        return mediador;
    }

    public void Comunicar(String mensaje)
    {
        this.mediador.Enviar(mensaje, this);
    }
    
    public abstract void Recibir(String mensaje);
    
}
