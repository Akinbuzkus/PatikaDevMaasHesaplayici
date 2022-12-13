
public class PatikaDevMaasHesaplayici {
    public static void main(String[] args) {
        Employee emp=new Employee("Akin Buzkus", 4500, 62, 2016);
        System.out.println(emp);
        emp.tax();
        emp.Bonus();
        emp.raiseSalary();
       
    }
} 
    class Employee{
        String name;
        int salary,workHours,hireYear;

        public Employee(String name,int salary,int workHours,int hireYear) {
            this.name=name;
            this.salary=salary;
            this.workHours=workHours;
            this.hireYear=hireYear;
            
        }
        public void tax(){
            int newSalary;
            
            if(salary<=1000){
                newSalary=0;
                System.out.println("Tax :"+newSalary);
            }
            else{
                newSalary=(salary*3)/100;
                System.out.println("Tax :"+newSalary);
            }
            
        }
        
        public void Bonus(){
            int bonus=0;
            if(workHours>40){
                bonus=(workHours%40)*30;
                System.out.println("Bonus :"+bonus);
            }
            else{
                System.out.println("Bonus :"+bonus);
              
            }
                
           
        }
        
        public void raiseSalary(){
            
            int year=2021;
            int totalYear=year-hireYear;
            
            if(totalYear<10){
                salary=(salary*5)/100;
                System.out.println("Raise Salary :"+salary);
            }
            else if(totalYear>9 && totalYear<20){
                salary=(salary*10)/100;
                System.out.println("Raise Salary :"+salary);
            }
            else if(totalYear>19){
                salary=(salary*15)/100;
                System.out.println("Raise Salary :"+salary);
            }
            
           
        }

        @Override
        public String toString() {
            return "Employee:\n" + "Name=" + name + "\nSalary=" + salary + "\nWorkHours=" + workHours + "\nHireYear=" + hireYear;
        }
     
        
        
    }

