package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

public class DatabaseConexion1 {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
    public void connectDB() throws SQLException{

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice1","root","password");
            System.out.println("Databa conecion succefull");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DatabaseConexion1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void excuteQuery() throws SQLException{
        st = con.createStatement();
        rs=st.executeQuery("Select * from clientes");
        while(rs.next()){
            String name = rs.getString("Nombre");
            System.out.println(name);
        }
        
        
    }
    public static void main(String[] args) throws SQLException { 
        DatabaseConexion1 example1 = new DatabaseConexion1();
        example1.connectDB();
        example1.excuteQuery();
    }
}