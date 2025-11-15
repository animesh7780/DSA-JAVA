public class DominantOnes{
    public long countDominantSubstrings(String s) {
        int n = s.length();
        int[] prefixOnes = new int[n + 1];
        int[] prefixZeros = new int[n + 1];

        // Build prefix sums for ones and zeros
        for (int i = 0; i < n; i++) {
            prefixOnes[i + 1] = prefixOnes[i] + (s.charAt(i) == '1' ? 1 : 0);
            prefixZeros[i + 1] = prefixZeros[i] + (s.charAt(i) == '0' ? 1 : 0);
        }

        long count = 0;

        // Based on the constraint, maximum zero count to consider can be sqrt(n)
        int maxZeros = (int) Math.sqrt(n) + 2;

        // For each possible number of zeros up to maxZeros
        for (int z = 0; z <= maxZeros; z++) {
            // Use a map to count occurrences of prefix sums 
            // Here the formula used to check for ones and zeros difference:
            // We want O >= Z^2 => prefixOnes[r] - prefixOnes[l] >= (prefixZeros[r] - prefixZeros[l])^2
            // Rearrange to prefixOnes[r] - z^2 >= prefixOnes[l], enforce zero count difference = z
            java.util.Map<Integer, Integer> freq = new java.util.HashMap<>();
            freq.put(0, 1);

            for (int i = 1; i <= n; i++) {
                // Check current zero count difference
                int currentZeros = prefixZeros[i];
                int currentOnes = prefixOnes[i];

                // We want to check prefix points where zero difference is z
                // For substring ending at i with zeros count z:
                if (currentZeros - z >= 0) {
                    int requiredOnes = currentOnes - z * z;
                    // Count the number of prefix indices with prefixOnes == requiredOnes and prefixZeros == currentZeros - z
                    // We maintain freq map keyed on prefixOnes - but restricted to certain structure
                    count += freq.getOrDefault(requiredOnes, 0);
                }

                // Add current prefixOnes to freq map for future matches (keyed by prefixOnes)
                freq.put(currentOnes, freq.getOrDefault(currentOnes, 0) + 1);
            }
        }

        return count;
    }
}