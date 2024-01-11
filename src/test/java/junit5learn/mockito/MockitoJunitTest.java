package junit5learn.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

public class MockitoJunitTest {

    @Test
    void backMock(){
        List<String> list= mock(List.class);
        list.add("one");
        list.clear();

        List<String> list2= mock();
        list2.add("two");
        list2.clear();

        verify(list).add("one");
        verify(list).clear();


    }

    @Test
    void stubMethodCall(){

        LinkedList<String > linkedList= mock();
        when(linkedList.get(0)).thenReturn("Pankaj");
        Assertions.assertEquals("Pankaj",linkedList.get(0));
        Assertions.assertNull(linkedList.get(3));
    }

    @Test
    void  spyObjectTest(){
        List<String> list = new LinkedList<>();
        List<String> spiedList = spy(list);
        spiedList.add("Pankaj");
        spiedList.add("Kumar");
        when(spiedList.size()).thenReturn(100);

        Assertions.assertEquals(spiedList.get(0),"Pankaj");
        Assertions.assertEquals(spiedList.size(),100);
    }
}
