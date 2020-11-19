package revisionpapergenerator;

import java.util.ArrayList;

/**
 *
 * @author 14MEvans
 */
public class GenPaperGUI extends javax.swing.JFrame {

    //Attributes
    static String Difficulty;
    static ArrayList<String> Topics = new ArrayList<String>();
    static String ExamBoard;
    static int Length;
    static String LengthType;

    public GenPaperGUI() {
        initComponents();
        //Creating Button group
        grpDifficulty.add(btnEasy);
        grpDifficulty.add(btnMedium);
        grpDifficulty.add(btnHard);

        //Options for user to choose from
        String[] LengthOptions = {"Marks", "Minutes"};

        //Putting options into the combo box cbxLength
        cbxLength.removeAllItems();
        cbxLength.addItem(LengthOptions[0]);
        cbxLength.addItem(LengthOptions[1]);

        //Options for exam boards
        String[] ExamBoardOptions = {"OCR", "AQA"};

        //Putting options into the cbxExamBoard
        cbxExamBoard.removeAllItems();
        cbxExamBoard.addItem(ExamBoardOptions[0]);
        cbxExamBoard.addItem(ExamBoardOptions[1]);

        //Default difficulty to medium
        btnMedium.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpDifficulty = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblLength = new javax.swing.JLabel();
        tfLength = new javax.swing.JTextField();
        cbxLength = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lblTopics = new javax.swing.JLabel();
        chkTopic1 = new javax.swing.JCheckBox();
        chkTopic2 = new javax.swing.JCheckBox();
        chkTopic3 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        lblExamBoard = new javax.swing.JLabel();
        cbxExamBoard = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        lblDifficulty = new javax.swing.JLabel();
        btnEasy = new javax.swing.JRadioButton();
        btnMedium = new javax.swing.JRadioButton();
        btnHard = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(new java.awt.GridLayout(6, 0));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setForeground(new java.awt.Color(102, 0, 0));
        jPanel1.setAutoscrolls(true);

        lblTitle.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Revision Paper Generator");
        lblTitle.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setAutoscrolls(true);

        lblLength.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblLength.setForeground(new java.awt.Color(255, 255, 255));
        lblLength.setText("Length:");

        cbxLength.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblLength)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfLength, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLength, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLength, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbxLength, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setAutoscrolls(true);

        lblTopics.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblTopics.setForeground(new java.awt.Color(255, 255, 255));
        lblTopics.setText("Topics:");

        chkTopic1.setBackground(new java.awt.Color(102, 0, 0));
        chkTopic1.setForeground(new java.awt.Color(255, 255, 255));
        chkTopic1.setText("Projectile Motion");

        chkTopic2.setBackground(new java.awt.Color(102, 0, 0));
        chkTopic2.setForeground(new java.awt.Color(255, 255, 255));
        chkTopic2.setText("SUVATs");

        chkTopic3.setBackground(new java.awt.Color(102, 0, 0));
        chkTopic3.setForeground(new java.awt.Color(255, 255, 255));
        chkTopic3.setText("Forces");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblTopics, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkTopic1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkTopic2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(chkTopic3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTopics, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(chkTopic1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(chkTopic2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(chkTopic3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setAutoscrolls(true);

        lblExamBoard.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblExamBoard.setForeground(new java.awt.Color(255, 255, 255));
        lblExamBoard.setText("Exam Board: ");

        cbxExamBoard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblExamBoard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxExamBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExamBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxExamBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));
        jPanel5.setAutoscrolls(true);

        lblDifficulty.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblDifficulty.setForeground(new java.awt.Color(255, 255, 255));
        lblDifficulty.setText("Difficulty: ");

        btnEasy.setBackground(new java.awt.Color(102, 0, 0));
        btnEasy.setForeground(new java.awt.Color(255, 255, 255));
        btnEasy.setText("Easy");

        btnMedium.setBackground(new java.awt.Color(102, 0, 0));
        btnMedium.setForeground(new java.awt.Color(255, 255, 255));
        btnMedium.setText("Medium");

        btnHard.setBackground(new java.awt.Color(102, 0, 0));
        btnHard.setForeground(new java.awt.Color(255, 255, 255));
        btnHard.setText("Hard");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblDifficulty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEasy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMedium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnHard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));
        jPanel6.setAutoscrolls(true);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridLayout());

        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 5));
        jPanel7.add(lblInfo);

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerate)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExit)
                            .addComponent(btnGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        getContentPane().add(jPanel6);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        String errors = "";
        //Validating length
        String examLength = tfLength.getText();
        //Try to convert it to integer
        try {
            Length = Integer.parseInt(examLength);
            if (Length < 1) {
                errors += "The paper should be a minimum of 1 mark/minute long to be generated. <br>";
                Length = 0;
            }
        //IF it is not an integer    
        } catch (NumberFormatException nfe) {
            errors += "The length field should only contain whole integers. <br>";
            Length = 0;
        }
        
        //Checking if a topic has been selected
        if (!(chkTopic1.isSelected() || chkTopic2.isSelected() || chkTopic3.isSelected())) {
            errors += "At least one topic must be selected. <br>";
            Length = 0;
        } else {
            //Adding selected checkboxes to arraylist
            if (chkTopic1.isSelected()) {
                Topics.add("tblProjectileMotion");
            }
            
            if (chkTopic2.isSelected()) {
                Topics.add("tblSUVAT");
            }
            
            if (chkTopic3.isSelected()) {
                Topics.add("tblForces");
            }
            
        }
        
        //Determine difficulty
        if (btnEasy.isSelected()) {
            Difficulty = "Easy";
        } else if (btnMedium.isSelected()) {
            Difficulty = "Medium";
        } else {
            Difficulty = "Hard";
        }
        
        //Get value from combo boxes
        LengthType = (String) cbxLength.getSelectedItem();
        ExamBoard = (String) cbxExamBoard.getSelectedItem();
        
        if (Length != 0) {
            this.setVisible(false);
            new InteractiveQuestionsGUI().setVisible(true);
        } else {
            //Outputting errors
            lblInfo.setText("<html>" + errors + "</html>");
            //Resetting topics
            Topics.clear();
        }
    }//GEN-LAST:event_btnGenerateActionPerformed

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
            java.util.logging.Logger.getLogger(GenPaperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenPaperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenPaperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenPaperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenPaperGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnEasy;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JRadioButton btnHard;
    private javax.swing.JRadioButton btnMedium;
    private javax.swing.JComboBox<String> cbxExamBoard;
    private javax.swing.JComboBox<String> cbxLength;
    private javax.swing.JCheckBox chkTopic1;
    private javax.swing.JCheckBox chkTopic2;
    private javax.swing.JCheckBox chkTopic3;
    private javax.swing.ButtonGroup grpDifficulty;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblDifficulty;
    private javax.swing.JLabel lblExamBoard;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTopics;
    private javax.swing.JTextField tfLength;
    // End of variables declaration//GEN-END:variables
}
