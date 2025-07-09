public class TrieII{
    private Node root;

    TrieII(){
        root = new Node();
    }

    public void insert(String word){
        Node node = root;
        for(int i=0; i<word.length(); i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i), node);
            }
            node = node.get(word.charAt(i));
            node.increasePrefix();
        }
        node.increaseEnd();
    }

    public int countWordsEqualTo(String word){
        Node node = root;

        for(int i=0; i<word.length(); i++){
            if(node.containsKey(word.charAt(i))){
                node = node.get(word.charAt(i));
            }
            else{
                return 0;
            }
        }
        return node.getEnd();
    }

    public int countWordStartsWith(String word){
        Node node = root;

        for(int i=0; i<word.length(); i++){
            if(node.containsKey(word.charAt(i))){
                node = node.get(word.charAt(i));
            }
            else{
                return 0;
            }
        }
        return node.getPrefix();
    }

    void erase(String word){
        Node node = root;

        for(int i=0; i<word.length(); i++){
            if(node.containsKey(word.charAt(i))){
                node = node.get(word.charAt(i));
                node.reducePrefix();
            }
            else{
                return;
            }
        }
        node.deleteEnd();
    }
}

class Node{
    Node links[] = new Node[26];
    int ew = 0;
    int count = 0;
    public Node(){

    }

    boolean containsKey(char ch){
        return (links[ch - 'a'] != null);
    }

    Node get(char ch){
        return links[ch - 'a'];
    }

    void put(char ch, Node node){
        links[ch - 'a'] = node;
    }

    void increaseEnd(){
        ew++;
    }

    void increasePrefix(){
        count++;
    }

    void deleteEnd(){
        ew--;
    }

    void reducePrefix(){
        count--;
    }

    int getEnd(){
        return ew;
    }

    int getPrefix(){
        return count;
    }
}