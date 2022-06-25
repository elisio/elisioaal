/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroeleitoral;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author samu2
 */
public class ConsultaDAO extends Conexao {

    public String cadastrarConsulta(Consulta consulta) {
        try {
            String sentenca = "INSERT INTO CONSULTA(IDCANDIDATO, IDELEITOR, VOTOS) VALUES ("
                    + Integer.toString(consulta.getIdCandidato()) + ", "
                    + Integer.toString(consulta.getIdEleitor()) + ", '"
                    + consulta.getVotos() + "')";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String atualizarConsulta(Consulta consulta) {
        try {
            String sentenca = "UPDATE CONSULTA SET IDMEDICO = " + Integer.toString(consulta.getIdMedico())
                    + " , IDPACIENTE = " + Integer.toString(consulta.getIdEleitor())
                    + " , CONVENIO = '" + consulta.getVotos()
                    + "' WHERE IDCONSULTA = " + Integer.toString(consulta.getIdConsulta());
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String excluirConsulta(int idConsulta) {
        try {
            String sentenca = "DELETE FROM CONSULTA WHERE IDCONSULTA = " + Integer.toString(idConsulta);
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public ArrayList listarConsultas() {
        try {
            ArrayList consultas = new ArrayList();
            String sentenca = "SELECT IDCONSULTA, CONCAT(CAN.IDCADIDATO, \" - \", CAN.NOME) AS CADIDATO, CONCAT(PAC.IDELEITOR, \" - \", PAC.NOME) AS ELEITOR, VOTOS FROM CONSULTA CON LEFT JOIN CANDIDATO CAN ON CAN.IDCANDIDATO = CON.IDCANDIDATO LEFT JOIN ELEITOR PAC ON PAC.IDELEITOR = CON.IDELEITOR ORDER BY VOTOS;";
            ResultSet rs = this.getResultSet(sentenca);

            while (rs.next()) {
                ConsultaView consulta = new ConsultaView();
                consulta.setIdConsulta(rs.getInt("IDCONSULTA"));
                consulta.setMedico(rs.getString("MEDICO"));
                consulta.setPaciente(rs.getString("PACIENTE"));
                consulta.setConvenio(rs.getString("CONVENIO"));

                consultas.add(consulta);
            }
            return consultas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
