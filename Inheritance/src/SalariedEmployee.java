public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;


    public SalariedEmployee(int id, String name, String hireDate, String birthDate, int salary, boolean isRetired) {
        super(id,name,hireDate,birthDate);
        this.annualSalary = salary;
        this.isRetired = isRetired;
    }

    public void retire(){
        isRetired = true;
    }
}
