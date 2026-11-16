package galaxy.training.sessions.session04.jfc.set;

import java.util.HashSet;

public class SetPractice {
    static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        HashSet<String> featuresHasSet = new HashSet<>();

        countries.add("España");
        countries.add("Venezuela");
        countries.add("Colombia");

        System.out.println(countries);

        featuresHasSet.add("No permite duplicados");
        featuresHasSet.add("Optimiza la búsqueda");

        System.out.println(featuresHasSet);
    }
}
