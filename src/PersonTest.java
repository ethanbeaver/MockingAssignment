// Written by Ethan and Nick
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;

public class PersonTest {
    //    Set up Mockito Mock
    @Mock
    PersonService psMock;
    PersonDao daoMock;

    //    Tie in Mockito to JUnit
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Before
    public void setUp() {
        psMock = new PersonService(daoMock);
    }

    @Test
    public void testUpdate() {
        Person person1 = new Person(1234, "Ethan Beaver");

    }

    @Test
    public void testUpdateWhenNotFound() {
        Person person2 = new Person(1111, "Nick");

    }

}
