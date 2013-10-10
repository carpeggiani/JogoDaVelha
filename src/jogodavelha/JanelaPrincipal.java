/* 
 * Inteligência Artificial I
 * Aplicativo: Jogo da Velha
 * Classe: JanelaPrincipal
 * 
 * Alunos
 *  Eliezer Emanuel Bernart
 *  Vinicius Mores
 *  Vagner Lucas Gomes
 *  Willian Carpegiani
 * 
 * Descrição
 *  Classe que implementa a incialização dos objetos e contém os dados da
 *  interface da aplicação,
 * 
 */

package jogodavelha;

import java.awt.Font;

public class JanelaPrincipal extends javax.swing.JFrame {

    int dimensao = 3;
    // Matriz de Jogo
    Velha velha[][] = new Velha[dimensao][dimensao];
    // Métodos de Controle da partida
    Controlador controlador;

    public JanelaPrincipal() {
        initComponents();
        /*
         * Inicialização de cada um objetos e a adição de um evento para tratar 
         * gerenciar os eventos do mouse.
         */
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                velha[i][j] = new Velha();
                velha[i][j].setFont(new Font("Ubuntu", Font.BOLD, 48));
                velha[i][j].addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        clicarBotao(evt);
                    }
                });
                jPanel2.add(velha[i][j]);
            }
        }
        // Inicializa o Controlador com os dados necessários
        controlador = new Controlador(velha, placarJogador, placarComputador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoAlgoritmo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        radioMinimax = new javax.swing.JRadioButton();
        radioAlfaBeta = new javax.swing.JRadioButton();
        botaoReiniciar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelVoce = new javax.swing.JLabel();
        labelComputador = new javax.swing.JLabel();
        placarJogador = new javax.swing.JTextField();
        placarComputador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha - Minimax | PodaAlfa - Eliezer, Vinicius, Vagner, Willian");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o seu algoritmo:"));

        grupoAlgoritmo.add(radioMinimax);
        radioMinimax.setSelected(true);
        radioMinimax.setText("Minimax");
        radioMinimax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMinimaxActionPerformed(evt);
            }
        });

        grupoAlgoritmo.add(radioAlfaBeta);
        radioAlfaBeta.setText("Poda AlfaBeta");

        botaoReiniciar.setText("Reiniciar");
        botaoReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioMinimax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(radioAlfaBeta, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoReiniciar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMinimax)
                    .addComponent(radioAlfaBeta)
                    .addComponent(botaoReiniciar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(374, 374));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Placar");

        labelVoce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVoce.setText("Você");

        labelComputador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelComputador.setText("Computador");

        placarJogador.setEditable(false);
        placarJogador.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        placarJogador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placarJogador.setText("0");

        placarComputador.setEditable(false);
        placarComputador.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        placarComputador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placarComputador.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelVoce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(placarJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelComputador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(placarComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVoce)
                            .addComponent(labelComputador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(placarJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placarComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Evento para tratar as jogadas e verificar se a partida teve fim ou não
    private void clicarBotao(java.awt.event.ActionEvent evt) {
        verificaBotao((Velha) evt.getSource());
        if (controlador.determinarVencedor(controlador.verificarPartida()) < 3) {
            reiniciar();
        } else {
            controlador.jogarMaquina();
            if (controlador.determinarVencedor(controlador.verificarPartida()) < 3) {
                reiniciar();
            }
        }
    }

    private void radioMinimaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMinimaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMinimaxActionPerformed

    private void botaoReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_botaoReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Define o botão como um campo que já foi utilizado
    public void verificaBotao(Velha botao) {
        if (botao.isSelected()) {
            botao.setText("X");
            botao.setEnabled(false);
            botao.setValue(1);
        }
    }

    // Volta a partida para o estado inicial do jogo
    public void reiniciar() {
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                velha[i][j].setText("");
                velha[i][j].setValue(9);
                velha[i][j].setEnabled(true);
                velha[i][j].setSelected(false);
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoReiniciar;
    private javax.swing.ButtonGroup grupoAlgoritmo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelComputador;
    private javax.swing.JLabel labelVoce;
    private javax.swing.JTextField placarComputador;
    private javax.swing.JTextField placarJogador;
    private javax.swing.JRadioButton radioAlfaBeta;
    private javax.swing.JRadioButton radioMinimax;
    // End of variables declaration//GEN-END:variables
}
