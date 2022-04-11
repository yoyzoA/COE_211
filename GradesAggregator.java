import java.util.Scanner;
public class GradesAggregator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double midterm, attendance,assGrade=0;
        int[] assignments=new int[5];

        for(int idx=0; idx<assignments.length; idx++){
            System.out.println("Input the grade of assignment "+(idx+1)+" ");
            assignments[idx]=scan.nextInt();
            assGrade+=assignments[idx];
        }
        
        System.out.println("Input the number of attended labs ");
        attendance= scan.nextDouble();

        System.out.println("Input the midterm grade ");
        midterm=scan.nextDouble();

        assGrade=(assGrade/5)*0.3;
        attendance=((attendance*100)*0.05)/7;
        midterm=midterm*0.3;
        
        System.out.print("Assignments (30%): "+assGrade+"\nAttendance (5%): "+attendance+"\nMidterm (30%): "+midterm);

    }
}