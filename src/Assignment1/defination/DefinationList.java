package Assignment1.defination;

import Assignment1.ADT.LinkedListADT;
import Assignment1.PersonDetails.Person;

import java.util.ArrayList;

public class DefinationList<Person> implements LinkedListADT<Person> {
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
    }
    private ArrayList<String> Name = new ArrayList<>();
    private ArrayList<String> FirstName = new ArrayList<>();
    private Node<Person> head = null;
    private int size = 0;
}
