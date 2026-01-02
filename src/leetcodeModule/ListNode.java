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







    public static void main(String[] args) {

        ListNode a0  = new ListNode(9);
        ListNode a1  = new ListNode(3,a0);
        ListNode a2  = new ListNode(4,a1);
        ListNode a3  = new ListNode(2,a2);
        ListNode a4  = new ListNode(3,a3);
        ListNode a5  = new ListNode(4,a4);
        ListNode a6  = new ListNode(2,a5);
        ListNode a7  = new ListNode(3,a6);
        ListNode a8  = new ListNode(4,a7);
        ListNode a9  = new ListNode(2,a8);
        ListNode a10  = new ListNode(3,a9);


        ListNode b0  = new ListNode(9);
        ListNode b1  = new ListNode(9,b0);
        ListNode b2  = new ListNode(9,b1);
        ListNode b3  = new ListNode(9,b2);
        ListNode b4  = new ListNode(3,b3);
        ListNode b5  = new ListNode(4,b4);
        ListNode b6  = new ListNode(2,b5);
        ListNode b7  = new ListNode(3,b6);
        ListNode b8  = new ListNode(4,b7);
        ListNode b9  = new ListNode(2,b8);
        ListNode b10  = new ListNode(3,b9);

        printListNode(a10);

        System.out.println();

        printListNode(b10);

        ListNode res = new ListNode();

        res =  res.addTwoNumbers(a10 , b10);

        System.out.println();

        printListNode(res);

    }

}
