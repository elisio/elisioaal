/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroeleitoral;

/**
 *
 * @author samu2
 */
public class Candidato {

    private int idCandidato;
    private String cargo;
    private int numero;
    private String nome;
    private String partido;

    /**
     * @return the idMedico
     */
    public int getIdCandidato() {
        return idCandidato;
    }

    /**
     * @param idCandidato the idMedico to set
     */
    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param cargo the especialidade to set
     */
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the crm to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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

}
