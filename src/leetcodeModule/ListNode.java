package leetcodeModule;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;

    }

    public static  void  printListNode(ListNode listNode){

        if(listNode.next == null){
            System.out.print(listNode.val);
            return ;
        }

        System.out.print( listNode.val +"->" );

        printListNode(listNode.next);

    }





    /*

    tried it but for
    [2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,9]

    [5,6,4,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,2,4,3,9,9,9,9]

    time excided




       public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        System.out.println(l1.val+" "+l2.val);

        ListNode result = new ListNode();

        result.val = l1.val + l2.val ;

        if(result.val > 9 ){

            result.val = result.val %10;
            result.next = new ListNode(1);
        }

        if(result.next == null && l1.next == null && l2.next == null){
            return result;
        }


        if(result.next == null){
            result.next = new ListNode(0);

        }

        if(l1.next == null){
            l1.next = new ListNode(0);
        }
        result.next = addTwoNumbers(l1.next , result.next);


        if(l2.next == null){
            l2.next = new ListNode(0);;
        }
        result.next = addTwoNumbers(l2.next , result.next);

        return  result;
    }




     */

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // best solution



        ListNode currentNode = new ListNode();

        currentNode.val = l1.val + l2.val ;

        if(currentNode.val > 9 ){
            currentNode.val = currentNode.val % 10;
            currentNode.next = new ListNode(1);
        }

        ListNode baseNode = currentNode;

        while ( currentNode.next !=null || l1.next != null || l2.next != null){

            if (currentNode.next == null){
                currentNode.next = new ListNode(0);
            }
            currentNode = currentNode.next;


            if (l1.next == null){
                l1.next = new ListNode(0);
            }
            l1 = l1.next;


            if (l2.next == null){
                l2.next = new ListNode(0);
            }
            l2 = l2.next;

            currentNode.val = currentNode.val + l1.val + l2.val;

            if(currentNode.val > 9){
                currentNode.val = currentNode.val % 10;
                currentNode.next = new ListNode(1);
            }
        }


        return baseNode;
    }





    public static void main(String[] args) {

        ListNode a0  = new ListNode(3);
        ListNode a1  = new ListNode(9,a0);
        ListNode a2  = new ListNode(9,a1);
        ListNode a3  = new ListNode(9,a2);
        ListNode a4  = new ListNode(9,a3);
        ListNode a5  = new ListNode(9,a4);
        ListNode a6  = new ListNode(9,a5);

        ListNode b0  = new ListNode(3);
        ListNode b1  = new ListNode(9,b0);
        ListNode b2  = new ListNode(9,b1);
        ListNode b3  = new ListNode(9,b2);



        printListNode(a6);
        System.out.println();
        printListNode(b3);
        System.out.println();


        ListNode result = addTwoNumbers(a0 , b0);

        printListNode(result);









    }

}
