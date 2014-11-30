
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class consignment{

    private double weight;
    private double volume;
    private int distance,type,price;
    public int ID;
    private String order_date,reach_date,from,to,senderb,recb;

    consignment(orderform neworder){
       String m=neworder.tweight.getText().toString();
       weight=Double.parseDouble(m);
       
       m=neworder.tdestination.getText().toString();
       to=m;
       m=neworder.tsender.getText().toString();
       from=m;
       recb=m=neworder.comborec.getSelectedItem().toString();
       senderb=m=neworder.combosender.getSelectedItem().toString();
       order_date=m=neworder.torderdate.getText().toString();

       if(neworder.radiosmall.isSelected()==true){
            type=1;
            volume=0;
            distance=0;
        }
       else{
           type=0;
           m=neworder.tvolume.getText().toString();
           volume=Double.parseDouble(m);
           m=neworder.tdistance.getText().toString();
           distance=Integer.parseInt(m);
        }

   }
    public void inc_con_num() throws FileNotFoundException, IOException{
        int a,flag=-1;
        Scanner in = null;

        if(type==1){
            in = new Scanner(new File("orders/sorders/newid.txt"));
            flag=1;
        }
        else{
            in = new Scanner(new File("orders/lorders/newid.txt"));
            flag=0;
            }
        a=in.nextInt();
        a=a+2;
        BufferedWriter out;
        try {
            if(flag==0){
               out = new BufferedWriter(new FileWriter("orders/lorders/newid.txt"));
            }
           else
               out = new BufferedWriter(new FileWriter("orders/sorders/newid.txt"));

               out.write(Integer.toString(a));
               out.close();
          }catch (IOException e) {
         }
        ID=a;
      
    }
    public void update_consignment_database() throws IOException{

    File myfile = null;
    BufferedWriter out = null;
   
    
    if(type==1){
         myfile=new File("orders/sorders/"+Integer.toString(ID)+".txt");
         myfile.createNewFile();

     out = new BufferedWriter(new FileWriter("orders/sorders/"+Integer.toString(ID)+".txt"));
     out.write(Integer.toString(ID));out.newLine();
     out.write(Integer.toString(price));out.newLine();
     out.write(Double.toString(weight));out.newLine();
     out.write(order_date);out.newLine();
     out.write(to);out.newLine();
     out.write(from);out.newLine();
     out.write(senderb);out.newLine();
     out.write(recb);out.newLine();
     out.close();
        }
  else{
          myfile=new File("orders/lorders/"+Integer.toString(ID)+".txt");
          myfile.createNewFile();
          out = new BufferedWriter(new FileWriter("orders/lorders/"+Integer.toString(ID)+".txt"));
          out.write(Integer.toString(ID));out.newLine();
          out.write(Integer.toString(price));out.newLine();
     out.write(Double.toString(weight));out.newLine();
     out.write(Double.toString(volume));out.newLine();
     out.write(Integer.toString(distance));out.newLine();
     out.write(order_date);out.newLine();
     out.write(to);out.newLine();
     out.write(from);out.newLine();
     out.write(senderb);out.newLine();
     out.write(recb);out.newLine();
     out.close();
        }
    //ID price weight volume distance order_date to from senderb recb reach_date
    //ID price weight order_date to from senderb recb reach_date
}
    public int price(){
    int price=0,y,a,b = 0;
    double density = 0;
    double x;

    if(type==1){
        price=(int) (Math.ceil(weight / 100) * 50);
        return price;
    }
    else if(type==0){
           price=(int) (5000 * volume);
           density=weight/volume;

          if(density>100){
                    x=density-100;
                    b=(int) (Math.ceil((x / 20.0))*price*( 1/10.0));
          }
          if(distance<=500){
                    price=price+b;
          }
         else {
          y=distance-500;
          a=(int) Math.ceil(y/100.0);
       
          price=price+a+b;
        }
           return price;
   }
    return price;
    }
    
}
   