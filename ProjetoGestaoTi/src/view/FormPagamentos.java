/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Funcoes;
import dao.ItemVendaDao;
import dao.ProdutosDao;
import dao.VendasDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Clientes;
import model.ItemVenda;
import model.Produtos;
import model.Vendas;

/**
 *
 * @author adaatii
 */
public class FormPagamentos extends javax.swing.JFrame {

    Clientes cliente = new Clientes();
    DefaultTableModel carrinho;

    public FormPagamentos() {
        initComponents();
        txtCartao.setText("0");
        txtCheque.setText("0");
        txtDinheiro.setText("0");
        txtTroco.setText("0");
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
        btnRetornar2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDinheiro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCartao = new javax.swing.JTextField();
        txtCheque = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnPagamento = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Pagamentos");

        jPanel1.setBackground(new java.awt.Color(14, 89, 235));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pagamento");

        btnRetornar2.setBackground(new java.awt.Color(14, 89, 235));
        btnRetornar2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnRetornar2.setForeground(new java.awt.Color(255, 255, 255));
        btnRetornar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar(small).png"))); // NOI18N
        btnRetornar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(btnRetornar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnRetornar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Dinheiro:");

        txtDinheiro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Cartão:");

        txtCartao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtCheque.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Cheque:");

        txtTroco.setEditable(false);
        txtTroco.setBackground(new java.awt.Color(204, 204, 204));
        txtTroco.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("Troco:");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        btnPagamento.setBackground(new java.awt.Color(14, 89, 235));
        btnPagamento.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        btnPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnPagamento.setText("Finalizar Pagamento");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel9.setText("Observações:");

        txtObs.setColumns(20);
        txtObs.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel8)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        int op;
        Object[] options = { "Cancelar", "Confirmar" };
        op = JOptionPane.showOptionDialog(null, "Confirma finalização do pagamento?", "Pagamento", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if(op == 1){
            double pagcartao, pagdinheiro, pagcheque, totalpago, totalvenda, troco;

            pagcartao = Double.parseDouble(txtCartao.getText());
            pagcheque = Double.parseDouble(txtCheque.getText());
            pagdinheiro = Double.parseDouble(txtDinheiro.getText());
            totalvenda = Double.parseDouble(txtTotal.getText());

            // Calculo do Troco
            totalpago = pagcartao + pagcheque + pagdinheiro;

            troco = totalpago - totalvenda;
            txtTroco.setText(String.valueOf(troco));
            if (totalpago >= totalvenda) {
                Vendas objvenda = new Vendas();

                // Dados do cliente (ID)
                objvenda.setCliente(cliente);

                //Pega data atual        
                Date data = new Date();
                SimpleDateFormat dataEUA = new SimpleDateFormat("yyyy-MM-dd");
                String datamysql = dataEUA.format(data);

                objvenda.setData_venda(datamysql);

                // Total da venda
                objvenda.setTotal_venda(totalvenda);

                //Observações
                objvenda.setObs(txtObs.getText());

                VendasDao dao_venda = new VendasDao();
                dao_venda.cadastrarVenda(objvenda);
            
                //Retornar o ID da ultima venda realizada
                objvenda.setId(dao_venda.retornaUltimaVenda());
            
            //System.out.println("Id da ultima venda "+ objvenda.getId());
                //Cadastrando os produtos na tabela itensvendas
            
                for(int i = 0 ;i < carrinho.getRowCount(); i++){
                    int qtd_estoque, qtd_comprada,qtd_atualizada;
                
                    Produtos objp = new Produtos();
                    ProdutosDao dao_produtos = new ProdutosDao();
                        
                 
                    ItemVenda item = new ItemVenda();
                    item.setVenda(objvenda);
                
               
                    objp.setId(Integer.parseInt(carrinho.getValueAt(i,0).toString()));
                    item.setProduto(objp);
                    item.setQtd(Integer.parseInt(carrinho.getValueAt(i,2).toString()));
                    item.setSubtotal(Double.parseDouble(carrinho.getValueAt(i,4).toString()));
                
                    //Baixa no estoque
                    qtd_estoque = dao_produtos.retornaEstoqueAtual(objp.getId());
                    qtd_comprada = Integer.parseInt(carrinho.getValueAt(i,2).toString());
                    qtd_atualizada = qtd_estoque - qtd_comprada;
//                    System.out.println(qtd_estoque);
//                    System.out.println(qtd_atualizada);
                
                    dao_produtos.baixarEstoque(objp.getId(), qtd_atualizada);
                
                    ItemVendaDao daoitem = new ItemVendaDao();
                    daoitem.cadastrarItem(item);
                
                
            }
            /****************************************************************************/
            
             JOptionPane.showMessageDialog(null, "Venda registrada com sucesso com sucesso!");

        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada: valor menor que o total da compra.");
       }

        }
    }//GEN-LAST:event_btnPagamentoActionPerformed

    private void btnRetornar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornar2ActionPerformed
        // TODO add your handling code here:
        Funcoes obj = new Funcoes();
        obj.retornar();
        this.dispose();
    }//GEN-LAST:event_btnRetornar2ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnRetornar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCartao;
    private javax.swing.JTextField txtCheque;
    private javax.swing.JTextField txtDinheiro;
    private javax.swing.JTextArea txtObs;
    public javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables
}
