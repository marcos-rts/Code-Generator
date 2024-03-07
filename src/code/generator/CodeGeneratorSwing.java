/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code.generator;

/**
 *
 * @author admin_hachiman
 */
public class CodeGeneratorSwing extends javax.swing.JFrame {

    /**
     * Creates new form CodeGeneratorSwing
     */
    public CodeGeneratorSwing() {
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

        txtTexto = new javax.swing.JTextField();
        lblMensagem = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTexto.setText("Digite aqui");
        txtTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoActionPerformed(evt);
            }
        });

        lblMensagem.setText("Palavra:");

        btnClick.setText("Gerar");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });

        lblResultado.setText("Resultado vai aparecer aqui");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnClick))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMensagem)
                                .addGap(18, 18, 18)
                                .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensagem))
                .addGap(31, 31, 31)
                .addComponent(btnClick)
                .addGap(42, 42, 42)
                .addComponent(lblResultado)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTextoActionPerformed

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        // TODO add your handling code here:
        String palavra = txtTexto.getText();
        int soma = 0;
        int count = 0;
        String formula = "<html>";
        for (int i = 0; i < palavra.length(); i++) {
            // Verifica se o caractere não é um espaço em branco
            if (palavra.charAt(i) != ' ') {
                // Imprime o caractere seguido do seu valor ASCII
                // System.out.printf("%c%03d\n", palavra.charAt(i), (int) palavra.charAt(i));
                formula += String.format ("%c%03d<br>", palavra.charAt(i), (int) palavra.charAt(i));
                // Adiciona o valor ASCII do caractere à soma
                soma += (int) palavra.charAt(i);
                // Incrementa o contador de letras
                count++;
            }
        }
        if (count > 0) {
            // Calcula a média dos valores ASCII
            double media = (double) soma / count;
            // Arredonda a média para o número inteiro mais próximo
            int media_arredondada = (int) Math.round(media);
            // Imprime a média arredondada e a letra correspondente ao valor arredondado
            String complemento = String.format("Média arredondada dos valores ASCII: %d - Letra correspondente: %c\n", media_arredondada, (char) media_arredondada);
            String resultado = String.format("<br>Codigo = %d%c </html>", media_arredondada, (char) media_arredondada);
            lblResultado.setText(formula + complemento + resultado);
        } else {
            // Caso nenhuma letra seja encontrada na palavra inserida
            System.out.println("Nenhuma letra encontrada para calcular a média.");
        }
        
    }//GEN-LAST:event_btnClickActionPerformed

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
            java.util.logging.Logger.getLogger(CodeGeneratorSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodeGeneratorSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodeGeneratorSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodeGeneratorSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CodeGeneratorSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}
