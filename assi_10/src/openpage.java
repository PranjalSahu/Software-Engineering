
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * openpage.java
 *
 * Created on 8 Apr, 2011, 8:10:57 PM
 */

/**
 *
 * @author user
 */
public class openpage extends javax.swing.JFrame {

    /** Creates new form openpage */
    public openpage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        order = new javax.swing.JMenu();
        newcon = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        updatestatus = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        truckstatus = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        genpay = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        viewemployee = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("WELCOME TO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("BANGALORE BRANCH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jMenu1.setText("EXIT");
        jMenuBar1.add(jMenu1);

        order.setText("ORDER");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });

        newcon.setText("Order new consignment");
        newcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newconActionPerformed(evt);
            }
        });
        order.add(newcon);

        jMenuBar1.add(order);

        jMenu2.setText("CLERK");

        updatestatus.setText("Update Truck Status");
        updatestatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestatusActionPerformed(evt);
            }
        });
        jMenu2.add(updatestatus);

        jMenuItem4.setText("Show Ready Truck");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("MANAGER");

        truckstatus.setText("View Truck Status");
        truckstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truckstatusActionPerformed(evt);
            }
        });
        jMenu3.add(truckstatus);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("ACCOUNT");

        jMenuItem2.setText("Enter Receipts");
        jMenu4.add(jMenuItem2);

        jMenuItem1.setText("View Profit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem3.setText("View branch wise revenue/expense");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        genpay.setText("Generate Pay Slip");
        genpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genpayActionPerformed(evt);
            }
        });
        jMenu4.add(genpay);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("EMPLOYEE");

        viewemployee.setText("View Employee Details");
        viewemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewemployeeActionPerformed(evt);
            }
        });
        jMenu5.add(viewemployee);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newconActionPerformed
       orderform neworder= new orderform();
       neworder.setVisible(true);
       return;
    }//GEN-LAST:event_newconActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        orderform neworder =new orderform();
    }//GEN-LAST:event_orderActionPerformed

    private void truckstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truckstatusActionPerformed
           truckstatus t= new truckstatus() ;
           t.setVisible(true);
           return;
    }//GEN-LAST:event_truckstatusActionPerformed

    private void updatestatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestatusActionPerformed
           truckstatus t= new truckstatus() ;
           t.setVisible(true);
           return;
    }//GEN-LAST:event_updatestatusActionPerformed

    private void genpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genpayActionPerformed
          employeed x=new employeed(1);
          x.setVisible(true);
          return;

    }//GEN-LAST:event_genpayActionPerformed

    private void viewemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewemployeeActionPerformed
          employeed x=new employeed(0);
          x.setVisible(true);
    }//GEN-LAST:event_viewemployeeActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    branchrev form=new branchrev(1);
    form.setVisible(true);
    return;
    }//GEN-LAST:event_jMenuItem3ActionPerformed
//considering max volume of truck to be 10 cubic meter
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    int i;
    String m;
    Double vol;
    branch branch1=new branch();
    branch1.name="Bangalore";
    m=branch1.get_truckava();
    if(m.compareTo("")==0){
        JOptionPane.showMessageDialog(this,"Sorry no truck available currently");
    }
 else{
     vol=branch1.get_current_vol();
     m=branch1.get_truckava();
     truckdispatch truckdispatch1 = new truckdispatch(m,vol);
     truckdispatch1.setVisible(true);
 }
return;
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    int exp,rev,profit;

    Scanner in = null,in1=null;
    try {
          in = new Scanner(new File("Account/revenue.txt"));
          in1 = new Scanner(new File("Account/expense.txt"));
           } catch (FileNotFoundException ex) {
                Logger.getLogger(openpage.class.getName()).log(Level.SEVERE, null, ex);
           }
    rev=in.nextInt();
    exp=in1.nextInt();
    profit=rev-exp;
    JOptionPane.showMessageDialog(this,"Current Profit of the whole firm is "+Integer.toString(profit));
    return;

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new openpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem genpay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem newcon;
    private javax.swing.JMenu order;
    private javax.swing.JMenuItem truckstatus;
    private javax.swing.JMenuItem updatestatus;
    private javax.swing.JMenuItem viewemployee;
    // End of variables declaration//GEN-END:variables

}
