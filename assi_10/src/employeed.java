
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
 * employeed.java
 *
 * Created on 10 Apr, 2011, 9:35:28 PM
 */

/**
 *
 * @author user
 */
public class employeed extends javax.swing.JFrame {

    /** Creates new form employeed */
    public employeed(int flag) {
        initComponents();
        /******************************************************/
        detailpanel.setVisible(false);
        Scanner in = null,in1=null;
        String m;
        try {
            in = new Scanner(new File("employee/allemployee.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(employeed.class.getName()).log(Level.SEVERE, null, ex);
        }
        //addd the trucks in the combo boxes
        while(in.hasNext()){
            m=in.nextLine();
            comboemployee.addItem(m);
        }
      /*******************************************************************/
        if(flag==1){
            genpayslip.setVisible(true);
        }
      /*******************************************************************/
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboemployee = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        detailpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namel = new javax.swing.JLabel();
        addressl = new javax.swing.JLabel();
        tell = new javax.swing.JLabel();
        accountl = new javax.swing.JLabel();
        basicl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        genpayslip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        comboemployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ONE" }));

        jLabel1.setText("Select Employee");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Telephone no.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Account no.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Basic Pay");

        namel.setText("jLabel8");

        addressl.setText("jLabel8");

        tell.setText("jLabel8");

        accountl.setText("jLabel8");

        basicl.setText("jLabel8");

        javax.swing.GroupLayout detailpanelLayout = new javax.swing.GroupLayout(detailpanel);
        detailpanel.setLayout(detailpanelLayout);
        detailpanelLayout.setHorizontalGroup(
            detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailpanelLayout.createSequentialGroup()
                .addGroup(detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(basicl)
                    .addComponent(accountl)
                    .addComponent(tell)
                    .addComponent(addressl)
                    .addComponent(namel))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        detailpanelLayout.setVerticalGroup(
            detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addressl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tell))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(accountl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(basicl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Employee Details");

        show.setText("SHOW");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        genpayslip.setText("GENERATE PAY SLIP");
        genpayslip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genpayslipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(comboemployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(show)
                            .addComponent(genpayslip)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboemployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show)
                .addGap(8, 8, 8)
                .addComponent(detailpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(genpayslip)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        String m;
        detailpanel.setVisible(true);
        employee a=new  employee();
        a.get_detail(this);
        return;
    }//GEN-LAST:event_showActionPerformed

    private void genpayslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genpayslipActionPerformed
       JOptionPane.showMessageDialog(this,"Pay slip is generated and is printed"+"\n Amount=" +basicl.getText()+" transeferred to account no."+accountl.getText());
    }//GEN-LAST:event_genpayslipActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeed(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel accountl;
    public javax.swing.JLabel addressl;
    public javax.swing.JLabel basicl;
    public javax.swing.JComboBox comboemployee;
    private javax.swing.JPanel detailpanel;
    private javax.swing.JButton genpayslip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel namel;
    private javax.swing.JButton show;
    public javax.swing.JLabel tell;
    // End of variables declaration//GEN-END:variables

}
