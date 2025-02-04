public class RecursionPermutation {
    public static void main(String[] args) {
        System.out.println("Total permutations: " + permutation("", "abc", 0));
    }

    static int permutation(String p, String up, int count) {
        if (up.isEmpty()) {
            System.out.println(p);
            return count + 1; // Return count incremented by 1 for this permutation
        }

        char ch = up.charAt(0);
        
        // Insert `ch` at every position in `p`
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count = permutation(f + ch + s, up.substring(1), count); // Accumulate count from recursive calls
        }

        return count; // Return the accumulated count to the caller
    }
    
}
