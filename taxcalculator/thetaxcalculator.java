package taxcalculator;

public class thetaxcalculator {
    private int AGI;
    private int NTI;
    private int TI;
    protected double AIT;
    public int getAGI(){
        return this.AGI;
    }
    public int setAGI(int inpAGI){
        this.AGI = inpAGI;
        return AGI;
    }
    public int getNTI(){
        return this.NTI;
    }
    public int setNTI(int inpNTI){
        this.NTI = inpNTI;
        return NTI;
    }
    public int calculateTI(){
        this.TI = AGI - NTI;
        return TI;
    }
    public double fivepercentAIT(){
        double dblTI = this.TI;
        this.AIT = dblTI * 0.05;
        return AIT;
    }
    public double fifteenpercentAIT(){
        double dblTI = this.TI;
        this.AIT = (0.05 * 50000000)+((dblTI-50000000) * 0.15);
        return AIT;
    }
    public double twentyfivepercentAIT(){
        double dblTI = this.TI;
        this.AIT = (0.05 * 50000000)+(0.15 * (250000000-50000000))+((dblTI-250000000) * 0.25);
        return AIT;
    }
    public double thirtypercentAIT(){
        double dblTI = this.TI;
        this.AIT = (0.05 * 50000000)+(0.15 * (250000000-50000000))+(0.25 * (500000000-250000000))+((dblTI-500000000) * 0.3);
        return AIT;
    }
}
