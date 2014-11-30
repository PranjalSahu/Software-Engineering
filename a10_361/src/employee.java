
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

/**
 *
 * @author user
 */
public class employee {
      public String name,address;
      private int basic_pay,account_no;
      public long tel_no;

      public int get_basic_pay(){
          return basic_pay;
      }
      public void printslip(employeed d){
          JOptionPane.showMessageDialog(d,"Pay slip is being printed");
          return;
      }
      public void get_detail(employeed k){
          Scanner in = null;
          String m;
          m=k.comboemployee.getSelectedItem().toString();
        
           try {
                in = new Scanner(new File("employee/"+m+".txt"));
           } catch (FileNotFoundException ex) {
                Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
           }
       
          k.namel.setText(in.nextLine());
          k.addressl.setText(in.nextLine());
          k.tell.setText(in.nextLine());
          k.accountl.setText(in.nextLine());
          k.basicl.setText(in.nextLine());
}
}
