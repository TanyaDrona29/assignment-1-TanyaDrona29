package Assignment1.defination;

import Assignment1.ADT.LinkedListADT;
//import javafx.scene.Node;

import java.util.ArrayList;

public class DefinationClass<Person> implements LinkedListADT<Person> {
    private ArrayList<String> Name = new ArrayList<>();
    private ArrayList<String> FirstName = new ArrayList<>();
    private Node<Person> head = null;
    private int size = 0;

    public Node(Node next, Person data) {
        this.next = next;
        this.data = data;

    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Person getData() {
        return data;
    }

    public void setData(Person data) {
        this.data = data;
    }
}

}
