package DAO;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    public static Connection AbrirConexao(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/restaurante";
            con = DriverManager.getConnection(url,"root","");
        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Erro na conexão.","Restaurante", JOptionPane.ERROR_MESSAGE);
        e.getMessage();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro na conexão.","Restaurante", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
        return con;
    }
    public static void FecharConexao(Connection con){
        try{
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
