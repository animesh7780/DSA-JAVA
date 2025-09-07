import java.util.ArrayList;
import java.util.Collections;

public class MergeList {
    // code here
    Node mergeKLists(Node[] arr) {
        if(arr == null || arr.length == 0) return null;
        ArrayList<Integer> all = new ArrayList<>();
        int n = arr.length;

        for(int i=0; i<n; i++){
            Node curr = arr[i];
            while(curr != null){
                all.add(curr.data);
                curr = curr.next;
            }
        }

        if(all.size() == 0) return null;

        Collections.sort(all);
        
        Node dummy = new Node(0);
        Node curr = dummy;

        for(int i=0; i<all.size(); i++){
            curr.next = new Node (all.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
}
