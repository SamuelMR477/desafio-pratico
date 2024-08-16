package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/desafio_pratico";
    private static final String user = "root";
    private static final String password = "S@n10s123!";

    private static Connection connection;

    public static Connection getConnection(){

        try {
        if(connection == null){

            connection = DriverManager.getConnection(url, user, password);
            return connection;

        }else{

            return connection;
        }

        }  catch (SQLException e) {
            e.printStackTrace();
            return null;
    }
    }
}
