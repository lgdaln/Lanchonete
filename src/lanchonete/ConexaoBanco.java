
package lanchonete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.beans.Statement;


public class ConexaoBanco {
       private Statement stmt;
    public Connection conn;
    //private final String DRIVER_SQLSERVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";

    //private final String LOCAL_SERVIDOR = "localhost";
    private final String LOCAL_SERVIDOR = "localhost";
    
    //private final String BANCO_DE_DADOS = "lanchonete";
    private final String BANCO_DE_DADOS = "lanchonete";

    //private final String PORTA_BANCO = "1433";
    private final String PORTA_BANCO = "3306";

    //private final String USUARIO = "dias";
    private final String USUARIO = "root";

    //private final String SENHA = "123456";
    private final String SENHA = "";


    /*public Connection conectar() throws Exception {
        return this.conectarSqlServer();
    }*/
    
    public Connection conectar() throws Exception {
    return this.conectarMySql();
    }

    /*public void desconectar() throws SQLException {
        conn.close();
    }*/
    
    public void desconectar() throws SQLException {
        conn.close();
    }
   
    /*private Connection conectarSqlServer() throws Exception {
        Class.forName(DRIVER_SQLSERVER);
        String url = "jdbc:sqlserver://"+LOCAL_SERVIDOR+":"+PORTA_BANCO+";DatabaseName="+BANCO_DE_DADOS;
        conn = DriverManager.getConnection(url, USUARIO, SENHA);
        return conn;
    }*/
    
    private Connection conectarMySql() throws Exception {
    Class.forName(DRIVER_MYSQL).newInstance();
    String url = "jdbc:mysql://"+LOCAL_SERVIDOR+":"+PORTA_BANCO+"/"+BANCO_DE_DADOS;
    conn = (Connection) DriverManager.getConnection(url , USUARIO, SENHA);
    return conn;
    }

}


