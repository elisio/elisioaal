/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author elisi
 */
public class ConsultaDAO {
    
    public static ResultSet carregarTabela() throws SQLException
    {
        Conexao conexao = new Conexao();
        PreparedStatement candtmt = conexao.getConexao().prepareStatement(
                "SELECT id_candidato,nome_candidato,partido_candidato,numero_candidato,cargo_cadidato FORM candidato");
    
                ResultSet rs = candtmt.executeQuery();
                return rs;
                
                }
    
    
}// fim consultadao
