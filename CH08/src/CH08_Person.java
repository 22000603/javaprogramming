
public class CH08_Person
{
    private String name;

    public CH08_Person( )
    {
        name = "No name yet";
    }

    public CH08_Person(String initialName)
    {
        name = initialName;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName( )
    {
        return name;
    }

    public void writeOutput( )
    {
        System.out.println("Name: " + name);
    }

    public boolean hasSameName(CH08_Person otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}
