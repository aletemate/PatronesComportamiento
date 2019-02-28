
package Observer;

public class PesoColombianoObservador extends Observador
{
    private final double VALOR_CAMBIO = 2996;

    public PesoColombianoObservador(Subject sujeto)
    {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    
    
    @Override
    public void actualizar()
    {
        System.out.println("COP: $" + (sujeto.getEstado() * this.VALOR_CAMBIO));
    }
}
