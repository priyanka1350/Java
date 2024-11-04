 class Students extends Staff {
    int Year;
    public Students(String Name, int age, int ID,int Experiance, int Year){
        super(Name, age, ID, Experiance);
        this.Year=Year;
    }

    public void StudentDetails(){
        System.out.println("Name: " + Name);
        System.out.println("age: " + age);
        System.out.println("HOD ID: " + ID);
       
        System.out.println("semester Year: " + Year);
        System.out.println("_______________________");
    } 
 }
    public class StudentsInfo{
     public static void main(String[] args) {
        Students students=new Students("Priyanka Mahesh", 23, 53, 0, 2 );
        Students students2=new Students("Priya Hegde", 23, 51,0, 2);
        Students students3=new Students("Sindhu", 23, 81, 0,2);
        Students students4=new Students("Roopa", 23, 56, 0,2);
        Students students5=new Students("Swathi", 23, 84,0, 2);


        students.StudentDetails();
        students2.StudentDetails();
        students3.StudentDetails();
        students4.StudentDetails();
        students5.StudentDetails();

    }




}
