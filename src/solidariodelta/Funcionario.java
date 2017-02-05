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
public class Funcionario extends Entidade{
    
    private int idFuncionario;
    private boolean admin;
    private String restricaoAlimentar;

    public Funcionario(int idFuncionario, boolean admin, String restricaoAlimentar, int id, String nome, String morada, String codigoPostal, int NIF, int NISS, String contacto, String email, String password, Date apagado) {
        super(id, nome, morada, codigoPostal, NIF, NISS, contacto, email, password, apagado);
        this.idFuncionario = idFuncionario;
        this.admin = admin;
        this.restricaoAlimentar = restricaoAlimentar;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getRestricaoAlimentar() {
        return restricaoAlimentar;
    }

    public void setRestricaoAlimentar(String restricaoAlimentar) {
        this.restricaoAlimentar = restricaoAlimentar;
    }
    
    
    
    void Requisitar(){
       
    }
    
    float RetornarGanhos(/*float,float*/){
        float a=0;
        
        return a;
    }
    
    void refeicao(){
        
    }
    
    String ApagarEntidade(/*int*/){
        
        return "FIM";
    }
    
}
