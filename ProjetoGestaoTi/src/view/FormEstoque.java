/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.ProdutosDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produtos;
import model.Utilitarios;

/**
 *
 * @author adaatii
 */
public class FormEstoque extends javax.swing.JFrame {

    int idprod, qtd_atualizada;

    //Método Lista na tabela
    public void listar() {

        ProdutosDao dao = new ProdutosDao();
        List<Produtos> lista = dao.listarProdutos();
        DefaultTableModel dado = (DefaultTableModel) tabelaEstoque.getModel();
        dado.setNumRows(0);

        for (Produtos cont : lista) {
            dado.addRow(new Object[]{
                cont.getId(),
                cont.getDescricao(),
                cont.getPreco(),
                cont.getQtd_estoque(),
                cont.getFornecedor().getNome()

            });
        }
    }

    /**
     * Creates new form FormHistorico
     */
    public FormEstoque() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRetornar = new javax.swing.JButton();
        painelConsultaProd = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        txtEstoqueAtual = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(14, 89, 235));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estoque");

        btnRetornar.setBackground(new java.awt.Color(14, 89, 235));
        btnRetornar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnRetornar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar(small).png"))); // NOI18N
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(btnRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(606, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        painelConsultaProd.setBackground(new java.awt.Color(255, 255, 255));
        painelConsultaProd.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Produtos"));

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setText("Descrição:");

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setText("Estoque Atual:");

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setText("Qtd:");

        txtDescricao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtQtd.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtEstoqueAtual.setEditable(false);
        txtEstoqueAtual.setBackground(new java.awt.Color(204, 204, 204));
        txtEstoqueAtual.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel12.setText("Código:");

        txtCodigo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        javax.swing.GroupLayout painelConsultaProdLayout = new javax.swing.GroupLayout(painelConsultaProd);
        painelConsultaProd.setLayout(painelConsultaProdLayout);
        painelConsultaProdLayout.setHorizontalGroup(
            painelConsultaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaProdLayout.createSequentialGroup()
                .addGroup(painelConsultaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConsultaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelConsultaProdLayout.createSequentialGroup()
                        .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDescricao)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConsultaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        painelConsultaProdLayout.setVerticalGroup(
            painelConsultaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaProdLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(painelConsultaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaProdLayout.createSequentialGroup()
                        .addGroup(painelConsultaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelConsultaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaProdLayout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addGap(29, 29, 29)))
                .addGroup(painelConsultaProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar))
                .addGap(23, 23, 23))
        );

        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço", "Qtd. Estoque", "Fornecedor"
            }
        ));
        tabelaEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEstoque);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelConsultaProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelConsultaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String nome = "%" + txtDescricao.getText() + "%";
        
        if(!txtDescricao.getText().equals("")){
            
        ProdutosDao dao = new ProdutosDao();
        List<Produtos> lista = dao.buscaProdutosNome(nome);
        DefaultTableModel dado = (DefaultTableModel) tabelaEstoque.getModel();
        dado.setNumRows(0);

        for (Produtos cont : lista) {
            dado.addRow(new Object[]{
                cont.getId(),
                cont.getDescricao(),
                cont.getPreco(),
                cont.getQtd_estoque(),
                cont.getFornecedor().getNome()

            });

        }
        }else if(!txtCodigo.getText().equals("")){
        int cod = Integer.parseInt(txtCodigo.getText());
        ProdutosDao dao = new ProdutosDao();
            
        List<Produtos> lista = dao.listarProdutosCodigo(cod);
        DefaultTableModel dado = (DefaultTableModel) tabelaEstoque.getModel();
        dado.setNumRows(0);

        for (Produtos cont : lista) {
            dado.addRow(new Object[]{
                cont.getId(),
                cont.getDescricao(),
                cont.getPreco(),
                cont.getQtd_estoque(),
                cont.getFornecedor().getNome()

            });

        }
        }else{
            JOptionPane.showMessageDialog(null, "Para pesquisa preencha o Código ou a Descrição do produto.");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (txtQtd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo Qtd está vázio");
        } else {
            if (Integer.parseInt(txtQtd.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "A Qtd informada não pode ser menor que 0");
            } else {
                try {
                    int op;
                    Object[] options = {"Cancelar", "Confirmar"};
                    op = JOptionPane.showOptionDialog(null, "Confirma inclusão da Qtd: " + txtQtd.getText() + " no estoque ?", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
                    if (op == 1) {
                        int qtd_estoque, qtd;
                        qtd_estoque = Integer.parseInt(txtEstoqueAtual.getText());

                        qtd = Integer.parseInt(txtQtd.getText());

                        qtd_atualizada = qtd_estoque + qtd;

                        ProdutosDao dao = new ProdutosDao();

                        dao.atualizarEstoque(idprod, qtd_atualizada);

                        JOptionPane.showMessageDialog(null, "Estoque do Atualizado");
                         new Utilitarios().LimparTela(painelConsultaProd);
                    } else {
                        txtQtd.setText("");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Selecione o Produto ou Informe nova Quantidade");
                }
            }

        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEstoqueMouseClicked

        idprod = Integer.parseInt(tabelaEstoque.getValueAt(tabelaEstoque.getSelectedRow(), 0).toString());
        txtCodigo.setText(tabelaEstoque.getValueAt(tabelaEstoque.getSelectedRow(), 0).toString());
        txtDescricao.setText(tabelaEstoque.getValueAt(tabelaEstoque.getSelectedRow(), 1).toString());
        txtEstoqueAtual.setText(tabelaEstoque.getValueAt(tabelaEstoque.getSelectedRow(), 3).toString());


    }//GEN-LAST:event_tabelaEstoqueMouseClicked

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRetornarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelConsultaProd;
    public javax.swing.JTable tabelaEstoque;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtDescricao;
    public javax.swing.JTextField txtEstoqueAtual;
    public javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
