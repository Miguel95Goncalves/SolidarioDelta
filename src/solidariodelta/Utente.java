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
public class Utente extends Entidade{
    private int idUtente;
    private Date dataNascimento;
    private String restricaoAlimentar;
    private String alergias;
    private String medicacao;
    private String contactoEmergencia;
    private String doencaCronica;
    private int grauAutonomia;
    private String isolamentoSocial;
    private String necessidadeMedica;
    private int escalao;

    public Utente(int idUtente, Date dataNascimento, String restricaoAlimentar, String alergias, String medicacao, String contactoEmergencia, String doencaCronica, int grauAutonomia, String isolamentoSocial, String necessidadeMedica, int escalao, int id, String nome, String morada, String codigoPostal, int NIF, int NISS, String contacto, String email, String password, Date apagado) {
        super(id, nome, morada, codigoPostal, NIF, NISS, contacto, email, password, apagado);
        this.idUtente = idUtente;
        this.dataNascimento = dataNascimento;
        this.restricaoAlimentar = restricaoAlimentar;
        this.alergias = alergias;
        this.medicacao = medicacao;
        this.contactoEmergencia = contactoEmergencia;
        this.doencaCronica = doencaCronica;
        this.grauAutonomia = grauAutonomia;
        this.isolamentoSocial = isolamentoSocial;
        this.necessidadeMedica = necessidadeMedica;
        this.escalao = escalao;
    }

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRestricaoAlimentar() {
        return restricaoAlimentar;
    }

    public void setRestricaoAlimentar(String restricaoAlimentar) {
        this.restricaoAlimentar = restricaoAlimentar;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public String getDoencaCronica() {
        return doencaCronica;
    }

    public void setDoencaCronica(String doencaCronica) {
        this.doencaCronica = doencaCronica;
    }

    public int getGrauAutonomia() {
        return grauAutonomia;
    }

    public void setGrauAutonomia(int grauAutonomia) {
        this.grauAutonomia = grauAutonomia;
    }

    public String getIsolamentoSocial() {
        return isolamentoSocial;
    }

    public void setIsolamentoSocial(String isolamentoSocial) {
        this.isolamentoSocial = isolamentoSocial;
    }

    public String getNecessidadeMedica() {
        return necessidadeMedica;
    }

    public void setNecessidadeMedica(String necessidadeMedica) {
        this.necessidadeMedica = necessidadeMedica;
    }

    public int getEscalao() {
        return escalao;
    }

    public void setEscalao(int escalao) {
        this.escalao = escalao;
    }
    
    
}
