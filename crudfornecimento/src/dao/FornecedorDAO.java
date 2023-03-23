package dao;

import java.lang.runtime.ObjectMethods;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dto.FornecedorDTO;

public class FornecedorDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FornecedorDTO> lista = new ArrayList<>();

    public void cadastrarFornecedor(FornecedorDTO objfornecedordto) {

        String sql = "insert into tb_fornecedores (cpnj_fornecedor, nome_fornecedor, cep_fornecedor, email_fornecedor) values (?, ?, ?, ?)";

        conn = new ConnectionDAO().connectDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfornecedordto.getCnpj_fornecedor());
            pstm.setString(2, objfornecedordto.getNome_fornecedor());
            pstm.setString(3, objfornecedordto.getCep_fornecedor());
            pstm.setString(4, objfornecedordto.getEmail_fornecedor());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Fornecedor cadastrada com sucesso!");

        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "FornecedorDAO Cadastrar " + error);
        }
    }

    public ArrayList<FornecedorDTO> PesquisarFornecedor() {

        String sql = "select * from tb_fornecedores";

        conn = new ConnectionDAO().connectDB();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                FornecedorDTO objfornecedordto = new FornecedorDTO();
                objfornecedordto.setId_fornecedor(rs.getInt("id_fornecedor"));
                objfornecedordto.setNome_fornecedor(rs.getString("nome_fornecedor"));
                objfornecedordto.setCnpj_fornecedor(rs.getString("cpnj_fornecedor"));
                objfornecedordto.setCep_fornecedor(rs.getString("cep_fornecedor"));
                objfornecedordto.setEmail_fornecedor(rs.getString("email_fornecedor"));

                lista.add(objfornecedordto);
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO Pesquisar " + error);
        }

        return lista;
    }

    public ResultSet fornecedoresCBX() {

        conn = new ConnectionDAO().connectDB();
        String sql = "select * from tb_fornecedores";

        try {

            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO ComboBox " + error);
            return null;
        }

    }

    public void AlterarFornecedor(FornecedorDTO objfornecedordto) {

        String sql = "update tb_fornecedores set cpnj_fornecedor = ? ,nome_fornecedor = ?, cep_fornecedor = ?, email_fornecedor = ? where id_fornecedor = ?";

        conn = new ConnectionDAO().connectDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfornecedordto.getCnpj_fornecedor());
            pstm.setString(2, objfornecedordto.getNome_fornecedor());
            pstm.setString(3, objfornecedordto.getCep_fornecedor());
            pstm.setString(4, objfornecedordto.getEmail_fornecedor());
            pstm.setInt(5, objfornecedordto.getId_fornecedor());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Fornecedor alterada com sucesso!");

        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "FornecedorDAO Alterar " + error);
        }
    }

    public void ExcluirFornecedor(FornecedorDTO objfornecedordto) {

        String sql = "delete from tb_fornecedores where id_fornecedor = ?";

        conn = new ConnectionDAO().connectDB();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objfornecedordto.getId_fornecedor());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Fornecedor excluído com sucesso!");

        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "FornecedorDAO Excluir " + error);
        }
    }
}
