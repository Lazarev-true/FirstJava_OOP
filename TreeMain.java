public class TreeMain {
    public static void view(Persona root, int num){
        String line = "_".repeat(num);
        System.out.println(line + root.GetName() + " " + root.GetRelation() + " " + root.GetWife());
        for (Persona a: root.GetPersona()){
            view(a,num + 1);
        }
    }

}