package Visao.Alterar;


import DAO.ClienteDAO;
import DAO.Conexao;
import Modelo.Cliente;
import java.sql.Connection;
import java.util.*;
import javax.swing.JOptionPane;

public class AlterarCliente extends javax.swing.JFrame {
  public AlterarCliente() {
        initComponents();
    }
    
    private void InserirDados(int cod) {
        
        Connection con = Conexao.AbrirConexao();
        ClienteDAO sql = new ClienteDAO(con);
        List<Cliente> lista = new ArrayList<>();
        lista = sql.CapturarCliente(cod);
        
        for (Cliente a : lista){
            jTF_Codigo.setText("" + a.getCodigo());
            Nome.setText(a.getNome());
            jTF_CEP.setText(a.getCEP());
            jTF_Numero.setText("" + a.getNumero());
            jTF_Bairro.setText(a.getBairro());
            jTF_Email.setText(a.getEmail());
            JTF_Telefone.setText(a.getTelefone());
            jTF_Rua.setText(a.getRua());
            jTF_Nascimento.setText(a.getNascimento());
            jTF_RG.setText(a.getRG());
            jTF_CPF.setText(a.getCPF());
            
            
        }
        Conexao.FecharConexao(con); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTF_Codigo = new javax.swing.JTextField();
        btOK = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btalterar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jTF_RG = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTF_CPF = new javax.swing.JTextField();
        JTF_Telefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTF_Numero = new javax.swing.JTextField();
        jTF_Rua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTF_Nascimento = new javax.swing.JTextField();
        jTF_Bairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTF_CEP = new javax.swing.JTextField();
        jTF_Email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("                               Alterar Cliente");

        jLabel1.setText("Digite o código:");

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btalterar.setText("Alterar");
        btalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome: ");

        jLabel3.setText("RG:");

        jLabel4.setText("Telefone: ");

        jLabel5.setText("Rua:");

        jLabel6.setText("Bairro: ");

        jLabel7.setText("Email:");

        jLabel8.setText("CPF:");

        jLabel9.setText("Data de Nascimento:");

        jLabel10.setText("N°:");

        jLabel11.setText("CEP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Nome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTF_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTF_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTF_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)
                                .addComponent(jTF_Nascimento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTF_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12)
                                .addComponent(jTF_CPF))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTF_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTF_CEP))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)
                        .addComponent(jTF_Email)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOK))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTF_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTF_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTF_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTF_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTF_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTF_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTF_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTF_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
     String codigo = jTF_Codigo.getText();
     Connection con = Conexao.AbrirConexao();
     ClienteDAO sql = new ClienteDAO(con);
     int cod = Integer.parseInt(codigo);
     if (sql.Testar_Cliente(cod) == false) {
         JOptionPane.showMessageDialog(null, "Codigo não Encontrado no Banco",
                 "Video Locadora", JOptionPane.ERROR_MESSAGE); 
    
     }
     if (codigo.equals("")){
         JOptionPane.showMessageDialog(null, "Digite um CoDIGO para Atualizar",
      "Video Locadora", JOptionPane.WARNING_MESSAGE);
     }
     
     jTF_Codigo.setText("");
     Nome.setText("");
     jTF_CEP.setText("");
     jTF_Numero.setText("");
     jTF_Bairro.setText("");
     jTF_Email.setText("");
     JTF_Telefone.setText("");
     jTF_Rua.setText("");
     jTF_Nascimento.setText("");
     jTF_RG.setText("");
     jTF_CPF.setText("");
     
     InserirDados(cod);
    Conexao.FecharConexao(con);
     jTF_Codigo.setText("");
    
    }//GEN-LAST:event_btOKActionPerformed

    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed
       String codigo = jTF_Codigo.getText();
       String nome = Nome.getText();
       String nascimento = jTF_Nascimento.getText();
       String cep = jTF_CPF.getText();
       String rua = jTF_Rua.getText();
       String numero = jTF_Numero.getText();
       String bairro = jTF_Bairro.getText();
       String email = jTF_Email.getText();
       String fone = JTF_Telefone.getText();
       String cpf = jTF_CPF.getText();
       String rg = jTF_RG.getText();
       if (nome.equals("")) {
           JOptionPane.showMessageDialog(null, "nenhum campo pode estar vazio"
           , "Video Locadora", JOptionPane.WARNING_MESSAGE);
       } else {
           Connection con = Conexao.AbrirConexao();
           ClienteDAO sql = new ClienteDAO(con);
           int num = Integer.parseInt(numero);
           int cod = Integer.parseInt(codigo);
           Cliente a = new Cliente(); 
           
          a.setCodigo(cod);
          a.setNome(nome);
          a.setNascimento(nascimento);
          a.setRG(rg);
          a.setCPF(cpf);
          a.setNumero(num);
          a.setBairro(bairro);
          a.setCEP(cep);
          a.setRua(rua);
          a.setEmail(email);
          a.setTelefone(fone);
          
          sql.Alterar_Cliente(a);
          Conexao.FecharConexao(con);
          Nome.setText("");
          jTF_CEP.setText("");
          jTF_Numero.setText("");
          jTF_Bairro.setText("");
          jTF_Email.setText("");
          JTF_Telefone.setText("");
          jTF_Rua.setText("");
          jTF_Nascimento.setText("");
          jTF_RG.setText("");
          jTF_CPF.setText("");
          
          JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso", "Vídeo Locadora", JOptionPane.INFORMATION_MESSAGE);
          dispose();
          
       }
    
    }//GEN-LAST:event_btalterarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCliente().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTF_Telefone;
    private javax.swing.JTextField Nome;
    private javax.swing.JButton btOK;
    private javax.swing.JButton btalterar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTF_Bairro;
    private javax.swing.JTextField jTF_CEP;
    private javax.swing.JTextField jTF_CPF;
    private javax.swing.JTextField jTF_Codigo;
    private javax.swing.JTextField jTF_Email;
    private javax.swing.JTextField jTF_Nascimento;
    private javax.swing.JTextField jTF_Numero;
    private javax.swing.JTextField jTF_RG;
    private javax.swing.JTextField jTF_Rua;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

