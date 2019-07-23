

import java.util.Collections;
import java.util.Comparator;

public class Contacts  {

    protected Node head, tail;

    public Contacts() {
        head = tail = null;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void newContact(String name, String address, String rel, int number) {

        if (head == null) {
            head = tail = new Node(name, address, rel, number, head);
        } else {
            Node p, t;
            for (p = head, t = head.next; t != null; p = p.next, t = t.next);
            if (t != null) {
                p.next = new Node(name, address, rel, number, t);
            } else {
                tail.next = tail = new Node(name, address, rel, number, null);
            }
        }

        System.out.println();
    }

    public void changePhone(String a, int oldp, int newp) {
        Node tmp;
        for (tmp = head; tmp != null && !(a.equalsIgnoreCase(tmp.name));
                tmp = tmp.next);
        if (tmp.number == oldp) {
            tmp.number = newp;
            System.out.println("number changed");
        } else {
            System.out.println("wrong number, cannot change");
        }
    }

    public void searchByName(String a) {
        Node t;
        for (t = head; t != null && !(a.equalsIgnoreCase(t.name)); t = t.next);
        if (t == null) {
            System.out.println("There is no contact with this name");
        } else {
            System.out.println("Found " + "\t" + t.name + "\t" + t.address + "\t" + t.rel + "\t" + t.number);
        }

    }

    public void delete(String a) {
        if (isEmpty()) {
            System.out.println("No contacts");
        } else {
            if (head == tail && head.name.equals(a)) {
                head = tail = null;
            } else if (head.name.equals(a)) {
                head = head.next;
            } else {
                Node p, t;
                for (p = head, t = head.next; t != null && !t.name.equals(a); p = p.next, t = t.next);
                if (t == null) {
                    System.out.println("No contact with this name ");
                } else {
                    p.next = t.next;
                    if (tail == t) {
                        tail = p;
                    }
                }
            }
        }
    }

    public void print() {

        Node tmp;
        if (head == null) {
            System.out.println("There is no contact");
        } else {
            for (tmp = head; tmp != null; tmp = tmp.next) {

                System.out.println(tmp.name + "\t" + tmp.address + "\t" + tmp.rel + "\t" + tmp.number);

            }
        }
    }

    // sort array udatasing selection sort
    public void sort() {
        int smallest; // index of smallest element
// loop over data.length - 1 elements
        Node tmp;
        Node tmp2;
        for (tmp = head; tmp != null; tmp = tmp.next) {

// loop to find index of smallest element
            for (tmp2 = head.next; tmp2 != null; tmp2 = tmp2.next) {
                if (tmp.name.compareTo(tmp2.name) == -1) {
                    swap(tmp, tmp2); // swap smallest element into position

                }
            }

        } // end outer for
    } // end method sort

    // helper method to swap values in two elements
    public void swap(Node first, Node second) {
        Node temporary = first; // store first in temporary
        first = second; // replace first with second
        second = temporary; // put temporary in second
    } // end method swap

    public class NameSort implements Comparator<Node> {

//int the method compare this is where sorting occurs
        public int compare(Node ps1, Node ps2) {
            if ((ps1.name != null && ps2.name != null)) {

                return ps1.name.compareTo(ps2.name);
                //  }
            }
            return -1;
        }

    }

}
