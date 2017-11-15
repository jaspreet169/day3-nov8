/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author macstudent
 */
public class fullTime {
    
    
    private int commission;
    private int fixedSalary;
    private double totalSalary;
    

    public fullTime(int commission, int fixedSalary) {
        this.commission = commission;
        this.fixedSalary = fixedSalary;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    
    public void calcutateSalary(){
        this.totalSalary = this.fixedSalary + this.commission;
    }

    @Override
    public String toString() {
        return "fullTime{" + "commission=" + commission + ", fixedSalary=" + fixedSalary + '}';
    }

    public  String displayData()
    {
        return super.toString() + "\n"+ this.toString();
    }
    
    
    
    
    
}
