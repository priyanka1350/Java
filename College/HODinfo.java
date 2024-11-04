  class HOD extends Staff {
    String department;
    
    public HOD(String Name,  int age,int ID, int  Experiance, String department) {
        super(Name,  age,ID, Experiance); 
        this.department=department;
    }
    
    

    public void HodDetails(){
         
        System.out.println("Name: " + Name);
        System.out.println("age: " + age);
        System.out.println("HOD ID: " + ID);
        System.out.println("Year of experiance: " + Experiance);
        System.out.println("Department: " + department);
    }
    }  

 

    public class HODinfo{
        public static void main(String[] args){

        HOD hod=new HOD("Hemanth Kumar",45,001, 19, "MCA");
        // hod.Name= "Hemanth Kumar";
        // hod.age= 45;
        // hod.ID= 001;
        // hod.Experiance= 19;

        hod.HodDetails();

        System.out.println("________________________________");

        HOD hod2=new HOD("Srikanth",57,002, 25, "MBA");
        // hod2.Name= "Srikanth";
        // hod2.age= 57;
        // hod2.ID= 002;
        // hod2.Experiance= 25;
        
        hod2.HodDetails();
    }

    }
