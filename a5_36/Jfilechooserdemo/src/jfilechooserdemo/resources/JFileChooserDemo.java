/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFileChooserDemo.java
 *
 * Created on 3 Feb, 2011, 6:38:56 PM
 */

package jfilechooserdemo.resources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

class MyCustomFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }
        @Override
      public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text document (*.txt)";
        }
    }

/**
 *
 * @author user
 */
public class JFileChooserDemo extends javax.swing.JFrame {
             String temp=null,mytext=null;
             int checksaveclick=0;
    /** Creates new form JFileChooserDemo */
    public JFileChooserDemo() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        openreverse = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("File handling");
        fileChooser.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demo Application");

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Open.setText("Open");
        Open.setToolTipText("Opens the file normally");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        openreverse.setText("OpenReverse");
        openreverse.setToolTipText("Opens the file with reversed numbers");
        openreverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openreverseActionPerformed(evt);
            }
        });
        jMenu1.add(openreverse);

        Save.setText("Save");
        Save.setToolTipText("Saves the file in required location");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jMenu1.add(Save);

        Exit.setText("Exit");
        Exit.setToolTipText("Exits the program");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed

        int returnVal = fileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try {
               textarea.read( new FileReader( file.getAbsolutePath() ), null );
          } catch (IOException ex) {
          System.out.println("problem accessing file"+file.getAbsolutePath());
        }
    } else {
        System.out.println("File access cancelled by user.");
    }
        mytext=textarea.getText();
    }//GEN-LAST:event_OpenActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        temp=textarea.getText();
        int check=0;
        if((temp==null)||temp.compareTo(mytext)==0){
             System.exit(0);
        }
          int checkdialog;
          checkdialog=JOptionPane.showConfirmDialog(this, "Save Changes?OR Press No to EXIT");
          if(checkdialog==JOptionPane.NO_OPTION){
                 System.exit(0);
             }
           else if(checkdialog==JOptionPane.CANCEL_OPTION){
               return;
          }
          SaveActionPerformed(evt);
         
        
    }//GEN-LAST:event_ExitActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
                         mytext=textarea.getText();
                         int actionDialog = fileChooser.showSaveDialog(this);
                	 if ( actionDialog == JFileChooser.APPROVE_OPTION )
                	 {
                	 File fileName = new File( fileChooser.getSelectedFile( ) + ".txt" );
                	 if(fileName != null)
                	 {
                	 if(fileName.exists())
                	 {
                	   actionDialog = JOptionPane.showConfirmDialog(this, "Replace existing file?");
                              if(actionDialog==JOptionPane.CANCEL_OPTION){
                                  return;
                              }
                	 while (actionDialog == JOptionPane.NO_OPTION)
                	 {
                	 actionDialog=fileChooser.showSaveDialog(this);
                         if (actionDialog == JFileChooser.CANCEL_OPTION){
                             return;
                         }
                	 if (actionDialog == JFileChooser.APPROVE_OPTION)
                	  {
                	         fileName = new File( fileChooser.getSelectedFile( ) + ".txt" );
                	          if(fileName.exists())
                	          {
                	        	  actionDialog = JOptionPane.showConfirmDialog(this, "Replace existing file?");

                	            }
                	   }

                	 }
                	 if(actionDialog == JOptionPane.YES_OPTION)
                	 {
                	     BufferedWriter outFile = null;
                            try {
                                outFile = new BufferedWriter(new FileWriter(fileName));
                            } catch (IOException ex) {
                                Logger.getLogger(JFileChooserDemo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                outFile.write(mytext); 
                            } catch (IOException ex) {
                                Logger.getLogger(JFileChooserDemo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                outFile.flush(); 
                            } catch (IOException ex) {
                                Logger.getLogger(JFileChooserDemo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                outFile.close();
                            } catch (IOException ex) {
                                Logger.getLogger(JFileChooserDemo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                	 }
                	 return;
                	 
                	 }

                	 BufferedWriter outFile = null;
                    try {
                        outFile = new BufferedWriter(new FileWriter(fileName));
                    } catch (IOException ex) {
                        Logger.getLogger(JFileChooserDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        outFile.write(mytext); 
                    } catch (IOException ex) {
                        Logger.getLogger(JFileChooserDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        outFile.flush(); 
                    } catch (IOException ex) {
                        Logger.getLogger(JFileChooserDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        outFile.close();
                    } catch (IOException ex) {
                        Logger.getLogger(JFileChooserDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                	 }
                	 }
          	 return;
    }//GEN-LAST:event_SaveActionPerformed

    private void openreverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openreverseActionPerformed
        String a = null;
        int returnVal = fileChooser.showOpenDialog(this);
        
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try {
          textarea.read( new FileReader( file.getAbsolutePath() ), null );
          a=textarea.getText();
          } catch (IOException ex) {
          System.out.println("problem accessing file"+file.getAbsolutePath());
        }
    } else {
        System.out.println("File access cancelled by user.");
    }
        Pattern myp=Pattern.compile("\\d+");
        Matcher m = myp.matcher(a);
        while (m.find()) {
              a=a.replace(m.group(),new StringBuffer(m.group()).reverse().toString());
        }
        textarea.setText(a);
    }//GEN-LAST:event_openreverseActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFileChooserDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Save;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem openreverse;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables

}
