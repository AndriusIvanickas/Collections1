import java.util.*;

public class Department
{
    private String name;
    private Library library;
    private List<Edition> editions = new ArrayList<>();
    public Department(){}
    public Department(String name)
    {
        this.name = name;

    }
    public String getName()
    {
        return name;
    }
    public void setName (String name)
    {
        this.name = name;
    }

    public List<Edition> getEditions() {
        return editions;
    }

    public Library getLibrary()
    {
        return library;
    }

    public void addEdition(Edition element)
    {
       editions.add(element);
    }

    public void removeEdition(Edition element)
    {
        editions= new LinkedList<>(editions);
        editions.remove(element);

    }



    public String toString()
    {
        return "Department name: "+name;
    }
    public void sort()
    {
        Collections.sort(editions);
    }


}


