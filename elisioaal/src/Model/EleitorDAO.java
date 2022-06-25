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
public class EleitorDAO extends Conexao {

    public String cadastrarelEitor(Eleitor eleitor) {
        try {
            String sentenca = "INSERT INTO ELEITOR(NOME, CPF, TITULO) VALUES ('"
                    + eleitor.getNome() + "', '"
                    + eleitor.getCpf() + "', "
                    + Integer.toString(eleitor.getTitulo()) + ")";
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String atualizarPaciente(Eleitor eleitor) {
        try {
            String sentenca = "UPDATE ELEITOR SET NOME = '" + eleitor.getNome()
                    + "' , CPF = '" + eleitor.getCpf()
                    + "' , IDADE = " + Integer.toString(eleitor.getTitulo())
                    + " WHERE IDELEITOR = " + Integer.toString(eleitor.getIdEleitor());
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String excluirEleitor(int idEleitor) {
        try {
            String sentenca = "DELETE FROM ELEITOR WHERE IDELEITOR = " + Integer.toString(idEleitor);
            return this.atualizarBanco(sentenca);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public ArrayList listarEleitores() {
        try {
            ArrayList eleitor = new ArrayList();
            String sentenca = "SELECT * FROM PACIENTE ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);

            while (rs.next()) {
                Eleitor eleitor = new Eleitor();
                eleitor.setIdEleitor(rs.getInt("IDELEITOR"));
                eleitor.setNome(rs.getString("NOME"));
                eleitor.setCpf(rs.getString("CPF"));
                eleitor.setTitulo(rs.getInt("TITULO"));

                eleitor.add(eleitor);
            }
            return eleitor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
