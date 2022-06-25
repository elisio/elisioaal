/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroeleitoral;

/**
 *
 * @author samu2
 */
public class Consulta {

    private int idConsulta;
    private int idCandidato;
    private int idEleitor;
    private String votos;

    /**
     * @return the idConsulta
     */
    public int getIdConsulta() {
        return idConsulta;
    }

    /**
     * @param idConsulta the idConsulta to set
     */
    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    /**
     * @return the idCanditado
     */
    public int getIdCanditado() {
        return idCanditado;
    }

    /**
     * @param idCanditado the idCanditado to set
     */
    public void setIdCanditado(int idCanditado) {
        this.idCanditado = idCanditado;
    }

    /**
     * @return the idEleitor
     */
    public int getIdEleitor() {
        return idEleitor;
    }

    /**
     * @param idEleitor the idEleitor to set
     */
    public void setIdEleitor(int idEleitor) {
        this.idEleitor = idEleitor;
    }

    /**
     * @return the votos
     */
    public String getVotos() {
        return votos;
    }

    /**
     * @param votos the votos to set
     */
    public void setVotos(String votos) {
        this.votos = votos;
    }

}
