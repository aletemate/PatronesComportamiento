
package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediador implements IMediador
{
    private List<Colleague> colegas;

    public Mediador() 
    {
        this.colegas = new ArrayList<>();
    }
    
    public void Agregar(Colleague colega)
    {
        this.colegas.add(colega);
    }
    
    @Override
    public void Enviar(String mensaje, Colleague colega)
    {
        for(Colleague item : this.colegas)
        {
            if(colega != item)
            {
                item.Recibir(mensaje);
            }
        }
    }
}
