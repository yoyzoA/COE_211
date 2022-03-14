import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {

        Scanner scan= new Scanner(System.in);
        int input;
        String YN;
        
        do{
        do{
        System.out.println("Which service would you like to use?"+"\n"
            +"[1]: Basic week visualizer"+"\n"
            +"[2]: Advanced week visualizer"+"\n"
            +"[3]: Basic calculator"+"\n"
            +"[4]: Employee repertoire"
        );
       
        input=scan.nextInt();
        
        if(input>4||input<1){
            System.out.println("Please make sure you pick a number between 1 and 4");
        }else{}
        
        }while(input>4||input<1);
        
        switch(input){
            case 1:
                BasicWeek bw= new BasicWeek();
                bw.printDays();
                break;
            
            case 2:
                AdvancedWeek aw=new AdvancedWeek();
                aw.printDays();
                break;
            
            case 3:
                Calculator calc=new Calculator();
                break;
            
            case 4:
                Employee emp=new Employee();
                System.out.println(emp);
                break;
        }
        scan.nextLine();
        System.out.println("Would you like to perform another operation? (y/n)");
        YN=scan.nextLine();
    }while (YN.equalsIgnoreCase("y"));

    }
}