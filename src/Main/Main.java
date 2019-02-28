
package Main;

import Command.*;
import Mediator.*;
import Observer.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        //EjemploComando();
        //EjemploObservador(10, 100);
        //EjemploMediador();
        int op;
        do
        {
            System.out.println("-----Menú----- \n"
                    + "1. Comando \n"
                    + "2. Mediador \n"
                    + "3. Observador \n"
                    + "4. Salir");
            Scanner sc = new Scanner(System.in);
            try
            {
                op = sc.nextInt();
                Menu(op);
            }catch(Exception e)
            {
                System.out.println("Ingrese una opcion valida");
                op = 0;
            }
            
        } while (op != 4);
        
    }
    public static void Menu(int op)
    {     
        switch (op) 
        {
            case 1:
                EjemploComando();
                break;
            case 2:
                EjemploMediador();
                break;
            case 3:
                EjemploObservador(10, 100);
                break;
            default: ;
        }         
    }
    public static void EjemploComando()
    {
        CuentaBancaria cuenta = new CuentaBancaria("1132367824", 960000);
        
        DepositarCmdContreto opDepositar = new DepositarCmdContreto(cuenta, 150000);
        RetirarCmdConcreto opRetirar = new RetirarCmdConcreto(cuenta, 350000);
        
        Invoker invocador = new Invoker();
        invocador.RecibirOperacion(opDepositar);
        invocador.RecibirOperacion(opRetirar);
        
        invocador.RealizarOperaciones();
    }
    
    public static void EjemploObservador(double cambio1, double cambio2)
    {
        Subject sujeto = new Subject();
        
        new PesoColombianoObservador(sujeto);
        new PesoMexicanoObservador(sujeto);
        new LibraEsterlinaObservador(sujeto);
        
        System.out.println("Cambio de $ "+ cambio1 + " dólares a:" );
        sujeto.setEstado(cambio1);
        System.out.println("--------");
        System.out.println("Cambio de $ "+ cambio2 + " dólares a:" );
        sujeto.setEstado(cambio2);
        System.out.println("--------");
    }
    public static void EjemploMediador()
    {
        Mediador mediador = new Mediador();
        
        Colleague joseUsuario = new UsuarioColega(mediador);
        Colleague anaAdministradora = new AdministradorColega(mediador);
        Colleague pepeCEO = new CeoColega(mediador);
        
        mediador.Agregar(joseUsuario);
        mediador.Agregar(anaAdministradora);
        mediador.Agregar(pepeCEO);
        
        pepeCEO.Comunicar("Hola a todos");
    }
}
