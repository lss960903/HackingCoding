class LinkedListNode{
    public int data;
    public LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class reverseLLT {
    

    public static LinkedListNode reverse(LinkedListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        LinkedListNode reversedNode = head;
        LinkedListNode curr = head.next;
        reversedNode.next =  null;
        while(curr!=null){
            LinkedListNode tmp = curr;
            curr = curr.next;
            tmp.next = reversedNode;
            reversedNode = tmp;
            System.out.println(reversedNode.data);
        }
        return reversedNode;
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
        head = reverse(head);
    }
    
}