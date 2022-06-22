/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgrammingAssignment3;

/**
 *
 * @author alexchristopher
 */

public class CarLoan extends LoanAccount{
    private final String vehicleVIN;
    
    public CarLoan(double principal, double annualInterestRate, 
            int months, String vehicleVIN) {
        super(principal, annualInterestRate, months);
        this.vehicleVIN = vehicleVIN;
    }
    
    @Override
    public String toString(){
        return String.format("Car %sVehicle VIN: %s\n\n",super.toString(), vehicleVIN);
    }
}
