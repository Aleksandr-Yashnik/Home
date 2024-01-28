public class CustomLinkedList {
    Node head; // голова списка

    /* Внутренний класс Node */
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    /* Метод для нахождения k-го элемента с конца списка */
    public void findKthFromEnd(int k) {
        Node first = head;
        Node second = head;
        int count = 0;

        if (head != null) {
            while (count < k) {
                if (second == null) {
                    System.out.println(k + " больше, чем количество узлов в списке");
                    return;
                }
                second = second.next;
                count++;
            }

            while (second != null) {
                first = first.next;
                second = second.next;
            }
            System.out.println("Node no. " + k + " from last is " + first.data);
        }
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        list.findKthFromEnd(4);  // должно вывести "4"
    }
}