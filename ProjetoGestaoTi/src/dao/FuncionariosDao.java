/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Funcionarios;
import view.FormMenu;

/**
 *
 * @author adaatii
 */
public class FuncionariosDao {

    //Conexão BD
    private Connection con;

    public FuncionariosDao() {

        this.con = new ConnectionFactory().getConnection();

    }

    //Método Cadastrar Funcionário
    public void cadastrarFuncionarios(Funcionarios obj) {
        try {
            //Criar comando SQL insere nos campos da tabela Clientes os valores 
            //1° pega o valor(Get) do campo e já atribui(Set) ao BD             
            String sql = "insert into tb_funcionarios (nome,rg,cpf,email,senha,cargo,nivel_acesso,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            //Conectar banco de dados e organizar o comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel_acesso());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());
        

            //Executar o comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }

    // Método Lista Funcionário
    public List<Funcionarios> listarFuncionarios() {

        try {

            //1° Criar a Lista
            List<Funcionarios> lista = new ArrayList<>();

            //2° Criar o sql, organizar e executar
            //Comando SQL (seleciona tudo da tabela clientes)
            String sql = "select * from tb_funcionarios";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionarios obj = new Funcionarios();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));
                
                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }

    }

    //Método Alterar Funcionário
    public void alterarFuncionarios(Funcionarios obj) {
        try {
            //Criar comando SQL altera nos campos da tabela Clientes os valores           
            String sql = "update tb_funcionarios set nome=?,rg=?,cpf=?,email=?,senha=?,cargo=?,nivel_acesso=?,telefone=?,celular=?,cep=?,endereco=?,"
                    + "numero=?,complemento=?,bairro=?,cidade=?,estado=? where id=?";

            //Conectar banco de dados e organizar o comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel_acesso());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());            
            stmt.setInt(17, obj.getId());
          

            //Executar o comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }

    //Método Excluir Funcionário
    public void exluirFuncionarios(Funcionarios obj) {
        try {
            //Criar comando SQL deleta nos campos da tabela Clientes os valores 

            String sql = "delete from tb_funcionarios where id = ?";

            //Conectar banco de dados e organizar o comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());

            //Executar o comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }

    //Metodo Buscar Funcionario por nome - retorna uma Lista
    public List<Funcionarios> buscaFuncionarioNome(String nome){
        
        try {
            
            //1° Criar a Lista 
            List<Funcionarios> lista = new ArrayList<>();
            
            //2° Criar o sql, organizar e executar
            //Comando SQL (seleciona tudo da tabela clientes)
            String sql ="select * from tb_funcionarios where nome like ?";          
            PreparedStatement stmt =con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionarios obj = new Funcionarios();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));
                                
                lista.add(obj);
            }
            
            return lista;
                    
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro: "+erro);
            return null;
        }
    
    }
    
    //Método Efetua Login
    public void efetuaLogin(String email, String senha){
        try {
            //1° passo -SQL
            String sql = "select*from tb_funcionarios where email=? and senha=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            ResultSet rs= stmt.executeQuery();
            
            if(rs.next()){
                //Usuario Logou
                JOptionPane.showMessageDialog(null, "Seja bem vindo ao Sistema");
                FormMenu menu = new FormMenu();
                menu.setVisible(true);
            }else{
                //Dados incorretos
                JOptionPane.showMessageDialog(null, "Dados incorretos");
            }
            
            
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: "+erro);
        }
        
        
    }
}
