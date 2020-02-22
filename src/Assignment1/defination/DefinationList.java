package Assignment1.defination;

import Assignment1.ADT.LinkedListADT;
import Assignment1.PersonDetails.Person;

import java.util.ArrayList;

public class DefinationList<Person> implements LinkedListADT<Person> {
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> firstName = new ArrayList<>();
    private Node<Person> head = null;
    private int size = 0;

    public Node<Person> getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }
    private void addFirst(Person details) {
        head = new Node<Person>(head, details);
        size++;

    }
    private void addAfter(Node node, Person details) {
        Node<Person> temp = node;
        if (node != null) {
            temp.next = new Node(node.next, details);
            size++;
        }
    }
    private void add(int index, Person details) {
        if (index == 0) {
            addFirst(details);
        }
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException("the index is invalid");
        } else {
            Node node = getNode(index - 1);
            addAfter(node.next, details);

        }
    }
        private static class Node<Person>{
        private Node next = null;
        private Person data = null;

        public Node(Node next, Person data) {
            this.next = next;
            this.data = data;
        }
        public Node(Person data){
            this.data = data;
            this.next = null;
        }

        public Person getData() {
            return data;
        }

        public void setData(Person data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
