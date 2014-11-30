
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
public class truck{

        public int max_vol;
        public double current_vol;
        public String name;

public boolean check(truckstatus st){
        if(st.trucknum.getSelectedObjects().toString().compareTo("SELECT ONE")==0){
            JOptionPane.showMessageDialog(st,"Please select one");
            return false;
        }
            else
            return true;
    }
public void savestatus(truckstatus st){
            String m2,m1;
            m1=st.trucknum.getSelectedItem().toString();
            m2=st.combobranch2.getSelectedItem().toString();


            BufferedWriter out = null;
        try {
            //out = new BufferedWriter(new FileWriter("studentfiles/"+fname.getText()+sname.getText()+"_c.txt",true));
            out = new BufferedWriter(new FileWriter("truck/"+m1+".txt"));

        } catch (IOException ex) {
            Logger.getLogger(truck.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.write("0 "+m2);
            out.close();
           } catch (IOException ex) {
            Logger.getLogger(truckstatus.class.getName()).log(Level.SEVERE, null, ex);
        }

}
public void gettruckrecord(truckstatus st){
        st.nopanel.setVisible(false);
        st.yespanel.setVisible(false);

         int status=0;
         String m=null;
         Scanner in = null;

    if(check(st)==false){
        return;
        }

        m=st.trucknum.getSelectedItem().toString();

      try {
            in = new Scanner(new File("truck/"+m+".txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(truckstatus.class.getName()).log(Level.SEVERE, null, ex);
        }

    status=in.nextInt();
    if(status==1){
        st.yespanel.setVisible(true);
        st.currentlyyes.setText("Currently Transporting YES");
        st.fromtext.setText("From "+in.next());
        st.totext.setText("To "+in.next());
    }
 else{
     st.nopanel.setVisible(true);
     st.currentlyno.setText("Currently Transpoting NO");
     st.attext.setText("Currently at "+in.next());
            }


         return;
    }
public String getbranch() throws FileNotFoundException{
 String m = null;
 int s;
 Scanner in;
 in = new Scanner(new File("truck/"+name+".txt"));
 s=in.nextInt();
 m=in.next();
 return m;
}
}
