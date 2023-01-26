import java.util.ArrayList;

public class Persona {
    private String Name;
    private String Relation;
    private String Wife;

    public Persona(String name, String relation, String wife){
        this.Name = name;
        this.Relation = relation;
        this.Wife= wife;
    }

    public Persona(String name, String relation){
        this.Name = name;
        this.Relation = relation;
        this.Wife = "";
    }

    public String GetWife(){
        return Wife;
    }
    
    public String GetName(){
        return Name;
    }

    public String GetRelation(){
        return Relation;
    }

    ArrayList<Persona> list = new ArrayList<>();

    public void AddPersona(Persona p){
        list.add(p);

    }

    public ArrayList<Persona> GetPersona(){
        return list;
    }

}