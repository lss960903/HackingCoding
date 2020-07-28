public class intersectLLT {
    public static LinkedListNode intersect(LinkedListNode head1, LinkedListNode head2) {
        //TODO: Write - Your - Code
        int length1 = length(head1);
        int length2 = length(head2);
        int d = length1-length2;
        LinkedListNode tmp = head1;
        LinkedListNode tmp2 = head2;
        while(d>=0 &&tmp!=null&&tmp2!=null){
          while(d!=0){
            tmp = tmp.next;
            d--;
          }
          if(tmp==tmp2){
            return tmp;
          }
          tmp = tmp.next;
          tmp2 = tmp2.next;
        }
        if(d<0){
          d = -d;
          while(d>=0 && tmp!=null && tmp.next!=null){
            while(d!=0){
              tmp2 = tmp2.next;
              d--;
            }
            if(tmp==tmp2){
            return tmp;
          }
          tmp = tmp.next;
          tmp2 = tmp2.next;
          }
        }
        
        return null;
      } 
      public static int length(LinkedListNode head){
        int length = 0;
        LinkedListNode curr = head;
        while(curr!=null){
          length++;
          curr = curr.next;
        }
        return length;
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
        int[] arr = {21,4,32,5};
        int[] arr2 = {1,3,5,32,5};
        LinkedListNode head1 = create(arr);
        LinkedListNode head2 = create(arr2);

        int a = intersect(head1, head2).data;
        System.out.println(a);
    }
    
}