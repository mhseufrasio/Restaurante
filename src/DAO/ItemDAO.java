package DAO;

import Modelo.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemDAO extends ExecuteSQL{

    public ItemDAO(Connection con) {
        super(con);
    }
    
public String Alterar_Item(Item a){
String sql = "update item set nome = ?, preco = ? where id_item = ?";
try{
PreparedStatement ps = getCon().prepareStatement(sql);
ps.setInt(3, a.getId_item());
ps.setString(1, a.getNome());
ps.setDouble(2, a.getPreco());

if(ps.executeUpdate()>0){
return "Atualizado com sucesso.";
}else{
return "Erro ao atualizar.";
}
}catch(SQLException e){
return e.getMessage();
}
}

public String Inserir_Item(Item a){
String sql = "insert into item values(0,?,?)";
try{
PreparedStatement ps = getCon().prepareStatement(sql);
ps.setString(1, a.getNome());
ps.setDouble(2, a.getPreco());

if(ps.executeUpdate() > 0){
return "Inserido com sucesso.";
}else{
return "Erro ao inserir.";
}
}catch(SQLException e){
return e.getMessage();
}
}

public String Excluir_Item(Item a){
String sql = "delete from item where id_item = ?";

try{
PreparedStatement ps = getCon().prepareStatement(sql);
ps.setInt(1, a.getId_item());
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