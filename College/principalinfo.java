 class Principal extends Staff {
    
    String responsibility;

    public Principal(String Name, int age, int ID,  int Experiance, String responsibility) {
        super(Name, age, ID, Experiance);
        this.responsibility = responsibility;
    }


  

    public void PrincipalDetails(){
        System.out.println("Name: " + Name);
        System.out.println("age: " + age);
        System.out.println("HOD ID: " + ID);
        System.out.println("Year of experiance: " + Experiance);
        System.out.println("Responsibility " + responsibility);
    }
}
    public class principalinfo{
        public static void main(String[] args){
        Principal principal=new Principal("Dr. Y.Vijaya Kumar", 65, 101, 30 ,"Management");

        principal.PrincipalDetails();
        }

}
