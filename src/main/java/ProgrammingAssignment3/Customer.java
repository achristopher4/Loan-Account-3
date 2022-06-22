/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgrammingAssignment3;

/**
 *
 * @author alexchristopher
 */

import java.util.ArrayList;

public class Customer<Loan> {
    private final String firstName;
    private final String lastName;
    private final String SSN;
    private ArrayList<Loan> loanAccounts = new ArrayList<>();
    
    public Customer(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }
    
    public void addLoanAccount(Loan loan){
        loanAccounts.add(loan);
    }
    
    public String printMonthlyReport(){
        String report = String.format("Account Report for Customer: %s %s with SSN %s%n", firstName, lastName, SSN);
  
        for (Loan loan : loanAccounts) {
            report  = report + loan.toString();
            //report = report + "%n";
        }
        
        return report;
    }
}
