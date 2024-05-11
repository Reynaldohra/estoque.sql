package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import clientes.Clientes;
import conexao.Conexao;

public class ClientesDAO {

    public void cadastrarClientes(Clientes clientes) {
        String sql = "INSERT INTO  CLIENTES (NOME, SOBRENOME, WHATSAPP, ENDEREÇO, CPF) VALUES(?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, clientes.getNome());
            ps.setString(2, clientes.getSobreNome());
            ps.setString(3, clientes.getWhatsapp());
            ps.setString(4, clientes.getEndereço());
            ps.setString(5, clientes.getCpf());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
