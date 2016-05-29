/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GreenFlight.BO;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import java.util.Date;
import GreenFlight.VO.ClienteVO;
import GreenFlight.DAO.ClienteDAO;
/**
 *
 * @author Administrador
 */

@Named(value = "cliente")
@Dependent
public class Cliente extends AbstractController {
    
    public Cliente() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public String testMethod()
    {
        return "Testado 123";
    
    }
    
    public void Cadastrar(String nome, String login, String senha, Date DataNascimento, String CPF)
    {
        ClienteVO cliente = new ClienteVO(CPF, nome, DataNascimento, login);
        ClienteDAO dao = new ClienteDAO();
        dao.Cadastrar(cliente, senha);
        
    }
        
    
}
    
   
    
    
    

