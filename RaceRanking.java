// alice , bob, and chalie participated in a 400-meter race. the time taken by alice, bob, and chalie to complete the race was X,Y & Z seconds repectively. Note that X,Y,z are distinct
public class RaceRanking {
    public static void main(String[] args) {
        int X = 50, Y = 45, Z = 60;  // Time taken by Alice, Bob, and Charlie
        
        if (X < Y && X < Z) {
            System.out.println("Alice is 1st");
            System.out.println(Y < Z ? "Bob is 2nd, Charlie is 3rd" : "Charlie is 2nd, Bob is 3rd");
        } else if (Y < Z) {
            System.out.println("Bob is 1st");
            System.out.println(X < Z ? "Alice is 2nd, Charlie is 3rd" : "Charlie is 2nd, Alice is 3rd");
        } else {
            System.out.println("Charlie is 1st");
            System.out.println(X < Y ? "Alice is 2nd, Bob is 3rd" : "Bob is 2nd, Alice is 3rd");
        }
    }
}
