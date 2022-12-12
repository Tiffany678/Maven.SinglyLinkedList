package com.zipcodewilmington.singlylinkedlist;

import org.junit.jupiter.api.Test;

import javax.xml.soap.Node;

import java.util.LinkedList;

import static com.ibm.cuda.CudaError.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
   @Test
    public void testAdd(){
        //Give
      SinglyLinkedList singleNode = new SinglyLinkedList();
      singleNode.add(1);

       assertEquals(1,singleNode.size() );
    }
    @Test
    public void testRemove(){
        //Give
        SinglyLinkedList singleNode = new SinglyLinkedList();
        singleNode.add(1);
        singleNode.add(3);
        singleNode.remove(1);

        assertEquals(1,singleNode.size() );
    }
    @Test
    public void testContain(){
        //Give
        SinglyLinkedList singleNode = new SinglyLinkedList();
        singleNode.add(1);
        singleNode.add(3);
       // singleNode.remove(1);

        assertEquals(true,singleNode.contain(3) );
    }
}
