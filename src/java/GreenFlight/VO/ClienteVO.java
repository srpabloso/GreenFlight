
package GreenFlight.VO;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class ClienteVO {

    @Id
    @GeneratedValue
    private Integer _Id;
    @Column
    private String _CPF;
    @Column
    private String _Nome;
    @Column
    private Date _DataNascimento;
    @Column
    private String _Login;
    @Column
    private String _Senha;
    
    public ClienteVO()
    {
    }
    
    public ClienteVO(String cpf, String nome, Date dataNascimento, String login, String senha) {
        setCPF(cpf);
        setNome(nome);
        setDataNascimento(dataNascimento);
        setLogin(login);
        setSenha(senha);
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

    /**
     * @return the _Id
     */
    public Integer getId() {
        return _Id;
    }

    /**
     * @param _Id the _Id to set
     */
    public void setId(Integer _Id) {
        this._Id = _Id;
    }

    /**
     * @param _Senha the _Senha to set
     */
    public void setSenha(String _Senha) {
        this._Senha = _Senha;
    }

}
