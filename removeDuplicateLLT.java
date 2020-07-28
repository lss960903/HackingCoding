import java.util.HashSet;
import java.util.Set;

class LinkedListNode{
    public int data;
    public LinkedListNode next;
    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class removeDuplicateLLT {

    public static LinkedListNode removeDup(LinkedListNode head) {
        Set<Integer> set =new HashSet<>();
        LinkedListNode curr = head;
        set.add(curr.data);
        while(curr.next!=null){
            if(!set.contains(curr.next.data)){
                set.add(curr.next.data);
                
                curr = curr.next;
            }
            else{
                curr.next = curr.next.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        int[] arr = {21,4,32,5};
        LinkedListNode head = null;
        LinkedListNode curr = null;
        for(Integer x:arr){
            LinkedListNode newNode = new LinkedListNode(x);
            if(head == null){
                head = newNode;
                curr = head;
            }
            else {curr.next = newNode;
            curr = curr.next;}
        }
        head = removeDup(head);
    }
    

}