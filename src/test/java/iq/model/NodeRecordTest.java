package iq.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeRecordTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void nodeModelTest(){
        NodeRecord nodeRecord1 = new NodeRecord(1);
        NodeRecord node2 = new NodeRecord(4, nodeRecord1);
        assertEquals(1,  nodeRecord1.data());
        assertNull(nodeRecord1.next());
        assertEquals(4,node2.data());
        assertNotNull(node2.next());
    }
}