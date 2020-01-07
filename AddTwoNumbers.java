class AddTwoNumbers {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            this.val = x;
        }
    }
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode p = l1, q = l2, current = dummyHead;
            int carry = 0;
            while(p != null || q != null) {
                int x = p == null ? 0: p.val;
                int y = q == null ? 0: q.val;
                int sum = x + y + carry;
                carry = sum / 10;
                current.next = new ListNode(sum % 10);
                current = current.next;
                if (p != null) {
                    p = p.next;
                }
                if (q != null) {
                    q = q.next;
                }
            }
            if (carry != 0) {
                current.next = new ListNode(carry);
            }
            return dummyHead.next;
        }
    }
}