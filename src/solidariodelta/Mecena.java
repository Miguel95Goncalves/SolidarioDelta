/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidariodelta;

import java.util.Date;

/**
 *
 * @author jbp19
 */
public class Mecena extends Entidade{
    private int idMecena;

    public Mecena(int idMecena, int id, String nome, String morada, String codigoPostal, int NIF, int NISS, String contacto, String email, String password, Date apagado) {
        super(id, nome, morada, codigoPostal, NIF, NISS, contacto, email, password, apagado);
        this.idMecena = idMecena;
    }

    public int getIdMecena() {
        return idMecena;
    }

    public void setIdMecena(int idMecena) {
        this.idMecena = idMecena;
    }
    
    
    
    void doar(/*float*/){
        
        
    }
    
}
