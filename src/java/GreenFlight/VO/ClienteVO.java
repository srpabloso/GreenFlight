
package GreenFlight.VO;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "clienteVO")
@Dependent
public class ClienteVO {

    private String _CPF;
    private String _Nome;
    private Date _DataNascimento;
    private String _Login;
        
    public ClienteVO(String cpf, String nome, Date dataNascimento, String login) {
        setCPF(cpf);
        setNome(nome);
        setDataNascimento(dataNascimento);
        setLogin(login);
    }

    /**
     * @return the _CPF
     */
    public String getCPF() {
        return _CPF;
    }

    /**
     * @param _CPF the _CPF to set
     */
    public void setCPF(String _CPF) {
        this._CPF = _CPF;
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
     * @return the _DataNascimento
     */
    public Date getDataNascimento() {
        return _DataNascimento;
    }

    /**
     * @param _DataNascimento the _DataNascimento to set
     */
    public void setDataNascimento(Date _DataNascimento) {
        this._DataNascimento = _DataNascimento;
    }

    /**
     * @return the _Login
     */
    public String getLogin() {
        return _Login;
    }

    /**
     * @param _Login the _Login to set
     */
    public void setLogin(String _Login) {
        this._Login = _Login;
    }

}
