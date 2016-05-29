
package GreenFlight.VO;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "passagemVO")
@Dependent
public class PassagemVO {

    private Integer _CodigoPassagem;
    private VooVO _Voo;
    private Integer _Assento;
    private ClienteVO _Cliente;
    private Double _Preco;
    private Double _Desconto;
    private Double _ValorTotal;
    
    public PassagemVO() {
    }
    
    public PassagemVO(Integer codigo, VooVO voo, ClienteVO cliente, Double preco, Double desconto, Double valorTotal) {
        setCodigoPassagem(codigo);
        setVoo(voo);
        setCliente(cliente);
        setPreco(preco);
        setDesconto(desconto);
        setValorTotal(valorTotal);
    }

    /**
     * @return the _CodigoPassagem
     */
    public Integer getCodigoPassagem() {
        return _CodigoPassagem;
    }

    /**
     * @param _CodigoPassagem the _CodigoPassagem to set
     */
    public void setCodigoPassagem(Integer _CodigoPassagem) {
        this._CodigoPassagem = _CodigoPassagem;
    }

    /**
     * @return the _Voo
     */
    public VooVO getVoo() {
        return _Voo;
    }

    /**
     * @param _Voo the _Voo to set
     */
    public void setVoo(VooVO _Voo) {
        this._Voo = _Voo;
    }

    /**
     * @return the _Assento
     */
    public Integer getAssento() {
        return _Assento;
    }

    /**
     * @param _Assento the _Assento to set
     */
    public void setAssento(Integer _Assento) {
        this._Assento = _Assento;
    }

    /**
     * @return the _Cliente
     */
    public ClienteVO getCliente() {
        return _Cliente;
    }

    /**
     * @param _Cliente the _Cliente to set
     */
    public void setCliente(ClienteVO _Cliente) {
        this._Cliente = _Cliente;
    }

    /**
     * @return the _Preco
     */
    public Double getPreco() {
        return _Preco;
    }

    /**
     * @param _Preco the _Preco to set
     */
    public void setPreco(Double _Preco) {
        this._Preco = _Preco;
    }

    /**
     * @return the _Desconto
     */
    public Double getDesconto() {
        return _Desconto;
    }

    /**
     * @param _Desconto the _Desconto to set
     */
    public void setDesconto(Double _Desconto) {
        this._Desconto = _Desconto;
    }

    /**
     * @return the _ValorTotal
     */
    public Double getValorTotal() {
        return _ValorTotal;
    }

    /**
     * @param _ValorTotal the _ValorTotal to set
     */
    public void setValorTotal(Double _ValorTotal) {
        this._ValorTotal = _ValorTotal;
    }
    
}
