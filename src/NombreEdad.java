import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NombreEdad {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Maria", 23);
        mapa.put("Jose", 30);
        mapa.put("Pepe", 18);

        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}