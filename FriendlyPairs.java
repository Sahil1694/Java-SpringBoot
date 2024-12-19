import java.util.*;
public class FriendlyPairs {

    public static int countFriendlyPairs(int[] A) {
        int N = A.length;
        
        // Initialize a map to keep track of robot types and their positions
        Map<Integer, List<Integer>> robotPositions = new HashMap<>();
        
        // Fill the map with positions of each robot type (excluding holes)
        for (int i = 0; i < N; i++) {
            if (A[i] != 0) {  // Ignore holes (0s)
                robotPositions.putIfAbsent(A[i], new ArrayList<>());
                robotPositions.get(A[i]).add(i);
            }
        }
        
        // Count friendly pairs
        int friendlyPairsCount = 0;
        
        // Iterate over each robot type
        for (Map.Entry<Integer, List<Integer>> entry : robotPositions.entrySet()) {
            List<Integer> positions = entry.getValue();
            
            // For each pair of positions of the same robot type
            for (int i = 0; i < positions.size(); i++) {
                for (int j = i + 1; j < positions.size(); j++) {
                    // Check if there is no hole between them
                    int pos1 = positions.get(i);
                    int pos2 = positions.get(j);
                    
                    // If there's no hole between pos1 and pos2, it's a valid pair
                    boolean validPair = true;
                    for (int k = pos1 + 1; k < pos2; k++) {
                        if (A[k] == 0) {
                            validPair = false;
                            break;
                        }
                    }
                    
                    // If valid, increment the count of friendly pairs
                    if (validPair) {
                        friendlyPairsCount++;
                    }
                }
            }
        }
        
        // Return the result
        return friendlyPairsCount;
    }

    public static void main(String[] args) {
        // Example usage
        int[] A = {1, 2, 2, 1, 0, 1, 1, 0, 0, 3, 3};
        
        int result = countFriendlyPairs(A);
        System.out.println(result);  // Output: 4
    }
}