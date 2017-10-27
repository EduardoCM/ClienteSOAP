package test;

import org.ipn.escom.soap.HolaMundoService;
import org.ipn.escom.soap.HolaMundoServiceImplService;

/*
wsimport -keep -verbose url?wsdl
*/
public class Main {
    
    public static void main(String[] args){
        
        HolaMundoService holaService = 
                new HolaMundoServiceImplService().getHolaMundoServiceImplPort();
        
       String resultado = holaService.saludar("Eduardo Castillo Mendoza");
       
        System.out.println("::: Resultado:" + resultado);
    }
    
}
