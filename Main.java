public class Main {
    public static void main(String[] args) {

        Persona father = new Persona ("Юрий","отец", "Оксана мать");
        Persona son = new Persona("Игорь", "сын");
        Persona sister = new Persona("Мария", "дочь");
        Persona grandson = new Persona("Олег", "внук");

        father.AddPersona(son);
        father.AddPersona(sister);
        sister.AddPersona(grandson);

        TreeMain.view(father, 0);
    }
}