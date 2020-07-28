public class swapNthNodeLLT {
    public static LinkedListNode swapNthNode(LinkedListNode head, int n) {
        LinkedListNode first = head;
        LinkedListNode second = head.next;
        LinkedListNode node = head;
        while(n!=1){
          node = node.next;
          n--;
        }
        first.next = node.next;
        LinkedListNode curr = node;
        curr.next = second;
        curr = curr.next;
        while(curr!=null){
          LinkedListNode tmp = curr.next;
          if(tmp==node){
            tmp = first;
            curr.next = tmp;
          }
          curr = tmp;
        }
        return node;
      }

      public static LinkedListNode create(int[] arr) {
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
          
        return head;
      }

      public static void main(String[] args) {
        int[] arr2 = {7,14,21,28,4};
        LinkedListNode head2 = create(arr2);
        LinkedListNode head = swapNthNode(head2, 3);
        System.out.println(head.data);
    }
}