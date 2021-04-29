package org.iesfm.listaenlazada;

public class Lista<T> {

    private Nodo<T> head;

    public Lista() {
        //Creamos un constructor vacío por si tenemos una lista vacía. Sin primer valor (head)
    }

    public Lista(Nodo<T> head) {
        this.head = head;
    }

    public void add(T value) {
        if (head == null) {
            head = new Nodo<>(value, null);
        } else {
            head.addNodo(value);
        }
    }

    public T get(int i) {
        if (i < 0 || i >= getSizeOfList()) {
            throw new IndexOutOfBoundsException();
        } else {
            return head.get(i);
        }
    }

    public int getSizeOfList() {
        if (head == null) {
            return 0;
        } else {
            return head.count(0);
        }

    }

    public void removeHead() {
        if (head != null) {
            head = head.getNextValue();
        }
    }

    public void removeLast() {
        if (head != null){
            if(head.getNextValue() == null){
                head = null;
            } else {
                head.removeLast();
            }
        }
    }

    public Nodo<T> getHead() {
        return head;
    }

    public void setHead(Nodo<T> head) {
        this.head = head;
    }


}
