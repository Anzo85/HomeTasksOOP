package org.anzo.oop;


public class EmployeeCheck {

    public static void main(String[] args) {

        Employee e1 = new Employee("Andrew","xxx999",31);
        Employee e2 = new Employee("Michel","yyy91", 17);

        eCheck(e1);
        eCheck(e2);

    }


    public static void eCheck(Employee e){

        if( e.age < 18){
            System.out.println("Work is Deny");
        }
        else System.out.println("Employee OK");
    }
}
