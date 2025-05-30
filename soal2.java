import java.util.*;

public class soal2 {
    public static void main(String[] args) {
        // menyiapkan array data tim A dan tim B
        Integer[] tinggiA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};
        Integer[] beratA = {50, 60, 56, 55, 60, 70, 66, 56, 72, 56};
        Integer[] tinggiB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};
        Integer[] beratB = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};

        // soal a (Implementasikan ArrayList untuk menyimpan data tim A dan tim B dalam bentuk ArrayList terpisah.)
        // Konversi ke ArrayList terpisah
        ArrayList<Integer> listTinggiA = new ArrayList<>(Arrays.asList(tinggiA));
        ArrayList<Integer> listBeratA = new ArrayList<>(Arrays.asList(beratA));
        ArrayList<Integer> listTinggiB = new ArrayList<>(Arrays.asList(tinggiB));
        ArrayList<Integer> listBeratB = new ArrayList<>(Arrays.asList(beratB));

        // soal b (Dari data tim B, dicari jumlah pemain yang mempunyai tinggi badan 168 cm dan 160 cm)
        System.out.println("soal b");
        long countTinggiTimB = listTinggiB.stream().filter(tinggi -> tinggi == 168 || tinggi == 160).count();
        System.out.println("Jumlah pemain yang memiliki tinggi badan 160cm dan 168cm di tim B ada " + countTinggiTimB + " orang");

        // soal c (Dari data tim A, dicari jumlah pemain yang mempunyai berat badan 56 kg dan 53 kg)
        System.out.println("\nsoal c");
        long countBeratTimA = listBeratA.stream().filter(berat -> berat == 56 || berat == 53).count();
        System.out.println("Jumlah pemain yang memiliki berat badan 56 kg dan 53 kg di tim A ada " + countBeratTimA + " orang");

        // soal d (Ingin diketahui apakah pemain di Tim A ada yang mempunyai tinggi badan atau berat badan yang sama dengan pemain di Tim B)
        System.out.println("\nsoal d");
        // Gunakan Set untuk mencari elemen yang sama
        Set<Integer> setTinggiA = new HashSet<>(listTinggiA);
        Set<Integer> setTinggiB = new HashSet<>(listTinggiB);
        Set<Integer> setBeratA = new HashSet<>(listBeratA);
        Set<Integer> setBeratB = new HashSet<>(listBeratB);

        // Cari irisan (intersection) untuk tinggi
        Set<Integer> tinggiSama = new HashSet<>(setTinggiA);
        tinggiSama.retainAll(setTinggiB);

        // Cari irisan (intersection) untuk berat
        Set<Integer> beratSama = new HashSet<>(setBeratA);
        beratSama.retainAll(setBeratB);

        // Hitung jumlah kemunculan tinggi yang sama di kedua tim
        int jumlahTinggiSama = 0;
        for (Integer tinggi : tinggiSama) {
            int countA = Collections.frequency(listTinggiA, tinggi);
            int countB = Collections.frequency(listTinggiB, tinggi);
            jumlahTinggiSama += Math.min(countA, countB); // Ambil frekuensi minimum
        }

        // Hitung jumlah kemunculan berat yang sama di kedua tim
        int jumlahBeratSama = 0;
        for (Integer berat : beratSama) {
            int countA = Collections.frequency(listBeratA, berat);
            int countB = Collections.frequency(listBeratB, berat);
            jumlahBeratSama += Math.min(countA, countB); // Ambil frekuensi minimum
        }

        // Output hasil
        System.out.println("Jumlah tinggi badan yang sama di Tim A dan B: " + jumlahTinggiSama);
        System.out.println("Jumlah berat badan yang sama di Tim A dan B: " + jumlahBeratSama);
    }
}

