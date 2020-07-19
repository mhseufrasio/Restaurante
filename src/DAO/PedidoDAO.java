package DAO;
import DAO.Conexao;
import Modelo.Pedido;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class PedidoDAO extends ExecuteSQL{

    public PedidoDAO(Connection con) {
        super(con);
    }
    
public String Criar_Pedido(Pedido a){
String sql = "insert into pedido values(0,?,?,?)";
try{
PreparedStatement ps = getCon().prepareStatement(sql);
ps.setInt(1, a.getItem_id_item());
ps.setInt(2, a.getQtd_pedido());
ps.setInt(3, a.getMesa_pedido());

if(ps.executeUpdate() > 0){
return "Inserido com sucesso.";
}else{
return "Erro ao inserir.";
}
}catch(SQLException e){
return e.getMessage();
}
}

public String Alterar_Pedido(Pedido a){

String sql = "update pedido set idpedido = ?, iditem = ?, quantidade = ?, subtotal = ?";
try{
PreparedStatement ps = getCon().prepareStatement(sql);
ps.setInt(2, a.getId_pedido());
ps.setDouble(4, a.getSubtotal_pedido());
ps.setInt(3, a.getQtd_pedido());
ps.setInt(1, a.getMesa_pedido());
ps.setInt(1, a.getItem_id_item());
ps.setInt(1, a.getFuncionario_id_funcionario());

if(ps.executeUpdate()>0){
return "Atualizado com sucesso.";
}else{
return "Erro ao atualizar.";
}
}catch(SQLException e){
return e.getMessage();
}
}

/*public String Excluir_Cliente(Cliente a){
String sql = "delete from cliente where idcliente = ?";

try{
PreparedStatement ps = getCon.prepareStatement(sql);
ps.setInt(0, a.getCodigo());
ps.setInt(1, a.getCodigo());
if(ps.executeUpdate()>0){
return "Excluido com sucesso.";
}else{
return "Erro ao excluir";
}
}catch(SQLException e){
return e.getMessage();

}
}
public class CapturarCliente{
String sql = "select * from cliente where idcliente = '" + cod + "'";
List<String> lista = new ArrayList<String>();
try{
PreparedStatement ps = getCon().prepareStatement(sql);
ResultSet rs = ps.executeQuery();
if(rs != null){
while(rs.next()){
Cliente a = new Cliente();
a.setCodigo(rs.getInt(1));
a.setNome(rs.getString(2));
a.setNascimento(rs.getString(3));
a.setRG(rs.getString(4));
a.setCPF(rs.getString(5));
a.setEmail(rs.getString(6));
a.setTelefone(rs.getString(7));
a.setBairro(rs.getString(8));
a.setRua(rs.getString(9));
a.setNumero(rs.getInt(10));
a.setCEP(rs.getString(11));
lista.add(a);
}
return lista;
}else{
return null;
}
}catch(SQLExceptiom e){
return null;
}
}

public List<Cliente> ListarCliente(){
        String sql = "select idcliente,nome,rg,cpf,telefone,email from cliente";
        List<Cliente> lista = new ArrayList<>();
        try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        if(rs != null){
        while (rs.next()){
        Cliente a = new Cliente();
        a.setCodigo(rs.getInt(1));
        a.setNome(rs.getString(2));
        a.setRG(rs.getString(3));
        a.setCPF(rs.getString(4));
        a.setTelefone(rs.getString(5));
        a.setEmail(rs.getString(6));
        
        lista.add(a);
        }
        return lista;
        }else{
        return null;
        }
        }catch(SQLException e){
        return null;
        }
    }*/

    private static class getCon {

        private static PreparedStatement prepareStatement(String sql) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public getCon() {
        }
    }

}