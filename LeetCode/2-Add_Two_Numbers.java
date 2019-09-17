/*
*
* Q: Add Two Numbers
*  You are given two non-empty linked lists representing two non-negative integers. 
*  The digits are stored in reverse order and each of their nodes contain a single digit. 
*  Add the two numbers and return it as a linked list.
*  You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*
*  Example:
*
*  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
*  Output: 7 -> 0 -> 8
*  Explanation: 342 + 465 = 807.
*
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int data=0;
        int carry=0;
        
        ListNode l3 = new ListNode(-1);
        ListNode head = l3;
        while(l1!=null && l2!=null){  
            data=(l1.val + l2.val+carry);
            carry=0;
            if(data>=10){
                carry=1;
            }
            data = data%10;
            if(l3.val == -1){
                l3.val=data;
            }
            else{
                l3.next = new ListNode(data);
                l3 = l3.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            data = l1.val + carry;
            carry=0;
            if(data>=10){
                carry=1;
            }
            data = data%10;
            l3.next = new ListNode(data);
            l3=l3.next;
            l1=l1.next;
        }
        while(l2!=null){
            data = l2.val + carry;
            carry=0;
            if(data>=10){
                carry=1;
            }
            data = data%10;
            l3.next = new ListNode(data);
            l3=l3.next;
            l2=l2.next;
        }
        if(carry ==1){
            l3.next = new ListNode(carry);
        }
    return head;
    }
}
