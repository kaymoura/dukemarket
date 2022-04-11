package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Gerencia a conexão com o banco de dados. Possui as instruções necessárias para 
 * conectar ao banco.
 * @author Kaylane
 */
public class MySQLConnection {
    // Define strings de conexão com o banco. 
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://172.16.0.30:3306/kcm_dukemarket";
    private static final String USER = "kaylane";
    private static final String PASS  = "21262810";
    
    /**
     * Cria conexão com o banco de dados MySQL.
     * @return 
     */
 
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("erro na Conexao com o Banco de Dados. Verifique!", ex);
        }
    }
    /**
     * 
     * Fecha a Conexão com o DB.
     * @param conn connection a ser fechada.
     */

    public static void closeConnection(Connection conn){
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * fecha a conexão com o DB.
     * @param conn Conexão
     * @param stmt Statement
     */
    
    public static void closeConnection(Connection conn, PreparedStatement stmt){
        closeConnection(conn);
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * fecha a conexão com o DB.
     * @param conn Conexão    // conectando com a base
     * @param stmt Statement  // comando para base
     * @param rs Result       // o que a base devolve
     */
    
    public static void closeConnection(Connection conn,
                                       PreparedStatement stmt,
                                       ResultSet rs){
        closeConnection(conn, stmt);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
