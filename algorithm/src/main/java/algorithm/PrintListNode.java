package algorithm;

import com.google.common.collect.Lists;

import java.io.InputStream;
import java.util.List;
import java.util.Stack;

/**
 * @auther: fujie.feng
 * @DateT: 2019-06-28
 */
public class PrintListNode {

    public static class ListNode {

        private int val;

        private ListNode next;


        public ListNode(Integer val) {
            this.val = val;
            this.next = null;
        }


    }


    public List<Integer> print(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();

        while (listNode != null) {
//            stack.add(listNode.val);
//            listNode = listNode.next;

            stack.push(listNode.val);
            listNode = listNode.next;
        }
        List<Integer> list = Lists.newArrayList();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        PrintListNode printListNode = new PrintListNode();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        printListNode.print(listNode).stream().forEach(System.out::print);
    }
}
