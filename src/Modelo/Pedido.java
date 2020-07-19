package Modelo;

public class Pedido {

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getMesa_pedido() {
        return mesa_pedido;
    }

    public void setMesa_pedido(int mesa_pedido) {
        this.mesa_pedido = mesa_pedido;
    }

    public int getQtd_pedido() {
        return qtd_pedido;
    }

    public void setQtd_pedido(int qtd_pedido) {
        this.qtd_pedido = qtd_pedido;
    }

    public double getSubtotal_pedido() {
        return subtotal_pedido;
    }

    public void setSubtotal_pedido(double subtotal_pedido) {
        this.subtotal_pedido = subtotal_pedido;
    }

    public int getItem_id_item() {
        return item_id_item;
    }

    public void setItem_id_item(int item_id_item) {
        this.item_id_item = item_id_item;
    }

    public int getFuncionario_id_funcionario() {
        return funcionario_id_funcionario;
    }

    public void setFuncionario_id_funcionario(int funcionario_id_funcionario) {
        this.funcionario_id_funcionario = funcionario_id_funcionario;
    }
    private int id_pedido;
    private int mesa_pedido;
    private int qtd_pedido;
    private double subtotal_pedido;
    private int item_id_item;
    private int funcionario_id_funcionario;
}