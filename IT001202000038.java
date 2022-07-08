import taxcalculator.thetaxcalculator;
import java.util.Scanner;
class IT001202000038{
    public static void main(String[]args){
        thetaxcalculator calculator = new thetaxcalculator();
        Scanner myInp = new Scanner(System.in);
        System.out.print("Input your Annual Gross Income :");
        int inpAGI = myInp.nextInt();
        calculator.setAGI(inpAGI);
        System.out.print("Input your Non-Taxable Income :");
        int inpNTI = myInp.nextInt();
        calculator.setNTI(inpNTI);
        int myagi = calculator.getAGI();
        int mynti = calculator.getNTI();
        int myti = calculator.calculateTI();
        System.out.format("Annual Gross Income is :%d\nNon-Taxable Income is :%d\nTaxable Income is :%d", myagi, mynti, myti);
        if (myti <= 0){
            System.out.println("\nNo tax is paid");
        }
        else if (myti > 0 && myti <= 50000000){
            double AnnualIncomeTax = calculator.fivepercentAIT();
            System.out.format("\nYou get 5 percents taxes\nSo you get Annual Income Tax for :%f", AnnualIncomeTax);
        }
        else if (myti > 50000000 && myti <= 250000000){
            double AnnualIncomeTax = calculator.fifteenpercentAIT();
            System.out.format("\nYou get 15 percents taxes\nSo you get Annual Income Tax for :%f", AnnualIncomeTax);
        }
        else if (myti > 250000000 && myti <= 500000000){
            double AnnualIncomeTax = calculator.twentyfivepercentAIT();
            System.out.format("\nYou get 25 percents taxes\nSo you get Annual Income Tax for :%f", AnnualIncomeTax);
        }
        else{
            double AnnualIncomeTax = calculator.thirtypercentAIT();
            System.out.format("\nYou get 30 percents taxes\nSo you get Annual Income Tax for :%f", AnnualIncomeTax);
        }
        myInp.close();
    }
}