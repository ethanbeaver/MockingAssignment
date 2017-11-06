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

    //    Tie in Mockito to JUnit
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testTest() {
        Person me = new Person(1234, "Ethan Beaver");
//        Add tests here
    }

}
