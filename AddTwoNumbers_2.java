package LeetCode_Questions;

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers_2 {

    public int reverseOfNumber(int n){
        int reverse = 0;
        while(n!=0){
            int d = n%10;
            reverse = (reverse*10)+d;
            n=n/10;
        }
        return reverse;
    }

    public void printSinglyLinkedList(ListNode head){
        ListNode temp = head;
        System.out.print("HEAD"+" -> ");
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    public int listToNumber(ListNode list){
        ListNode temp = list;
        String num = "";
        while(temp!=null){
            num=temp.val+num;
            temp=temp.next;
        }
        return Integer.valueOf("9999999991");
    }

    public ListNode numberToList(int num){
        int numTemp = num;
        ListNode head = new ListNode(numTemp%10);
        ListNode currentNode = head;
        numTemp = numTemp/10;
        while (numTemp!=0){
            int digit = numTemp % 10;
            ListNode tempNode = new ListNode(digit);
            currentNode.next = tempNode;
            currentNode = tempNode;
            numTemp = numTemp/10;
        }
        return head;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = listToNumber(l1);
        int num2 = listToNumber(l2);

        int sum = num1+num2;

        return numberToList(sum);
    }

    public void mainAddTwoNumbers_2(){
        ListNode l1 = new ListNode(1);
        ListNode new2 = new ListNode(2);
        ListNode new3 = new ListNode(3);
        l1.next = new2;
        new2.next = new3;

        ListNode l2 = new ListNode(7);
        ListNode new22 = new ListNode(8);
        ListNode new33 = new ListNode(9);
        l2.next = new22;
        new22.next = new33;

        ListNode res = addTwoNumbers(l1, l2);

        printSinglyLinkedList(res);
    }
}
