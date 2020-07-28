public class insertSortLLT{
    public static LinkedListNode insertionSort(LinkedListNode head) {
        
        LinkedListNode sorted = null;
        LinkedListNode curr = head;
        while(curr!= null){
            LinkedListNode tmp = curr.next;
            sorted = insert(curr,sorted);
            curr = tmp;
        }

        return sorted;
    }

    public static LinkedListNode insert(LinkedListNode node,LinkedListNode head) {
        if(node==null){
            return head;
        }
        if(head==null || node.data<=head.data){
            node.next = head;
            return node;
        }
        LinkedListNode curr = head;
        while(curr.next!=null && curr.next.data<node.data){
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;

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
        head = insertionSort(head);
    }
}