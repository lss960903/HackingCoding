public class mergeSortLLT {
    public static LinkedListNode mergeSorted(LinkedListNode head1, LinkedListNode head2) { 
        LinkedListNode merged = new LinkedListNode(0);
        LinkedListNode curr = compare(head1,head2);
        merged.next = curr;
        while(head1!=null && head2!=null){
          if(curr==head1){
            head1 = head1.next;
          }
          if(curr==head2){
            head2 = head2.next;
          }
          if(head1==null || head2==null){
              continue;
          }
          curr.next = compare(head1,head2);
          curr = curr.next;
        }
          while(head2!=null){
            curr.next = head2;
            curr = curr.next;
            head2 = head2.next;
          }
          while(head1!=null){
            curr.next = head1;
            curr = curr.next;
            head1= head1.next;
          }
        
    
        return merged.next;
      }
    
      public static LinkedListNode compare(LinkedListNode head1, LinkedListNode head2){
        if(head1.data>head2.data){
          return head2;
        }
        else return head1;
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
        int[] arr = {4,6,9,13,16};
        int[] arr2 = {1,3,5,7,11};
        LinkedListNode head1 = create(arr);
        LinkedListNode head2 = create(arr2);

        LinkedListNode ans =  mergeSorted(head1, head2);
        while(ans!=null){
            System.out.println(ans.data);
            ans = ans.next;
        }
}
}