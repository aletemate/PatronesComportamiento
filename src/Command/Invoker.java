
package Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker
{
    private List<IOperacionCmd> operaciones = new ArrayList<>();
    
    public void RecibirOperacion(IOperacionCmd operacion)
    {
        this.operaciones.add(operacion);
    }
    
    public void RealizarOperaciones()
    {
        this.operaciones.forEach(operacion -> operacion.execute()); 
    }
    
}
