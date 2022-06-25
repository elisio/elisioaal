package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexao {
  
 
public static String base="db_elisioaal";


    private static Connection conexao;
    public Conexao()
    { try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          String url = "jdbc:odbc:myodbc;database="+base+";user=;password=";
          
          conexao = DriverManager.getConnection(url);
          System.out.println("conexao ok");        
          
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,
          "Ocorreu um erro de conexão. Verifique a Base de Dados indicada !"+"\n" +  erro.getMessage(),"Conexão",3);
            erro.printStackTrace();
        }
    }

    // Mtodos pblicos:
    public Connection getConexao()
    {
        return conexao;
    }


}
