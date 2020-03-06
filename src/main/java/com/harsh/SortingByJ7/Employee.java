package com.harsh.SortingByJ7;

import java.util.Comparator;

public class Employee implements Comparable {

    private int empID;
    private String empName;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "[" + empID + " " + empName + "]";
    }

    /*this Comparable sorting useful when sorting is decided by only on criteria
    because compareTO method overieded only once, To overcome this overhead Comparator
    is use which provide flexiblity for more criteria */

    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee) o;
        //System.out.println(this.empName + "=" + emp.empName);
         return this.empName.compareTo(emp.empName);// sort by EmpName ASC

        //return emp.empName.compareTo(this.empName);   // sort by EmpNAme DESC

        // return emp.empID-this.empID ; //Sort by EmpID DESC

        // System.out.println(this.empID + "-" + emp.empID + "=" + (this.empID - emp.empID));
       // return this.empID - emp.empID; //Sort by EmpID ASC
    }

    public static Comparator<Employee> byEmpID = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.empID - o2.empID;
        }
    };

    public static Comparator<Employee> byEmpName=new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.empName.compareTo(o2.empName);//Ascending
            //return o2.empName.compareTo(o1.empName);//Decending
        }
    };
    public  Employee(){

    }
}
