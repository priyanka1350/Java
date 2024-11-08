// chef as started working at a candy stor. the store has a total of 100 chocolates, chef's dailt goal is to sell X chocolate . for each chocolate sold , he earns 1 rupee. however, if  chef exceeds his daily goal, he earns 2 rupees for each extra chocolate sold beyond his goal. given that sells Y chocolate in a day, calculate the total amount of money he made
public class ChefEarnings {
    public static void main(String[] args) {
        int X = 50;  
        int Y = 60;  
        int totalEarnings;
        
        if (Y <= X) {
            totalEarnings = Y * 1;  
        } else {
            totalEarnings = (X * 1) + ((Y - X) * 2);  
        }
        
        System.out.println("Total earnings: " + totalEarnings + " rupees");
    }
}

