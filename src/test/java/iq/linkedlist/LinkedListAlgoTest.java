package iq.linkedlist;

import iq.model.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListAlgoTest {
    @Test
    public void addData(){
        LinkedListAlgo listAlgo = new LinkedListAlgo();
        listAlgo.add(20);
        listAlgo.add(24);
        listAlgo.add(2);
        listAlgo.add(30);
        listAlgo.print();
        System.out.println("listAlgo = " + listAlgo.size());
        Assertions.assertEquals(2,listAlgo.findNthNodeFromLast(2));
    }

}