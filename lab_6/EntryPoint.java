import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {

        Scanner scan= new Scanner(System.in);
        int input;
        
        System.out.println("Which service would you like to use?"+"\n"
            +"[1]: Basic week visualizer"+"\n"
            +"[2]: Advanced week visualizer"+"\n"
            +"[3]: Basic calculator"+"\n"
            +"[4]: Employee repertoire"
        );
        input=scan.nextInt();
        
        if(input==1){
            BasicWeek bw= new BasicWeek();
            bw.printDays();
        }else{
            if(input==2){
                AdvancedWeek aw=new AdvancedWeek();
                aw.printDays();
            }else{
                if(input==3){
                    Calculator calc=new Calculator();
                }else{
                    
                }
            }
        }

    }
}