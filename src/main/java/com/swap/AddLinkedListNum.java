package com.swap;

public class AddLinkedListNum {
    public ListNode addTwoNums(ListNode l1, ListNode l2){

        return l1;
    }

    public static void main(String[] args) {
        ListNode ls = new AddLinkedListNum().addTwoNums(new ListNode(3), new ListNode(2));
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}