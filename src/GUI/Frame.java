/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultStyledDocument;

/**
 *
 * @author omarf
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    DefaultStyledDocument document = new DefaultStyledDocument();
    
    public Frame() {
        initComponents();
        code.setDocument(document);
        TextLineNumber tln = new TextLineNumber(code);
        jScrollPane5.setRowHeaderView( tln );
        
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        code = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        ScanButton = new javax.swing.JButton();
        ParseButton = new javax.swing.JButton();
        BrowseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 131, 226));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Compiler Project");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        code.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        code.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                codeCaretUpdate(evt);
            }
        });
        jScrollPane5.setViewportView(code);

        console.setBackground(new java.awt.Color(0, 0, 0));
        console.setColumns(20);
        console.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        console.setForeground(new java.awt.Color(255, 255, 255));
        console.setRows(5);
        jScrollPane2.setViewportView(console);

        ScanButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ScanButton.setText("Scanning");

        ParseButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ParseButton.setText("Parsing");
        ParseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParseButtonActionPerformed(evt);
            }
        });

        BrowseButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BrowseButton.setText("Browse");
        BrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ParseButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScanButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(ScanButton)
                .addGap(64, 64, 64)
                .addComponent(ParseButton)
                .addGap(59, 59, 59)
                .addComponent(BrowseButton)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Compiler Scanner
    
    //Compiler_scanner scan= new Compiler_scanner();
    
    
    private void ParseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParseButtonActionPerformed
        // TODO add your handling code here:
        
        
        
        String codetext=code.getText();     //get code from GUI
        int len= codetext.length();         // know the lenght of the string 
                                            //to intialize the char array
        
        char[] codeChar= new char[len];     // intialize array of char
        int i = 0;
        for(char c: codetext.toCharArray()){
            codeChar[i]=c;                  //assign the string to the char array
            i++;
        }
        //String str_token = scanner.scan_code(codeChar);     //pass the char array to the scan_code function
        
        //console.setText(str_token);
        
        
        
        
    }//GEN-LAST:event_ParseButtonActionPerformed

//    int i;
//        i=code.getLineCount();
//        System.out.println(code.getCaretPosition());
//        autoc.setLocation(autoc.getX()+code.getCaretPosition(), autoc.getY()+code.getLineCount());
//        if(i > index.getLineCount()-1){
//            String s =Integer.toString(i) + "\n";
//            index.append(s);
//        }
//        else{
//            if(i<index.getLineCount()-1){
//                String str=index.getText();
//                char c;
//                int j= str.length()-1;
//                
//                str= str.substring(0,j);
//                j--;
//                c= str.charAt(j);
//                while(c != '\n'){
//                    str= str.substring(0,j);
//                    j--;
//                    c= str.charAt(j);
//                }
//                
////                do{
////                    
////                    str=str.substring(0,j);
////                    j--;
////                }while(str.charAt(j+1)!='\n');
//                
//                index.setText(str);
//            }
//            
//        }
//    }
    
    
    
    
    private void BrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        fileChooser.setFileFilter(filter);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_BrowseButtonActionPerformed

    private void codeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_codeCaretUpdate
        // TODO add your handling code here:
        
        docume
        
        
        
        
        
//        int i =code.getText().split("\n").length;
//        System.out.println(i);
//        
//        //System.out.println(code.getCaretPosition());
//        //autoc.setLocation(autoc.getX()+code.getCaretPosition(), autoc.getY()+i);
//        if(i > index.getLineCount()-1){
//            String s =Integer.toString(i) + "\n";
//            index.append(s);
//        }
//        else{
//            if(i<index.getLineCount()-1){
//                String str=index.getText();
//                char c;
//                int j= str.length()-1;
//                
//                str= str.substring(0,j);
//                j--;
//                c= str.charAt(j);
//                while(c != '\n'){
//                    str= str.substring(0,j);
//                    j--;
//                    c= str.charAt(j);
//                }
//                
////                do{
////                    
////                    str=str.substring(0,j);
////                    j--;
////                }while(str.charAt(j+1)!='\n');
//                
//                index.setText(str);
//            }
            
//        }
    
    }//GEN-LAST:event_codeCaretUpdate

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseButton;
    private javax.swing.JButton ParseButton;
    private javax.swing.JButton ScanButton;
    private javax.swing.JTextPane code;
    private javax.swing.JTextArea console;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
