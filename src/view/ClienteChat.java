/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import controller.*;
import model.Cidade;
import model.Noticia;

/**
 *
 * @author cpa
 */
public class ClienteChat extends javax.swing.JFrame {

    /**
     * Creates new form Chat
     */
    Interpretador interpretador = new Interpretador();
    boolean isPrevisao = false;

    public ClienteChat() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaChat = new javax.swing.JTextArea();
        jTextFieldMensagem = new javax.swing.JTextField();
        btEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setResizable(false);

        jTextAreaChat.setEditable(false);
        jTextAreaChat.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaChat.setColumns(20);
        jTextAreaChat.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaChat.setForeground(new java.awt.Color(0, 255, 102));
        jTextAreaChat.setRows(5);
        jScrollPane1.setViewportView(jTextAreaChat);

        jTextFieldMensagem.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldMensagem.setForeground(new java.awt.Color(0, 153, 0));
        jTextFieldMensagem.setText("Escreva aqui sua mensagem...");
        jTextFieldMensagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldMensagemMouseClicked(evt);
            }
        });
        jTextFieldMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMensagemActionPerformed(evt);
            }
        });
        jTextFieldMensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMensagemKeyPressed(evt);
            }
        });

        btEnviar.setBackground(new java.awt.Color(0, 0, 255));
        btEnviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/chatbot.jpg"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Vrinda", 1, 52)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("iBot");

        btLimpar.setBackground(new java.awt.Color(255, 0, 0));
        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String horaMsg() {
        String min;
        if (LocalTime.now().getMinute() < 10) {
            min = "0" + String.valueOf(LocalTime.now().getMinute());
        } else {
            min = String.valueOf(LocalTime.now().getMinute());
        }
        String hora = String.valueOf(LocalTime.now().getHour());
        String horario = hora + ":" + min;
        return horario;
    }

    public String modeloResposta() {

        return jTextAreaChat.getText() + "(" + horaMsg() + ") Francisquinho: ";
    }

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed

        jTextAreaChat.setText(jTextAreaChat.getText() + "(" + horaMsg() + ") Eu: " + jTextFieldMensagem.getText() + "\n"); // atualiza a text area com a nova mensagem.

        int retorno = interpretador.isComando(jTextFieldMensagem.getText());
        jTextFieldMensagem.setText("");
        if (retorno == 1) {
            jTextAreaChat.setText(modeloResposta() + "Estes são os meus criadores\nRafael Mardegan\nRafael Torres\nVagner Ereno");

        } else if (retorno == 2) {

            ServidorNoticias executa = ServidorNoticias.getInstancia();
            ManipuladorJsonNoticia json = new ManipuladorJsonNoticia(0);
            ManipuladorJsonNoticia json2 = new ManipuladorJsonNoticia(2);
            ManipuladorJsonNoticia json3 = new ManipuladorJsonNoticia(4);

            Noticia selecionada = json.preenchendoDadosCidadeEscolhida();
            Noticia selecionada2 = json2.preenchendoDadosCidadeEscolhida();
            Noticia selecionada3 = json3.preenchendoDadosCidadeEscolhida();

            jTextAreaChat.setText(modeloResposta() + "Autor: " + selecionada.getAutor() + "\n");
            jTextAreaChat.setText(modeloResposta() + "Título: " + selecionada.getTitulo() + "\n");

            jTextAreaChat.setText(modeloResposta() + "Resumo: " + selecionada.getTitulo() + "\n");
            for (int i = 0; i < selecionada.getResumo().size(); i++) {
                jTextAreaChat.setText(modeloResposta() + selecionada.getResumo().get(i).toString() + "\n");
                //System.out.println(selecionada.getResumo().get(i).toString());
            }

            jTextAreaChat.setText(modeloResposta() + "Veja a notícia completa em: \n" + selecionada.getSensacaoTermica() + "\n\n=============================\n\n");

            jTextAreaChat.setText(modeloResposta() + "Autor: " + selecionada2.getAutor() + "\n");
            jTextAreaChat.setText(modeloResposta() + "Título: " + selecionada2.getTitulo() + "\n");

            jTextAreaChat.setText(modeloResposta() + "Resumo: " + selecionada2.getTitulo() + "\n");
            for (int i = 0; i < selecionada2.getResumo().size(); i++) {
                jTextAreaChat.setText(modeloResposta() + selecionada2.getResumo().get(i).toString() + "\n");

            }

            jTextAreaChat.setText(modeloResposta() + "Veja a notícia completa em: \n" + selecionada2.getSensacaoTermica() + "\n\n=============================\n\n");

            jTextAreaChat.setText(modeloResposta() + "Autor: " + selecionada3.getAutor() + "\n");
            jTextAreaChat.setText(modeloResposta() + "Título: " + selecionada3.getTitulo() + "\n");

            jTextAreaChat.setText(modeloResposta() + "Resumo: " + selecionada3.getTitulo() + "\n");
            for (int i = 0; i < selecionada3.getResumo().size(); i++) {
                jTextAreaChat.setText(modeloResposta() + selecionada3.getResumo().get(i).toString() + "\n");
                //System.out.println(selecionada.getResumo().get(i).toString());
            }

            jTextAreaChat.setText(modeloResposta() + "Veja a notícia completa em: \n" + selecionada3.getSensacaoTermica() + "\n\n=============================\n\n");

        }
        else if (retorno == 3) {
            isPrevisao = true;
           
            
        }

    }//GEN-LAST:event_btEnviarActionPerformed

    private void jTextFieldMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMensagemActionPerformed

    }//GEN-LAST:event_jTextFieldMensagemActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        jTextAreaChat.setText("");
    }//GEN-LAST:event_btLimparActionPerformed
    int clics = 0;
    private void jTextFieldMensagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldMensagemMouseClicked
        clics++;
        if (clics == 1) {
            jTextFieldMensagem.setText("");
        }

    }//GEN-LAST:event_jTextFieldMensagemMouseClicked

    private void jTextFieldMensagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMensagemKeyPressed

    }//GEN-LAST:event_jTextFieldMensagemKeyPressed

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
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteChat().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaChat;
    private javax.swing.JTextField jTextFieldMensagem;
    // End of variables declaration//GEN-END:variables
}