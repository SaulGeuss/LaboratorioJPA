/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author adiseño.2015
 */

@Entity                  //Entity en una tabla, le estoy diciendo a java que lo trate como una tabla
//@NamedQueries({
//    @NamedQuery(name="persona.findNombreLike", query=" select u from persona u " + "where u.nombre LIKE :nombre")
//})


public class Persona implements Serializable {
    
    @Id  //indica que la fila de abajo la trate como un id
    private int id;
    
    private String nombre;
    private String apellido;
    private Boolean conectado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getConectado() {
        return conectado;
    }

    public void setConectado(Boolean conectado) {
        this.conectado = conectado;
    }
    
    @Override
    public String toString(){
        return "Persona: " + nombre + " ,Apellido: " + apellido + " ,Conectado: " + conectado; 
    }
    
    
}
