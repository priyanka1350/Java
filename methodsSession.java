public class methodsSession {
    public static void main(String[] args){
    example1();
    addInt();
    subShort();
    multiplyFloats();
    divideLongs();
    displayChar();
    greetUser();
    checkBoolean();
    }
    public static void example1()
    {
        System.out.println("Hello");
    }
    public static void addInt(){
        int a=2;
        int b=6;
        int sum=(a+b);
        System.out.println(sum);

    }
    public static void subShort(){
        short a= 123;
        short b= 321;
        short difference=(short) (a-b);
        System.out.println(difference);
    }
    public static void multiplyFloats() {
        float a = 4.5f;
        float b = 2.0f;
        float product = (a*b);
        System.out.println(product);
    }
    public static void divideLongs() {
        long a = 10000L;
        long b = 5000L;
        long result = a / b;
        System.out.println(result);
    }
    public static void displayChar() {
        char letter = 'B';
        System.out.println(letter);
    }
    public static void greetUser() {
        String firstName = "Priyanka";
        String lastName = "Mahesh";
        String fullName = firstName + " " + lastName;
        System.out.println( fullName );
    }
    public static void checkBoolean() {
        boolean isJavaFun = true;
        if (isJavaFun) {
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun.");
        }
    }

}
