/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgrammingAssignment3;

/**
 *
 * @author alexchristopher
 */
public class LoanAccount {
    private double principal;
    private double annualInterestRate;
    private int months;
    
    public LoanAccount(double principal, double annualInterestRate, int months) {
        if (principal < 0.0) {
            throw new IllegalArgumentException("principal must be greater than or equal to 0.0");
        }
        if (annualInterestRate < 0.0 || annualInterestRate > 100.0) {
            throw new IllegalArgumentException("annualInterestRate must be greater than or equal to 0.0 and less than or equal to 1.0");
        }
        if (months < 0.0) {
            throw new IllegalArgumentException("months must be greater than or equal to 0.0");
        }
        
        this.annualInterestRate = annualInterestRate/100;
        this.principal = principal;
        this.months = months;
    }
    
    public double getPrincipal() {return principal;}
    
    public double getAnnualInterestRate() {return annualInterestRate;}
    
    public int getMonths() {return months;}
    
    public double calculateMonthlyPayment() {
        double monthlyInterest = annualInterestRate/12;
        return principal * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -months)));
    }
    
    @Override
    public String toString(){
        return String.format("""
                             Loan:
                             Principal: $%.2f
                             Annual Interest Rate: %.2f%%
                             Term of Loan in Months: %d
                             Monthly Payment: $%.2f
                             """, 
                principal, annualInterestRate*100, 
                months, calculateMonthlyPayment());
    }
}
