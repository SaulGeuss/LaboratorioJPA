/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioanalisisdiseño2jpa;


import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
import Percistence.Persona;
import Percistence.PersonaJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import modelos.ModeloTablaUsuario;

/**
 *
 * @author adiseño.2015
 */
public class LaboratorioAnalisisDiseño2JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaboratorioAnalisisDise_o2JPAPU");
        EntityManager em = emf.createEntityManager();
        
        PersonaJpaController miControladorUsuario = new PersonaJpaController(emf);
        
    }
    
}
