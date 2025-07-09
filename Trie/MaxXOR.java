class TrieNode {
    TrieNode[] children;
    
    public TrieNode() {
        children = new TrieNode[2]; // 0 and 1
    }
}

class Trie {
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    // Insert a number into the trie
    public void insert(int num) {
        TrieNode node = root;
        // Process bits from most significant to least significant (31 to 0)
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.children[bit] == null) {
                node.children[bit] = new TrieNode();
            }
            node = node.children[bit];
        }
    }
    
    // Find maximum XOR for a given number
    public int findMaxXor(int num) {
        TrieNode node = root;
        int maxXor = 0;
        
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int toggledBit = 1 - bit; // Try opposite bit first
            
            if (node.children[toggledBit] != null) {
                maxXor |= (1 << i); // Set this bit in result
                node = node.children[toggledBit];
            } else {
                node = node.children[bit];
            }
        }
        
        return maxXor;
    }
}

public class MaxXOR{
    public static int maxXorPair(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        
        Trie trie = new Trie();
        int maxXor = 0;
        
        // Insert first element
        trie.insert(arr[0]);
        
        // For each subsequent element, find max XOR with previous elements
        for (int i = 1; i < arr.length; i++) {
            maxXor = Math.max(maxXor, trie.findMaxXor(arr[i]));
            trie.insert(arr[i]);
        }
        
        return maxXor;
    }
}