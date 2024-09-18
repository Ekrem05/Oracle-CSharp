public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(int id, String name, String hireDate, String birthDate, int hourlyPayRate, boolean isRetired) {
        super(id,name,hireDate,birthDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){
        hourlyPayRate*=2;
    }
}
