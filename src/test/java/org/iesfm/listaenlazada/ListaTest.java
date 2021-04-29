package org.iesfm.listaenlazada;

import org.junit.Assert;
import org.junit.Test;

public class ListaTest {


    @Test
    public void ListaTest(){
        Lista<String> lista = new Lista<>();

        lista.add("Hallo");

        Assert.assertEquals("Hallo", lista.getHead().getValue());
    }

    @Test
    public void addNotEmptyTest(){
        Lista<String> lista = new Lista<>(new Nodo<>("Hallo", null));

        lista.add("Auf Wiedersen");

        Assert.assertEquals("Auf Wiedersen",lista.getHead().getNextValue().getValue());
    }

    @Test
    public void getHeadTest(){

        Lista<String> lista = new Lista<>(new Nodo<>("Hallo", null));

        Assert.assertEquals("Hallo", lista.get(0));
    }

    @Test
    public void getLastTest(){
        Lista<String> lista = new Lista<>(new Nodo<>("Hallo", new Nodo<>("Auf Wiedersen", null)));

        Assert.assertEquals("Auf Wiedersen", lista.get(1));
    }

    @Test
    public void removeHeadTest(){
        Lista<String> lista = new Lista<>(new Nodo<>("Hallo", new Nodo<>("Auf Wiedersen", null)));

        lista.removeHead();

        Assert.assertEquals("Auf Wiedersen", lista.getHead().getValue());
        Assert.assertEquals(1,lista.getSizeOfList());
    }

    @Test
    public void removeHeadButNoNextValuesTest(){
        Lista<String> lista = new Lista<>(new Nodo<>("Hallo", null));

        lista.removeHead();

        Assert.assertNull(lista.getHead());
    }

    @Test
    public void removeLastTest(){
        Lista<String> lista = new Lista<>(new Nodo<>("Hallo", new Nodo<>("Auf Wiedersen", null)));

        lista.removeLast();

        Assert.assertEquals("Hallo", lista.getHead().getValue());
        Assert.assertEquals(1, lista.getSizeOfList());
    }

    @Test
    public void removeLastSingleElementTest(){
        Lista<String> lista = new Lista<>(new Nodo<>("Hallo", null));

        lista.removeLast();

        Assert.assertNull(lista.getHead());
        Assert.assertEquals(0,lista.getSizeOfList());
    }
}
