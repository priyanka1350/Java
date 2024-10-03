public class ParameterSession {

    
    public static void email(String emailId, String subject) {
        System.out.println("Email sent to: " + emailId + " with subject: " + subject);
    }

    public static void phoneCall(String mobNum, String name, String countryCode) {
        System.out.println("Calling " + name + " at " + countryCode + mobNum);
    }

    
    public static void login(String email, String password) {
        System.out.println("Logged in with email: " + email);
    }

    public static void main(String[] args) {
       
        email("priya@gmail.com", "Subject 1");
        email("priyanka@gmail.com", "Subject 2");
        email("mahesh@gmail.com", "Subject 3");

        
        phoneCall("1234567891", "priya", "+91");
        phoneCall("1234567892", "priyanka", "+91");
        phoneCall("1234567893", "mahesh", "+91");

        
        login("priya@gmail.com", "password1");
        login("priyanka@gmail.com", "password2");
        login("mahesh@gmail.com", "password3");
    }
}
