package classes;

/**
 * Created by JPMPC-B216 on 11/10/2016.
 */
public class Employee extends Person{
    private String department;
    private float SSSID;
    private float PagibigID;
    private float EmployeID;

    public String getDepartment() {
        return department;
    }

    public float getSSSID() {
        return SSSID;
    }

    public float getPagibigID() {
        return PagibigID;
    }

    public float getEmployeID() {
        return EmployeID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSSSID(float SSSID) {
        this.SSSID = SSSID;
    }

    public void setPagibigID(float pagibigID) {
        PagibigID = pagibigID;
    }

    public void setEmployeID(float employeID) {
        EmployeID = employeID;
    }
}
