
package GreenFlight.VO;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "vooVO")
@Dependent
public class VooVO {

    private Integer _CodigoVoo;
    private AeroportoVO _Origem;
    private AeroportoVO _Destino;
    private Date _DataViagem;
    
    public VooVO() {
        
    }
    
    public VooVO(Integer codigo, AeroportoVO origem, AeroportoVO destino, Date dataViagem) {
        setCodigoVoo(codigo);
        setOrigem(origem);
        setDestino(destino);
        setDataViagem(dataViagem);
    }

    /**
     * @return the _CodigoVoo
     */
    public Integer getCodigoVoo() {
        return _CodigoVoo;
    }

    /**
     * @param _CodigoVoo the _CodigoVoo to set
     */
    public void setCodigoVoo(Integer _CodigoVoo) {
        this._CodigoVoo = _CodigoVoo;
    }

    /**
     * @return the _Origem
     */
    public AeroportoVO getOrigem() {
        return _Origem;
    }

    /**
     * @param _Origem the _Origem to set
     */
    public void setOrigem(AeroportoVO _Origem) {
        this._Origem = _Origem;
    }

    /**
     * @return the _Destino
     */
    public AeroportoVO getDestino() {
        return _Destino;
    }

    /**
     * @param _Destino the _Destino to set
     */
    public void setDestino(AeroportoVO _Destino) {
        this._Destino = _Destino;
    }

    /**
     * @return the _DataViagem
     */
    public Date getDataViagem() {
        return _DataViagem;
    }

    /**
     * @param _DataViagem the _DataViagem to set
     */
    public void setDataViagem(Date _DataViagem) {
        this._DataViagem = _DataViagem;
    }
    
}
