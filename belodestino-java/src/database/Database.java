package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {


	private static final String username = "root";
	

	private static final String password = "65147541aL@";
	

    private static final String databaese_url = "jdbc:mysql://localhost:3306/belodestino";
   
	
    public static Connection createConnectionToMySql() {
    	
        try {
        	
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            System.out.printf("[LOG] Driver de banco de dados encontrado.\n");
        } catch (ClassNotFoundException e) {
        	
        	System.out.printf("[ERROR]O driver do banco de dados não foi encontrado:\n%s .\n", e.getMessage());
        }

        try {
        	
            Connection connection = DriverManager.getConnection(databaese_url,username,password);
            
            System.out.println("[LOG] Conectado ao banco de dados.\n");
            
            return connection;
        } catch (SQLException e) {
        	
            System.out.printf("[ERROR] Não é possível conectar-se ao banco de dados. \n%s .\n", e.getMessage());
            return null;
        }
    }
}
