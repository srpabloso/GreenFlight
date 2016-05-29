/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GreenFlight.DAO;

import GreenFlight.VO.ClienteVO;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ClienteDAO {
    
    public void cadastrar(ClienteVO cliente){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(cliente);
        tx.commit();
        em.close();
    }
    
    public ClienteVO buscar(String cpf)
    {
        EntityManager em = JPAUtil.getEntityManager();
        try
        {
            return em.find(ClienteVO.class, cpf);
        }
        finally
        {
            em.close();
        }
    }
}


