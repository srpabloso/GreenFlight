/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GreenFlight.BO;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named(value = "clienteBO")
@Dependent
public class ClienteBO {
    String Lucas;
    
    public String texto(){
        return "ok";
    }
}
