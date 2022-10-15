package br.tiobarnabe.sistema.ag;

public class conection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
import java.sql.Connection;
import java.sql.DriverManager;


public class connectionFactory {        private static  final String  USERNAME ="root";        private static final  String PASSWORD = "27091990";        private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/tiobarnabetur";        public static Connection createConnectionToMySQL() throws Exception {            Class.forName("com.mysql.cj.jdbc.Driver");                    Connection connection =                DriverManager.getConnection (DATABASE_URL,USERNAME,PASSWORD);                    return connection;                }    public static void main (String [] args ) throws Exception {        Connection con = createConnectionToMySQL();            if (con != null) {                System.out.println("Conexao Obtida comm sucesso" +con);                                con.close();            }    }


}



