package DAO;
import java.sql.*;
import Modelo.Funcionario;

public class FuncionarioDAO extends ExecuteSQL {
public FuncionarioDAO(Connection con){
    super(con);
}
public boolean Logar(String login, String senha){
    boolean finalResult = false;
    try {
        String consulta = "select login, senha from funcionario where login = '" + login + "' and senha = '" + senha + "'"; 
        PreparedStatement ps = getCon().prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();
        if(rs != null){
            while (rs.next()){
                Funcionario a = new Funcionario();
                a.setLogin(rs.getString(1));
                a.setSenha(rs.getString(2));
                finalResult = true;
            }
        }
    } catch (SQLException ex){
        ex.getMessage();
    }return finalResult;
}

public String Alterar_Funcionario(Funcionario a){
String sql = "update funcionario set nome = ?, login = ?, senha = ? where id_funcionario = ?";
try{
PreparedStatement ps = getCon().prepareStatement(sql);
ps.setInt(4, a.getId_funcionario());
ps.setString(1, a.getNome());
ps.setString(2, a.getLogin());
ps.setString(3, a.getSenha());

if(ps.executeUpdate()>0){
return "Atualizado com sucesso.";
}else{
return "Erro ao atualizar.";
}
}catch(SQLException e){
return e.getMessage();
}
}

public String Inserir_Funcionario(Funcionario a){
String sql = "insert into funcionario values(0,?,?,?)";
try{
PreparedStatement ps = getCon().prepareStatement(sql);
ps.setString(1, a.getNome());
ps.setString(2, a.getLogin());
ps.setString(3, a.getSenha());

if(ps.executeUpdate() > 0){
return "Inserido com sucesso.";
}else{
return "Erro ao inserir.";
}
}catch(SQLException e){
return e.getMessage();
}
}

public String Excluir_Funcionario(Funcionario a){
String sql = "delete from funcionario where id_funcionario = ?";

try{
PreparedStatement ps = getCon().prepareStatement(sql);
ps.setInt(1, a.getId_funcionario());
if(ps.executeUpdate()>0){
return "Excluido com sucesso.";
}else{
return "Erro ao excluir";
}
}catch(SQLException e){
return e.getMessage();

}
}
}