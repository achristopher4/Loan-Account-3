/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgrammingAssignment3;

/**
 *
 * @author alexchristopher
 */
public class PrimaryMortgage extends LoanAccount{
    final private double PMIMonthlyAmount;
    final private Address address;
    
    public PrimaryMortgage(double principal, double annualInterestRate, 
            int months, double PMIMonthlyAmount, Address address){
        super(principal, annualInterestRate, months);
        this.address = address;
        if ( PMIMonthlyAmount < 0.0) {
            throw new IllegalArgumentException("PMIMonthlyAmount must be greater than or equal to 0.0");
        }
        this.PMIMonthlyAmount = PMIMonthlyAmount;
    }
    
    @Override
    public String toString() {
        return String.format("Primary Mortgage %sPMI Monthly Amount: $%.2f\n%s\n\n", super.toString(), PMIMonthlyAmount, address);
    }
}
