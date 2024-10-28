public class Watch{

String brandName;
int Price;
int Validity;

  public Watch(){
    System.out.println("No parameterised Constructor");
}
  public Watch(String brandName){
    this();
    System.out.println("Parameterised Constructor");
    
    this.brandName=brandName;
}

  public Watch(String brandName,int Price){
    this(brandName);
    this.Price=Price;
   
}
  public Watch(String brandName,int Price, int Validity){
     this(brandName,Price);
     this.Validity=Validity;
}
public  void WatchInfo(){
System.out.println("Brand Name:" + brandName);
System.out.println("Price:" + Price);

System.out.println("Validity:" + Validity);
}

}