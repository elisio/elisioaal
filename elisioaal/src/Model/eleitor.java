/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author elisi
 */
public class eleitor {
    
    private int id_eleitor;
    private String nome_eleitor;
    private int titulo_eleitor;
    private String cpf;

    public eleitor() {
        
    }
    
    

    public eleitor(int id_eleitor, String nome_eleitor, int titulo_eleitor, String cpf) {
        this.id_eleitor = id_eleitor;
        this.nome_eleitor = nome_eleitor;
        this.titulo_eleitor = titulo_eleitor;
        this.cpf = cpf;
    }
    
    

    /**
     * @return the id_eleitor
     */
    public int getId_eleitor() {
        return id_eleitor;
    }

    /**
     * @param id_eleitor the id_eleitor to set
     */
    public void setId_eleitor(int id_eleitor) {
        this.id_eleitor = id_eleitor;
    }

    /**
     * @return the nome_eleitor
     */
    public String getNome_eleitor() {
        return nome_eleitor;
    }

    /**
     * @param nome_eleitor the nome_eleitor to set
     */
    public void setNome_eleitor(String nome_eleitor) {
        this.nome_eleitor = nome_eleitor;
    }

    /**
     * @return the titulo_eleitor
     */
    public int getTitulo_eleitor() {
        return titulo_eleitor;
    }

    /**
     * @param titulo_eleitor the titulo_eleitor to set
     */
    public void setTitulo_eleitor(int titulo_eleitor) {
        this.titulo_eleitor = titulo_eleitor;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}// fim da classe eleitor
