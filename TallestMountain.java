public class TallestMountain {
    public static void main(String[] args) {
        int[] heights = {1200, 1500, 2000, 1800, 2100, 1700};
        int maxHeight = heights[0];
        
        for (int height : heights) {
            maxHeight = Math.max(maxHeight, height);
        }
        
        System.out.println("Tallest mountain height: " + maxHeight);
    }
}
