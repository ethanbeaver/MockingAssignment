// Based on Code in the TDD Book
public interface PersonDao
{
    public Person fetchPerson( Integer personID );
    public void update( Person person );
}