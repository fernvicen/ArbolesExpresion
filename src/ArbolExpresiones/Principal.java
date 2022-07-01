package ArbolExpresiones;

import cIntermedio.Polaca;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        ((JLabel) cbMenu.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#009999"));
    }

    public static String imprimePosfija(String infijo) {
        PosFija posfijaResultado = new PosFija();
        OpePila pila = posfijaResultado.Conversion(infijo);
        String obtener = "";
        while (pila.i > 0) {
            obtener = pila.pop() + obtener;
        }
        return obtener;
    }

    public static String imprimePrefija(String infijo) {
        PreFija infijaResultado = new PreFija();
        OpePila pila = infijaResultado.Conversion(infijo);
        String obtener = "";
        while (pila.i > 0) {
            obtener = pila.pop() + obtener;
        }
        String salidaIn = "";
        for (int i = obtener.length() - 1; i >= 0; i--) {
            salidaIn += obtener.charAt(i);
        }
        return salidaIn;
    }

    public static String imprimeInfija(String infijo) {
        String inicio = infijo.substring(0, infijo.length() - 1);
        String salida = inicio.substring(1);
        return salida;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        txtExpresion = new javax.swing.JTextField();
        btnInfija = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jpDibujo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtPosfija = new javax.swing.JTextField();
        txtPrefija = new javax.swing.JTextField();
        txtInfija = new javax.swing.JTextField();
        cbMenu = new javax.swing.JComboBox<>();
        txtResultado = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        Panel.setBackground(new java.awt.Color(153, 255, 153));

        txtExpresion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtExpresion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnInfija.setBackground(new java.awt.Color(51, 51, 255));
        btnInfija.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnInfija.setForeground(new java.awt.Color(255, 255, 255));
        btnInfija.setText("Crear");
        btnInfija.setActionCommand("btnInfija");
        btnInfija.setBorderPainted(false);
        btnInfija.setDoubleBuffered(true);
        btnInfija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfijaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Árboles de Expresiones");

        btnNuevo.setBackground(new java.awt.Color(255, 51, 102));
        btnNuevo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setActionCommand("btnInfija");
        btnNuevo.setBorderPainted(false);
        btnNuevo.setDoubleBuffered(true);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 11)); // NOI18N
        jLabel2.setText("By: Fernando Juarez Vicente");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtExpresion)
                .addGap(18, 18, 18)
                .addComponent(btnInfija, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtExpresion)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInfija, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpDibujo.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jpDibujoLayout = new javax.swing.GroupLayout(jpDibujo);
        jpDibujo.setLayout(jpDibujoLayout);
        jpDibujoLayout.setHorizontalGroup(
            jpDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        jpDibujoLayout.setVerticalGroup(
            jpDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 18))); // NOI18N

        txtPosfija.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPosfija.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPosfija.setText("Expresión a Posfija: ");
        txtPosfija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosfijaActionPerformed(evt);
            }
        });

        txtPrefija.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPrefija.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrefija.setText("Expresión a Prefija: ");
        txtPrefija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrefijaActionPerformed(evt);
            }
        });

        txtInfija.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtInfija.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInfija.setText("Expresión a Infija: ");
        txtInfija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInfijaActionPerformed(evt);
            }
        });

        cbMenu.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Notación Polaca", "Código P", "Triplos", "Cuádruplos" }));
        cbMenu.setDoubleBuffered(true);
        cbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMenuActionPerformed(evt);
            }
        });

        txtResultado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado.setText(" ");
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 51, 102));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setActionCommand("btnInfija");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setDoubleBuffered(true);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInfija)
                    .addComponent(txtPosfija)
                    .addComponent(txtPrefija)
                    .addComponent(cbMenu, 0, 324, Short.MAX_VALUE)
                    .addComponent(txtResultado)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInfija, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPosfija, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrefija, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfijaActionPerformed
        try {
            String obtiene = txtExpresion.getText();
            Dibujo panel = new Dibujo(this.getWidth(), this.getHeight());
            panel.setLocation(-150, 0);
            panel.darletras(imprimePrefija(obtiene));
            jpDibujo.add(panel);
            //this.getContentPane().add(panel);
            repaint();
            txtInfija.setText(txtInfija.getText() + imprimeInfija(obtiene));
            txtPrefija.setText(txtPrefija.getText() + imprimePrefija(obtiene));
            txtPosfija.setText(txtPosfija.getText() + imprimePosfija(obtiene));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " Expresión Invalida \n Inténtalo de Nuevo", " A T E N C I Ó N ", JOptionPane.WARNING_MESSAGE);
            txtExpresion.setText("");
            txtExpresion.requestFocus();
        }
    }//GEN-LAST:event_btnInfijaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
            Principal ew = new Principal();
            ew.show();
            this.hide();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtPosfijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosfijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosfijaActionPerformed

    private void txtInfijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInfijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInfijaActionPerformed

    private void txtPrefijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrefijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrefijaActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMenuActionPerformed
        try {
            String obtiene = txtExpresion.getText();
            if (cbMenu.getSelectedIndex() == 0) {
                String prefija = imprimePrefija(obtiene);
                txtResultado.setText(Double.toString(Polaca.polaca(prefija)));
            }
            if (cbMenu.getSelectedIndex() == 1 || cbMenu.getSelectedIndex() == 2 || cbMenu.getSelectedIndex() == 3) {
                String prefija = imprimePrefija(obtiene);
                String infija = imprimeInfija(obtiene);
                Intermedio inte = new Intermedio(infija, prefija, Polaca.polaca(prefija));
                inte.show();
                this.hide();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Verifica tu expresión");
        }
    }//GEN-LAST:event_cbMenuActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    /*public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Recursos/img.png"));
        return retValue;
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnInfija;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpDibujo;
    private javax.swing.JTextField txtExpresion;
    private javax.swing.JTextField txtInfija;
    private javax.swing.JTextField txtPosfija;
    private javax.swing.JTextField txtPrefija;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
