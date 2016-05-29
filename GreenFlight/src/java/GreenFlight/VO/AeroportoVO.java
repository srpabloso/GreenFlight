/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GreenFlight.VO;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author 37761832846
 */
@Named(value = "aeroportoVO")
@Dependent
public class AeroportoVO {

    private String _Nome;
    private EstadoVO _Estado;
     
    public AeroportoVO(String nome, EstadoVO estado ) 
    {
        setNome(nome);
        setEstado(estado);
    }

    /**
     * @return the _Nome
     */
    public String getNome() {
        return _Nome;
    }

    /**
     * @param _Nome the _Nome to set
     */
    public void setNome(String _Nome) {
        this._Nome = _Nome;
    }

    /**
     * @return the _Estado
     */
    public EstadoVO getEstado() {
        return _Estado;
    }

    /**
     * @param _Estado the _Estado to set
     */
    public void setEstado(EstadoVO _Estado) {
        this._Estado = _Estado;
    }
    
    
    
    
    
    
    
}
