public class ParameterSession {

    // Method to simulate sending an email
    public static void email(String emailId, String subject) {
        System.out.println("Email sent to: " + emailId + " with subject: " + subject);
    }

    // Method to simulate making a phone call
    public static void phoneCall(String mobNum, String name, String countryCode) {
        System.out.println("Calling " + name + " at " + countryCode + mobNum);
    }

    // Method to simulate user login
    public static void login(String email, String password) {
        System.out.println("Logged in with email: " + email);
    }

    public static void main(String[] args) {
        // Manually invoking email method three times
        email("priya@gmail.com", "Subject 1");
        email("priyanka@gmail.com", "Subject 2");
        email("mahesh@gmail.com", "Subject 3");

        // Manually invoking phoneCall method three times
        phoneCall("1234567891", "priya", "+91");
        phoneCall("1234567892", "priyanka", "+91");
        phoneCall("1234567893", "mahesh", "+91");

        // Manually invoking login method three times
        login("priya@gmail.com", "password1");
        login("priyanka@gmail.com", "password2");
        login("mahesh@gmail.com", "password3");
    }
}
