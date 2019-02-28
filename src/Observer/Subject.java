
package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject
{
    private List<Observador> observadores = new ArrayList<>();
    private double estado;

    public double getEstado()
    {
        return estado;
    }

    public void setEstado(double estado) 
    {
        this.estado = estado;
        notificarTodosObservadores();
    }
    public void agregar(Observador observador)
    {
        this.observadores.add(observador);
    }

    private void notificarTodosObservadores() 
    {
        this.observadores.forEach(observador -> observador.actualizar());
    }
}
