
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
public class branch {
public String name;
private int revenue;
private int expense;

public int get_revenue(){
    int rev = 0;
    Scanner in = null;
    try {
          in = new Scanner(new File("branch/"+name+"_rev.txt"));
           } catch (FileNotFoundException ex) {
                Logger.getLogger(branch.class.getName()).log(Level.SEVERE, null, ex);
           }
    rev=in.nextInt();
    return rev;
}
public int get_expense(){
    int rev = 0;
    Scanner in = null;
    try {
          in = new Scanner(new File("branch/"+name+"_rev.txt"));
           } catch (FileNotFoundException ex) {
                Logger.getLogger(branch.class.getName()).log(Level.SEVERE, null, ex);
           }
    rev=in.nextInt();
    rev=in.nextInt();
    return rev;
}
public void update_vol(Double x) throws IOException{
    File myfile = null;
    BufferedWriter out = null;

    Double rev;
    Scanner in = null;
    try {
          in = new Scanner(new File("branch/"+name+"_vol.txt"));
           } catch (FileNotFoundException ex) {
                Logger.getLogger(branch.class.getName()).log(Level.SEVERE, null, ex);
     }
    rev=in.nextDouble();
    rev=rev+x;
     out = new BufferedWriter(new FileWriter("branch/"+name+"_vol.txt"));
     out.write(Double.toString(rev));
     out.newLine();
     out.close();
     return;
}
public Double get_current_vol(){
    Double vol = null;
    Scanner in = null;
    try {
          in = new Scanner(new File("branch/"+name+"_vol.txt"));
           } catch (FileNotFoundException ex) {
                Logger.getLogger(branch.class.getName()).log(Level.SEVERE, null, ex);
           }
    vol=in.nextDouble();
    return vol;
}
public void update_rev_gen(int x) throws IOException{

    File myfile = null;
    BufferedWriter out = null;

    int rev = 0;
    Scanner in = null;
    try {
          in = new Scanner(new File("branch/"+name+"_rev.txt"));
           } catch (FileNotFoundException ex) {
                Logger.getLogger(branch.class.getName()).log(Level.SEVERE, null, ex);
     }
    rev=in.nextInt();
    rev=rev+x;
     out = new BufferedWriter(new FileWriter("branch/"+name+"_rev.txt"));
     out.write(Integer.toString(rev));
     out.newLine();
     out.close();
     return;
}
public void get_cons_handled(){
    return;
}
public void update_cons_handled(String b1,String b2){
    return;
}     //in the design the aargument is cosignemnt ID
                                                               //but here we are passing the names of branches
public String get_truckava(){
String m = null;
Scanner in = null;
    try {
          in = new Scanner(new File("branch/"+name+"_tru.txt"));
           } catch (FileNotFoundException ex) {
                Logger.getLogger(branch.class.getName()).log(Level.SEVERE, null, ex);
           }
 m=in.next();
 return m;
}
}
