public class Developper implements Employer {
    private double abaseSalary ;
    private double performanceRate ;
    private double benefit ;

    public Developper(double abaseSalary, double performanceRate, double benefit) {
        this.abaseSalary = abaseSalary;
        this.performanceRate = performanceRate;
        this.benefit = benefit;
    }

    @Override
    public double salaryCalculation() {
        double salary ;
        salary = abaseSalary + performanceRate / 100 + benefit ;
        return salary ;
    }

}
