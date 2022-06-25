/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author elisi
 */
public class candidato {
    
    private int id_candidato;
    private String nome_candidato;
    private String partido_candidato;
    private int numero_candidato;
    private String cargo_candidato;

    public candidato() {
    }
    
    

    public candidato(int id_candidato, String nome_candidato, String partido_candidato, int numero_candidato, String cargo_candidato) {
        this.id_candidato = id_candidato;
        this.nome_candidato = nome_candidato;
        this.partido_candidato = partido_candidato;
        this.numero_candidato = numero_candidato;
        this.cargo_candidato = cargo_candidato;
    }
    

    /**
     * @return the id_candidato
     */
    public int getId_candidato() {
        return id_candidato;
    }

    /**
     * @param id_candidato the id_candidato to set
     */
    public void setId_candidato(int id_candidato) {
        this.id_candidato = id_candidato;
    }

    /**
     * @return the nome_candidato
     */
    public String getNome_candidato() {
        return nome_candidato;
    }

    /**
     * @param nome_candidato the nome_candidato to set
     */
    public void setNome_candidato(String nome_candidato) {
        this.nome_candidato = nome_candidato;
    }

    /**
     * @return the partido_candidato
     */
    public String getPartido_candidato() {
        return partido_candidato;
    }

    /**
     * @param partido_candidato the partido_candidato to set
     */
    public void setPartido_candidato(String partido_candidato) {
        this.partido_candidato = partido_candidato;
    }

    /**
     * @return the numero_candidato
     */
    public int getNumero_candidato() {
        return numero_candidato;
    }

    /**
     * @param numero_candidato the numero_candidato to set
     */
    public void setNumero_candidato(int numero_candidato) {
        this.numero_candidato = numero_candidato;
    }

    /**
     * @return the cargo_candidato
     */
    public String getCargo_candidato() {
        return cargo_candidato;
    }

    /**
     * @param cargo_candidato the cargo_candidato to set
     */
    public void setCargo_candidato(String cargo_candidato) {
        this.cargo_candidato = cargo_candidato;
    }
    
   
    
}// fim da classe candidato
