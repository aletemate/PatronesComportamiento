package Observer;
public class PesoMexicanoObservador extends Observador
{
     private final double VALOR_CAMBIO = 19.17;

    public PesoMexicanoObservador(Subject sujeto) 
    {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
     
    @Override
    public void actualizar()
    {
        System.out.println("MNX: $" + (sujeto.getEstado() * this.VALOR_CAMBIO));
    }
}
