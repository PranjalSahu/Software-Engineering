
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class account {
    public void update_rev_gen(int x) throws IOException{

    BufferedWriter out = null;

    int rev = 0;
    Scanner in = null;
    try {
          in = new Scanner(new File("Account/revenue.txt"));
           } catch (FileNotFoundException ex) {
                Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
     }
    rev=in.nextInt();
    rev=rev+x;
     out = new BufferedWriter(new FileWriter("Account/revenue.txt"));
     out.write(Integer.toString(rev));
     out.close();
     return;
}
    public void update_expense(int x) throws IOException{

    BufferedWriter out = null;

    int rev = 0;
    Scanner in = null;
    try {
          in = new Scanner(new File("Account/expense.txt"));
           } catch (FileNotFoundException ex) {
                Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
     }
    rev=in.nextInt();
    rev=rev+x;
     out = new BufferedWriter(new FileWriter("Account/expense.txt"));
     out.write(Integer.toString(rev));
     out.close();
     return;
}


}
