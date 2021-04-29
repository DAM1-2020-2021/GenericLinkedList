package org.iesfm.listaenlazada;

import java.util.Objects;

public class Nodo<T> {

    private T value;
    private Nodo<T> nextValue;

    public Nodo(T value, Nodo<T> nextValue) {
        this.value = value;
        this.nextValue = nextValue;
    }

    public void addNodo(T value) { //Añade un valor a la Lista.
        if (nextValue == null) { //Si el siguiente valor es null, entonces nos quedamos como estamos.
            nextValue = new Nodo<>(value, null);
        } else { //Si el siguiente valor tiene un valor, se le añade con una llamada recursiva.
            nextValue.addNodo(value);
        }
    }

    public T get(int i) {  //Consigue la posicion del valor.
        if (i == 0) {
            return value;
        } else {
            return nextValue.get(i - 1);
        }

    }

    public int count(int size) { //Cuenta los valores que hay en la lista.
        if (nextValue == null) {
            return size + 1;
        } else {
            return nextValue.count(size + 1);
        }

    }

    public void removeLast() {
        if(nextValue.getNextValue() == null){
            nextValue = null;
        } else {
            getNextValue().removeLast();
        }

    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Nodo<T> getNextValue() {
        return nextValue;
    }

    public void setNextValue(Nodo<T> nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nodo<?> nodo = (Nodo<?>) o;
        return Objects.equals(value, nodo.value) && Objects.equals(nextValue, nodo.nextValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, nextValue);
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "value=" + value +
                ", nextValue=" + nextValue +
                '}';
    }



}
