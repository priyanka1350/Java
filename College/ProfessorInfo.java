class Professors extends Staff {
    String Subject;

    public Professors(String Name, int age, int ID,  int Experiance,    String Subject){
        super(Name, age, ID, Experiance);
        this.Subject=Subject;
    }
     
    public void ProfessorDetails(){
        System.out.println("Name: " + Name);
        System.out.println("age: " + age);
        System.out.println("HOD ID: " + ID);
        System.out.println("Year of experiance: " + Experiance);
        System.out.println("Subject: " + Subject);
        System.out.println("_______________________");
    } 

}    
public class ProfessorInfo{
    public static void main(String[] args) {
        
        Professors professor=new Professors("Manjunath", 49, 4, 18, "MAD");
        Professors professor2=new Professors("Dr.raghavendra", 52, 5, 16, "ADAA");
        Professors professor3=new Professors("Arun Kumar", 47, 6, 15, "Web Technology");
        Professors professor4=new Professors("Dr.Sunitha", 58, 7, 25, "Python");
        
        
        
        professor.ProfessorDetails();
        professor2.ProfessorDetails();
        professor3.ProfessorDetails();
        professor4.ProfessorDetails();
    }
}
