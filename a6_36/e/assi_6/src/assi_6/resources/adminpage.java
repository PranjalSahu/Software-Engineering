/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * adminpage.java
 *
 * Created on 7 Feb, 2011, 12:27:35 AM
 */

package assi_6.resources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class adminpage extends javax.swing.JFrame {

    /** Creates new form adminpage */
    public adminpage() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tadd = new javax.swing.JButton();
        tnamef = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tnames = new javax.swing.JTextField();
        tpass = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        viewfn = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        viewsn = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        disabler = new javax.swing.JRadioButton();
        enabler = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saved = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        coursen = new javax.swing.JTextField();
        tfn = new javax.swing.JTextField();
        donecourse = new javax.swing.JButton();
        tsn = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel5.setText("WELCOME ADMIN");

        tadd.setFont(new java.awt.Font("Tahoma", 1, 11));
        tadd.setText("DONE");
        tadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taddActionPerformed(evt);
            }
        });

        tnamef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamefActionPerformed(evt);
            }
        });

        jLabel10.setText("FIRST NAME");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setText("TEACHER ADDITION");

        jLabel12.setText("SECOND NAME");

        tnames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamesActionPerformed(evt);
            }
        });

        jLabel13.setText("REQUIRED PASSWORD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(tadd)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tnamef, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGap(68, 68, 68)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tpass)
                                .addComponent(tnames, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tnamef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tnames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(tadd)
                .addContainerGap())
        );

        jLabel14.setText("FIRST NAME");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel15.setText("VIEW STUDENT PROFILE");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton6.setText("SHOW PROFILE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel18.setText("SECOND NAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewsn, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(viewfn, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(98, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(viewsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton6)
                .addGap(130, 130, 130))
        );

        buttonGroup1.add(disabler);
        disabler.setText("DISABLE");
        disabler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disablerActionPerformed(evt);
            }
        });

        buttonGroup1.add(enabler);
        enabler.setText("ENABLE");
        enabler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enablerActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel16.setText("CURRENT SEMESTER REGISTRATION");

        jLabel1.setText("REGISTRATION");

        saved.setText("CONFRIM DECISION");
        saved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saved)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(84, 84, 84)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(disabler)
                                .addComponent(enabler))))
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(saved)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel16)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(enabler))
                    .addGap(18, 18, 18)
                    .addComponent(disabler)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        //disabler.setSelected(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("COURSE ADDITION");

        jLabel8.setText("COURSE NAME");

        jLabel9.setText("TEACHER FIRST NAME");

        coursen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursenActionPerformed(evt);
            }
        });

        donecourse.setFont(new java.awt.Font("Tahoma", 1, 11));
        donecourse.setText("DONE");
        donecourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donecourseActionPerformed(evt);
            }
        });

        jLabel17.setText("TEACHER SECOND NAME");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel17))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfn, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(coursen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(tsn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                        .addGap(114, 114, 114))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(donecourse)
                        .addContainerGap(397, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(coursen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(tsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(donecourse)
                .addContainerGap())
        );

        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(395, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(380, 380, 380)
                        .addComponent(logout)))
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(logout))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnamefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamefActionPerformed

    private void coursenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursenActionPerformed

    private void tnamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamesActionPerformed

    private void taddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taddActionPerformed
            int x = 0;
        if(tnamef.getText().length()!=0&&tpass.getPassword().length!=0&&tnames.getText().length()!=0){
            File myfile,myfile1;
            myfile=new File("teacherfiles/"+tnamef.getText()+"_"+tnames.getText()+".txt");
            myfile1=new File("teacherfiles/"+tnamef.getText()+tnames.getText()+"_"+"course"+".txt");
            if(!myfile.exists()){                       //RollNo
                try {                                   //name
                    myfile.createNewFile();             //password
                } catch (IOException ex) {
                    Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                         x=inc_tea_num();
                  JOptionPane.showMessageDialog(this,tnamef.getText()+" "+tnames.getText()+"'s"+"\n"+"Registration Successful\n"+"Registration No. is "+Integer.toString(x));
                  }
                catch (FileNotFoundException ex) {
                Logger.getLogger(registrationpage1.class.getName()).log(Level.SEVERE, null, ex);
                 }
                BufferedWriter out = null;
                try {
                    out = new BufferedWriter(new FileWriter("teacherfiles/" + tnamef.getText() + "_" + tnames.getText() + ".txt"));
                } catch (IOException ex) {
                    Logger.getLogger(registrationpage1.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    out.write(Integer.toString(x));
                    out.newLine();
                    out.write(tpass.getPassword());
                    out.newLine();
                    out.write(tnamef.getText()+" "+tnames.getText());

                } catch (IOException ex) {
                    Logger.getLogger(registrationpage1.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(registrationpage1.class.getName()).log(Level.SEVERE, null, ex);
                }
             tpass.setText(null);
             tnamef.setText(null);
             tnames.setText(null);


            }
            else {
             JOptionPane.showMessageDialog(this,"Teacher is already present\n"+"Try different name");
             tpass.setText(null);
             tnamef.setText(null);
             tnames.setText(null);
             return;
             }
          }
      else {
             JOptionPane.showMessageDialog(this,"Fill all the entries");
             return;
         }
    }//GEN-LAST:event_taddActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        openpage page=new openpage();
        page.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void enablerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enablerActionPerformed
        // enabler.setEnabled(true);
    }//GEN-LAST:event_enablerActionPerformed

    private void disablerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disablerActionPerformed
       disabler.setEnabled(true);
    }//GEN-LAST:event_disablerActionPerformed


     private int inc_cou_num() throws FileNotFoundException{
        int a;
        Scanner in = null;
        in = new Scanner(new File("coursefiles/course_count.txt"));
        a=in.nextInt();
        ++a;
        try {
          BufferedWriter out = new BufferedWriter(new FileWriter("coursefiles/course_count.txt"));
          out.write(Integer.toString(a));
          out.close();
          }catch (IOException e) {
         }
        return a;
    }
     private void inc_tcou_num(String name) throws FileNotFoundException{
        int a;
        Scanner in = null;
        in = new Scanner(new File("teacherfiles/"+name+"_co"+".txt"));
        a=in.nextInt();
        ++a;
        try {
          BufferedWriter out = new BufferedWriter(new FileWriter("teacherfiles/"+name+"_co"+".txt"));
          out.write(Integer.toString(a));
          out.close();
          }catch (IOException e) {
         }
        //return a;
    }

    private void donecourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donecourseActionPerformed
                     int x = 0;
        if(tfn.getText().length()!=0&&tsn.getText().length()!=0&&coursen.getText().length()!=0){

            File myfile,myfile1,myfile2,myfile3;
            myfile=new File("coursefiles/"+coursen.getText()+".txt");
            myfile1=new File("teacherfiles/"+tfn.getText()+"_"+tsn.getText()+".txt");
            myfile2=new File("teacherfiles/"+tfn.getText()+tsn.getText()+"_c"+".txt");
            myfile3=new File("coursefiles/totalcourses.txt");
            if(!myfile1.exists()){
                JOptionPane.showMessageDialog(this,"Teacher not registered\n"+"First register the teacher");
                tfn.setText(null);
                tsn.setText(null);
                coursen.setText(null);
                return;
            }

            if(!myfile.exists()){                       //Course
                try {                                   //Teacher adminpage
                    myfile.createNewFile();             //creating course file in coursefiles folder
                } catch (IOException ex) {
                    Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                         x=inc_cou_num();
                  JOptionPane.showMessageDialog(this,coursen.getText()+" successfully registerd\n"+"Under Professor-"+tfn.getText()+" "+tsn.getText());
                  }
                catch (FileNotFoundException ex) {
                Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
                 }
                BufferedWriter out = null,out1=null,out2=null;
                try {
                    out = new BufferedWriter(new FileWriter("teacherfiles/"+tfn.getText()+tsn.getText()+"_c"+".txt",true));
                    out2 = new BufferedWriter(new FileWriter("coursefiles/totalcourses.txt",true));
                } catch (IOException ex) {
                    Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    out.write(coursen.getText());
                    out.newLine();
                    out2.write(coursen.getText());
                    out2.newLine();
                    } catch (IOException ex) {
                    Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    out.close();
                    out2.close();
                } catch (IOException ex) {
                    Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
                }
             coursen.setText(null);
             tfn.setText(null);
             tsn.setText(null);
            }
            else {
             JOptionPane.showMessageDialog(this,"ALready registered Course");
             coursen.setText(null);
             tfn.setText(null);
             tsn.setText(null);
             return;
             }
          }
      else {
             JOptionPane.showMessageDialog(this,"Fill all the entries");
             return;
         }
    }//GEN-LAST:event_donecourseActionPerformed

    private void savedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedActionPerformed
            Scanner in = null;
            int a=0;

           try {
                in = new Scanner(new File("otherfiles/registration.txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
            }

        if(enabler.isSelected()){
        a=1;
        try {
          BufferedWriter out = new BufferedWriter(new FileWriter("otherfiles/registration.txt"));
          out.write(Integer.toString(a));
          out.close();
          }catch (IOException e) {
         }
        }
       else{
           a=0;
          try {
          BufferedWriter out = new BufferedWriter(new FileWriter("otherfiles/registration.txt"));
          out.write(Integer.toString(a));
          out.close();
          }catch (IOException e) {
         }

        }
            return;
    }//GEN-LAST:event_savedActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Scanner in1 = null;
        File file;
        String roll;
        if(viewfn.getText().length()!=0&&viewsn.getText().length()!=0){
        file=new File("studentfiles/"+viewfn.getText()+"_"+viewsn.getText()+".txt");
        if(!file.exists()){
            JOptionPane.showMessageDialog(this,"Student not registered");
            return;
        }
        try {
                    in1 = new Scanner(new File("studentfiles/"+viewfn.getText()+"_"+viewsn.getText()+".txt"));
                   } catch (FileNotFoundException ex) {
                      Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
                   }
                roll=in1.next();
                student st = null;
        try {
            st = new student(viewfn.getText(),viewsn.getText(),roll,1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
        }
             st.setVisible(true);
        }
       else {
            JOptionPane.showMessageDialog(this,"fill all entries");
            return;
        }


    }//GEN-LAST:event_jButton6ActionPerformed
private int inc_tea_num() throws FileNotFoundException{
        int a;
        Scanner in = null;
        in = new Scanner(new File("teacherfiles/tea_count.txt"));
        a=in.nextInt();
        ++a;
        try {
          BufferedWriter out = new BufferedWriter(new FileWriter("teacherfiles/tea_count.txt"));
          out.write(Integer.toString(a));
          out.close();
          }catch (IOException e) {
         }
        return a;
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField coursen;
    private javax.swing.JRadioButton disabler;
    private javax.swing.JButton donecourse;
    private javax.swing.JRadioButton enabler;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logout;
    private javax.swing.JButton saved;
    private javax.swing.JButton tadd;
    private javax.swing.JTextField tfn;
    private javax.swing.JTextField tnamef;
    private javax.swing.JTextField tnames;
    private javax.swing.JPasswordField tpass;
    private javax.swing.JTextField tsn;
    private javax.swing.JTextField viewfn;
    private javax.swing.JTextField viewsn;
    // End of variables declaration//GEN-END:variables

}
