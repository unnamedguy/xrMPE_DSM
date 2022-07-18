package xrmpe_dedicated;

// Libraries
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ui_manager extends javax.swing.JFrame {

    static String app_version = "1.0";
    /**
     * Creates new form ui_manager
     */
    public ui_manager() {
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

        jLabel1 = new javax.swing.JLabel();
        pnl_main = new javax.swing.JPanel();
        lbl_sv_name = new javax.swing.JLabel();
        txt_sv_name = new javax.swing.JTextField();
        lbl_sv_map = new javax.swing.JLabel();
        txt_sv_map = new javax.swing.JTextField();
        box_sv_host = new javax.swing.JComboBox<>();
        lbl_sv_host = new javax.swing.JLabel();
        lbl_sv_host1 = new javax.swing.JLabel();
        box_sv_host1 = new javax.swing.JComboBox<>();
        lbl_sv_mode = new javax.swing.JLabel();
        txt_sv_mode = new javax.swing.JTextField();
        pnl_advanced = new javax.swing.JPanel();
        lbl_sv_bin = new javax.swing.JLabel();
        txt_sv_bin = new javax.swing.JTextField();
        lbl_sv_parameters = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_sv_parameters = new javax.swing.JTextArea();
        separator = new javax.swing.JSeparator();
        btn_generate = new javax.swing.JButton();
        separator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_server_code = new javax.swing.JTextArea();
        lbl_final_code = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("xrMPE Dedicated Server Manager");

        pnl_main.setBorder(javax.swing.BorderFactory.createTitledBorder("Main settings"));
        pnl_main.setToolTipText("Basic and main settings for the dedicated server, this parameters are safe to edit.");

        lbl_sv_name.setText("Server name:");

        txt_sv_name.setToolTipText("Set the name of your dedicated server.");

        lbl_sv_map.setText("Map:");

        txt_sv_map.setToolTipText("Set your dedicated server map.");

        box_sv_host.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        box_sv_host.setToolTipText("Set your dedicated server visibility.");

        lbl_sv_host.setText("Host type:");

        lbl_sv_host1.setText("Max players:");

        box_sv_host1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        box_sv_host1.setToolTipText("Set your dedicated server max amount of players");

        lbl_sv_mode.setText("Game mode:");

        txt_sv_mode.setText("df");
        txt_sv_mode.setToolTipText("Set your dedicated server game mode.\nCURRENTLY ONLY DEFENCE MODE IS AVAILABLE AND SUPPORTED, ANY OTHER GAME MODE MAY OR WILL NOT WORK.");

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sv_map, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txt_sv_name)
                            .addComponent(lbl_sv_map)
                            .addComponent(lbl_sv_name))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_sv_host, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_sv_host1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_mainLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_sv_host)
                                    .addComponent(lbl_sv_host1)))))
                    .addComponent(lbl_sv_mode)
                    .addComponent(txt_sv_mode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(lbl_sv_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sv_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(lbl_sv_host)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_sv_host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(lbl_sv_map)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sv_map, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(lbl_sv_host1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_sv_host1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_sv_mode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sv_mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnl_advanced.setBorder(javax.swing.BorderFactory.createTitledBorder("Advanced settings (WARNING)"));
        pnl_advanced.setToolTipText("This settings may not work because some of them are not supported at all by the game. \nContains many advanced parameters for the dedicated server.");

        lbl_sv_bin.setText("Exe bin:");

        txt_sv_bin.setText("dedicated\\xrEngine.exe");

        lbl_sv_parameters.setText("Start parameters:");

        txt_sv_parameters.setColumns(20);
        txt_sv_parameters.setRows(5);
        txt_sv_parameters.setText("-auto_affinity");
        jScrollPane1.setViewportView(txt_sv_parameters);

        javax.swing.GroupLayout pnl_advancedLayout = new javax.swing.GroupLayout(pnl_advanced);
        pnl_advanced.setLayout(pnl_advancedLayout);
        pnl_advancedLayout.setHorizontalGroup(
            pnl_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_advancedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addGroup(pnl_advancedLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txt_sv_bin))
                    .addGroup(pnl_advancedLayout.createSequentialGroup()
                        .addGroup(pnl_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sv_parameters)
                            .addComponent(lbl_sv_bin))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_advancedLayout.setVerticalGroup(
            pnl_advancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_advancedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_sv_bin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sv_bin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_sv_parameters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_generate.setText("Generate");
        btn_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sv_generate(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_manager(evt);
            }
        });

        jButton2.setText("About");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_about(evt);
            }
        });

        txt_server_code.setColumns(20);
        txt_server_code.setLineWrap(true);
        txt_server_code.setRows(5);
        jScrollPane2.setViewportView(txt_server_code);

        lbl_final_code.setText("Final code:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jLabel1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pnl_advanced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 10, Short.MAX_VALUE))
                            .addComponent(separator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_final_code)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_advanced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_final_code)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sv_generate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sv_generate
        // Main  settings var declaration
        String sv_name = txt_sv_name.getText();
        String sv_map = txt_sv_map.getText();
        String sv_host = (String)box_sv_host.getSelectedItem();
        
        // Advanced settings var declaration
        String sv_mode = txt_sv_mode.getText();
        String sv_bin = txt_sv_bin.getText();
        String sv_parameters = txt_sv_parameters.getText();
        
        // Final code block
        String server_config = sv_bin + " -i -fsltx ..\\fsgame_s.ltx " + sv_parameters + " -start server(" + sv_map + "/" + sv_mode + "/hname=" + sv_name + "/public=" + sv_host + ") client(localhost)";
        txt_server_code.setText(server_config);
        
        // Generation of batch file
        try {
            FileWriter file_generate = new FileWriter("start_dedicated.bat");
            BufferedWriter bw = new BufferedWriter(file_generate);
            txt_server_code.write(bw);
            bw.close();
                    } 
        catch (IOException ex) {
        } 

        // Finished
        getToolkit().beep(); 
        JOptionPane.showMessageDialog(null, "File generated! Check your folder.");
        
    }//GEN-LAST:event_sv_generate

    private void show_about(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_about
        // Shows info dialog
        JOptionPane.showMessageDialog(null, "Unofficial xrMPE Dedicated Server Manager\r\n\r\nMade by Rammaken \r\nDeveloped with Java using NetBeans IDE 13 \r\nVersion: " + app_version + "\r\n\r\n2022");
    }//GEN-LAST:event_show_about

    private void clear_manager(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_manager
        // Clears all the input areas in the main UI
        txt_sv_name.setText("");
        txt_sv_map.setText("");
        txt_sv_mode.setText("df");               
        txt_sv_bin.setText("dedicated\\xrEngine.exe");        
        txt_sv_parameters.setText("-auto_affinity");        
        txt_server_code.setText(""); 
        getToolkit().beep(); 
        
    }//GEN-LAST:event_clear_manager

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set thes Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ui_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui_manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_sv_host;
    private javax.swing.JComboBox<String> box_sv_host1;
    private javax.swing.JButton btn_generate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_final_code;
    private javax.swing.JLabel lbl_sv_bin;
    private javax.swing.JLabel lbl_sv_host;
    private javax.swing.JLabel lbl_sv_host1;
    private javax.swing.JLabel lbl_sv_map;
    private javax.swing.JLabel lbl_sv_mode;
    private javax.swing.JLabel lbl_sv_name;
    private javax.swing.JLabel lbl_sv_parameters;
    private javax.swing.JPanel pnl_advanced;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JSeparator separator;
    private javax.swing.JSeparator separator1;
    private javax.swing.JTextArea txt_server_code;
    private javax.swing.JTextField txt_sv_bin;
    private javax.swing.JTextField txt_sv_map;
    private javax.swing.JTextField txt_sv_mode;
    private javax.swing.JTextField txt_sv_name;
    private javax.swing.JTextArea txt_sv_parameters;
    // End of variables declaration//GEN-END:variables
}
