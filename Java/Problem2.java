package Java;

//adds two numbers

public class Problem2{    

    public Problem2(){
        Solution s1 = new Solution();
        //example 1
        System.out.println("Should return [7, 0, 8]::" + outPutListNode(s1.addTwoNumbers(
            //creates a list node of [2, 4, 3]
            new ListNode(
                2,
                new ListNode(
                    4,
                    new ListNode(
                        3
                    )
                )
            ),
            //creates a list node of [5, 6, 4] 
            new ListNode(
                5,
                new ListNode(
                    6,
                    new ListNode(
                        4
                    )
                )
            ))));
        //example 2
        System.out.println("Should return [0]::" + outPutListNode(s1.addTwoNumbers(new ListNode(0), new ListNode(0))));
        //example 3
        System.out.println("Should return [8,9,9,9,0,0,0,1]::" + outPutListNode(s1.addTwoNumbers(
            new ListNode(
                9,
                new ListNode(
                    9,
                    new ListNode(
                        9,
                        new ListNode(
                            9,
                            new ListNode(
                                9,
                                new ListNode(
                                    9,
                                    new ListNode(
                                        9
                                    )
                                )
                            )
                        )
                    )
                )
            )
            , 
            new ListNode(
                9,
                new ListNode(
                    9,
                    new ListNode(
                        9,
                        new ListNode(
                            9
                        )
                    )
                )
            )
            )));
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }

    public String outPutListNode(ListNode l){
        ListNode temp = l;
        String rString = "[";

        while(temp != null){
            rString += temp.val;
            temp = temp.next;
            if(temp != null){
                rString += ",";
            }
        }

        return rString + "]";
    }    

    class Solution{
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode returnNode = new ListNode();
            ListNode temp = returnNode;
            int carryover = 0;
            
            while(l1 != null || l2 != null || carryover != 0){
                int one = (l1 != null) ? l1.val : 0;
                int two = (l2 != null) ? l2.val : 0;

                int sum = one + two + carryover;
                int digit = sum % 10;
                carryover = sum / 10;

                temp.next = new ListNode(digit);
                temp = temp.next;

                l1 = (l1 != null) ? l1.next : null;
                l2 = (l2 != null) ? l2.next : null;
            }

            return returnNode.next;
        }
        
    }

}