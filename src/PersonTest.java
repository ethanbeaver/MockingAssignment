// Written by Ethan and Nick
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

public class PersonTest {
    //    Set up Mockito Mock Objects
    @Mock
    private PersonService psMock;
    private PersonDao daoMock;

    @Before
    public void setUp() {
        daoMock = mock(PersonDao.class);
        psMock = new PersonService(daoMock);
    }

    @Test
    public void testUpdate() {
        Person person1 = new Person(1234, "Ethan Beaver");
//        Mock DAO methods
        when(daoMock.fetchPerson(1234)).thenReturn(person1);
        doNothing().when(daoMock).update(any());

//        Assert the unit test passes
        assertTrue(psMock.update(1234,"Ethan"));

//        Verify that each mocked method was called once
        verify(daoMock).fetchPerson(1234);
        verify(daoMock).update(any());
    }

    @Test
    public void testUpdateWhenNotFound() {
//        Mock DAO methods
        when(daoMock.fetchPerson(1111)).thenReturn(null);

//       Assert the unit test passes
        assertFalse(psMock.update(1111, "Phil"));

//       Verify that the mocked method was called once
        verify(daoMock, atLeast(1)).fetchPerson(1111);
    }

}
