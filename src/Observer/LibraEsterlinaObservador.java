
package Observer;

public class LibraEsterlinaObservador extends Observador
{
    private final double VALOR_CAMBIO = 0.75;

    public LibraEsterlinaObservador(Subject sujeto) 
    {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    
    @Override
    public void actualizar()
    {
        System.out.println("GBP: $" + (sujeto.getEstado() * this.VALOR_CAMBIO));
    }
}
