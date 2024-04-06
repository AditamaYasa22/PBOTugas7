import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Pair<String, Integer> agePair = new Pair<>("Tama", 20);
        System.out.println("Nama: " + agePair.getKey() + ", Umur: " + agePair.getValue());
        System.out.println("");

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Minal Aidzin Wal Faidzin");
        stringSet.add("Mohon Maaf");
        stringSet.add("Lahir dan Batin");

        System.out.println("Saya Mengucapkan:");
        MyUtils.printSet(stringSet);
        System.out.println("");

        LinkedHashMap<String, String> ibuKota = new LinkedHashMap<>();
        ibuKota.put("Indonesia", "Jakarta");
        ibuKota.put("Jepang", "Tokyo");
        ibuKota.put("Korea Selatan", "Seoul");

        System.out.println("Ibu Kota:");
        for (String negara : ibuKota.keySet()) {
            System.out.println(negara + ": " + ibuKota.get(negara));
        }
    }
}

