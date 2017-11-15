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
public class partTime  extends Employee{ 
    
     private int noOfhours;
     private double rate;
     private double totalSalary;
     
     
     

    public double getTotalSalary() {
        return totalSalary;
    }
     
     
     
    public partTime() {
        
        super();
        
    }

    public partTime(int noOfhours, double rate) {
        this.noOfhours = noOfhours;
        this.rate = rate;
    }

    public partTime(int empId, String empName,int noOfhours, double rate) {
        super(empId, empName);
        this.noOfhours = noOfhours;
        this.rate = rate;
    }

    public int getNoOfhours() {
        return noOfhours;
    }

    public void setNoOfhours(int noOfhours) {
        this.noOfhours = noOfhours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
     
    
    public void calcutateSalary(){
        this.totalSalary = this.rate* this. noOfhours;
    }

    @Override
    public String toString() {
        return   "\n partTime{" + "noOfhours=" + noOfhours + ", rate=" + rate + ", totalSalary=" + totalSalary + '}';
    }
    
    
    public  String displayData()
    {
        return super.toString() + "\n"+ this.toString();
    }
    
    
}
