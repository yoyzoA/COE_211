import java.io.*;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ExpensesTracker{
  public static void main (String[] args){
    Scanner scan= new Scanner(System.in);
    try {
      String YN;
      do{ 
        File file = new File("expenses.txt");
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bw= new BufferedWriter(fw);
        PrintWriter outToFile=new PrintWriter(bw);
        
        String name,item;
        double cost;

        System.out.println("Input your name: ");
        name=scan.nextLine();
        System.out.println("What did you purchase?");
        item=scan.nextLine();
        System.out.println("How much did you pay? (in USD)");
        cost=scan.nextDouble();

        scan.nextLine();

        outToFile.println(name+" purchased "+item+" for "+cost+" US Dollars.");
        outToFile.close();

        System.out.println("Would you like to log another purchase? (y/n)");
        YN=scan.nextLine();

      }while(YN.equals("y"));

      if(YN.equals("n")){
        String YN2;
        System.out.println("Would you like to read a summary of your purchases?");
        YN2=scan.nextLine();
            
        //reading the file
        if(YN2.equals("y")){
          Scanner sc = new Scanner(new File("expenses.txt"));
          while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
          }
        }
        System.out.println("Get off of ZoodMall!");
      }

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}