
package GreenFlight.VO;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "estadoVO")
@Dependent
public class EstadoVO {
    
    private String _Nome;
    private String _Sigla;
    
    public EstadoVO(String nome, String sigla) {
        setNome(nome);
        setSigla(sigla);
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
     * @return the _Sigla
     */
    public String getSigla() {
        return _Sigla;
    }

    /**
     * @param _Sigla the _Sigla to set
     */
    public void setSigla(String _Sigla) {
        this._Sigla = _Sigla;
    }
    
}
