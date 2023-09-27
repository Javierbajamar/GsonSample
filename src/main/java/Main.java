import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    //hacemos el programa

    public static void main(String[] args) {

        Persona persona = new Persona("Javier", "Perez", 20);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(persona);
        System.out.println(json);
    }


}
