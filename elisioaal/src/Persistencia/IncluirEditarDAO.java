/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;
import Model.candidato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author elisi
 */
public class IncluirEditarDAO {    
    candidato objcand = new candidato();
    
    public int Incluir(candidato objcand) throws SQLException
    {
    
        
        Conexao conexao = new Conexao();
        int registros;
        try(PreparedStatement candtmt = conexao.getConexao().prepareStatement
        ("INSERT INTO candidato (nome_candidato, partido_candidato, numero_candidato, cargo_candidato) " + " VALUES (?, ?, ?, ?)")){
            candtmt.setString(1,objcand.getNome_candidato().toUpperCase().trim());
            candtmt.setString(2,objcand.getPartido_candidato().trim());
            candtmt.setInt(3,objcand.getNumero_candidato());
            candtmt.setString(4,objcand.getCargo_candidato().trim());
            
            registros = candtmt.executeUpdate();
        }
        
        PreparedStatement candtmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = candtmtAux.executeQuery();
        int codigo = 0;
        
        if ((registros == 1) && (rs != null)){
        rs.next();
        codigo = rs.getInt(1);
        return codigo;}
        
        else{
            return codigo;
            }//fim do metodo incluir
            
    }
}
    
    
    
    
    
    
