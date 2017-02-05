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
public class EntidadeExterna extends Entidade{
    
    private int idEntidadeExterna;
    private String servicoFornece;

    public EntidadeExterna(int idEntidadeExterna, String servicoFornece, int id, String nome, String morada, String codigoPostal, int NIF, int NISS, String contacto, String email, String password, Date apagado) {
        super(id, nome, morada, codigoPostal, NIF, NISS, contacto, email, password, apagado);
        this.idEntidadeExterna = idEntidadeExterna;
        this.servicoFornece = servicoFornece;
    }

    public int getIdEntidadeExterna() {
        return idEntidadeExterna;
    }

    public void setIdEntidadeExterna(int idEntidadeExterna) {
        this.idEntidadeExterna = idEntidadeExterna;
    }

    public String getServicoFornece() {
        return servicoFornece;
    }

    public void setServicoFornece(String servicoFornece) {
        this.servicoFornece = servicoFornece;
    }
    
    
    
    void entradaServico(){
        
        
    }
    
}
