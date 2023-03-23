package dao;

import java.lang.runtime.ObjectMethods;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dto.EmpresaDTO;

public class EmpresaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<EmpresaDTO> lista = new ArrayList<>();

    public void cadastrarEmpresa(EmpresaDTO objempresadto) {

        String sql = "insert into tb_empresas (cpnj_empresa, nome_empresa, cep_empresa, id_fornecedor) values (?, ?, ?, ?)";

        conn = new ConnectionDAO().connectDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objempresadto.getCnpj_empresa());
            pstm.setString(2, objempresadto.getNome_empresa());
            pstm.setString(3, objempresadto.getCep_empresa());
            pstm.setInt(4, objempresadto.getId_fornecedor());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Empresa cadastrada com sucesso!");

        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "EmpresaDAO Cadastrar " + error);
        }
    }

    public ArrayList<EmpresaDTO> PesquisarEmpresa() {

        String sql = "select * from tb_empresas";

        conn = new ConnectionDAO().connectDB();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                EmpresaDTO objempresadto = new EmpresaDTO();
                objempresadto.setId_empresa(rs.getInt("id_empresa"));
                objempresadto.setNome_empresa(rs.getString("nome_empresa"));
                objempresadto.setCnpj_empresa(rs.getString("cpnj_empresa"));
                objempresadto.setCep_empresa(rs.getString("cep_empresa"));

                lista.add(objempresadto);
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "EmpresaDAO Pesquisar " + error);
        }

        return lista;
    }

    public void AlterarEmpresa(EmpresaDTO objempresadto) {

        String sql = "update tb_empresas set cpnj_empresa = ? ,nome_empresa = ?, cep_empresa = ? where id_empresa = ?";

        conn = new ConnectionDAO().connectDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objempresadto.getCnpj_empresa());
            pstm.setString(2, objempresadto.getNome_empresa());
            pstm.setString(3, objempresadto.getCep_empresa());
            pstm.setInt(4, objempresadto.getId_empresa());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Empresa alterada com sucesso!");

        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "EmpresaDAO Alterar " + error);
        }
    }

    public void ExcluirEmpresa(EmpresaDTO objempresadto) {

        String sql = "delete from tb_empresas where id_empresa = ?";

        conn = new ConnectionDAO().connectDB();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objempresadto.getId_empresa());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Empresa excluída com sucesso!");

        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "EmpresaDAO Excluir " + error);
        }
    }
}
