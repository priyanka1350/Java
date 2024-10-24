public class StringProblems {
    public static void main(String[] args) {
        

       //Uppercase//

        String Greeting = "Priyanka Mahesh";
        System.out.println("Uppercase: " + Greeting.toUpperCase());

     

        String Location = "Banglore";
        System.out.println("Character at index 1: " + Location.charAt(1));
        
        String language = "PYTHON";
        System.out.println("Lowercase: " + language.toLowerCase());



        String institute = "Xworkz";
        System.out.println("Length: " + institute.length());

        String Browser = "Google";
        String Browser1 = "yahoo";
        System.out.println("Equals: " + Browser.equals(Browser1));

        

        String Mobile = "   oneplus   ";
        System.out.println("Trimmed: " + Mobile.trim());
       
        String country = "South Korea";
        System.out.println("Replace Letters: " + country.replace('p', 'v'));


        String Laptop = "Apple HP Dell";
        String[] laptopBrands = Laptop.split(" ");
        System.out.println(laptopBrands[0]);
        System.out.println(laptopBrands[1]);
        System.out.println(laptopBrands[2]);

        String Company = "Infosys Accenture";
        System.out.println("Starts with 'In': " + Company.startsWith("I"));

        System.out.println("Ends with 'Accenture': " + Company.endsWith("Accenture"));

        String data = "refer";
        String reversedStr = "";

        for (int i = data.length() - 1; i >= 0; i--) {
            reversedStr += data.charAt(i);
        }

        if (data.equals(reversedStr)) {
            System.out.println(data + " is a palindrome.");
        } else {
            System.out.println(data + " is not a palindrome.");
        }

        int[] values = { 12,30,45,60,70,75,60};
        int smallestElement = values[0];
        int secondSmallestElement = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < smallestElement) {
                secondSmallestElement = smallestElement;
                smallestElement = values[i];
            } else if (values[i] < secondSmallestElement) {
                secondSmallestElement = values[i];

            }
        }

        System.out.println(secondSmallestElement);

    }
}