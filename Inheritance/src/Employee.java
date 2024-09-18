public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    public Employee(long employeeId,String name,String hireDate, String birthDate){
        super(name, birthDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }


}
