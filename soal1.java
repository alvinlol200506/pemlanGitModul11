// mengimport library library untuk list
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class soal1 {
    public static void main(String[] args) {
        // membuat list data futsal
        Integer[] tinggiA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};
        Integer[] beratA = {50, 60, 56, 55, 60, 70, 66, 56, 72, 56};
        Integer[] tinggiB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};
        Integer[] beratB = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};


        // soal a (urutkan tinggi secara ascend dan descend)
        System.out.println("soal a");
        List<Integer>listTinggiA = Arrays.asList(tinggiA); // memasukkan array tadi ke list
        List<Integer>listTinggiB = Arrays.asList(tinggiB); // ini juga

        // menggabung tinggi badan tim A dan tim B
        List<Integer> listAllTinggi = new ArrayList<>(); // buatin tempat untuk masukin semua data tinggi tim A dan tim B
        listAllTinggi.addAll(listTinggiA); // memasukkan data tinggi tim A untuk dijadikan satu
        listAllTinggi.addAll(listTinggiB); // memasukkan data tinggi tim B untuk dijadikan satu

        // diurutkan secara ascend
        Collections.sort(listAllTinggi); // mensort angka terkecil ke terbesar
        System.out.println("Urutan ascending berdasarkan tinggi badannya adalah: " + listAllTinggi);

        // diurutkan secara descending
        Collections.sort(listAllTinggi, Collections.reverseOrder()); // mensort angka terbesar ke terkecil
        System.out.println("Urutan descending berdasarkan tinggi badannya adalah: " + listAllTinggi);


        // soal b (urutkan berat secara ascend dan descend)
        System.out.println("\nsoal b");
        List<Integer>listBeratA = Arrays.asList(beratA); // masukin data array berat dari tim A
        List<Integer>listBeratB = Arrays.asList(beratB); // masukin data array berat dari tim B

        // menggabung berat badan tim A dan tim B
        List<Integer> listAllBerat = new ArrayList<>(); // bikin tempat untuk gabungin semua berat dari tim A dan tim B
        listAllTinggi.addAll(listBeratA); // masukin data berat tim A untuk digabungin
        listAllTinggi.addAll(listBeratB); // masukin data berat tim B untuk digabungin

        // diurutkan secara ascend
        Collections.sort(listAllBerat); // mengurutkan berat teringan sampai terberat dari both tim A dan tim B
        System.out.println("Urutan ascending berdasarkan berat badannya adalah: " + listAllTinggi);

        // diurutkan secara descending
        Collections.sort(listAllBerat, Collections.reverseOrder()); // mengurutkan berat terberat sampai teringan dari both tim A dan tim B
        System.out.println("Urutan descending berdasarkan berat badannya adalah: " + listAllTinggi);


        // soal c (nilai max dan min dari tinggi badan dan berat badan tim a dan b)
        // Konversi array ke List
        System.out.println("\nsoal c");
        List<Integer> collectionTinggiA = Arrays.asList(tinggiA);
        List<Integer> collectionBeratA = Arrays.asList(beratA);
        List<Integer> collectionTinggiB = Arrays.asList(tinggiB);
        List<Integer> collectionBeratB = Arrays.asList(beratB);

        // Cari max dan min untuk Tim A
        int maxTinggiA = Collections.max(collectionTinggiA);
        int minTinggiA = Collections.min(collectionTinggiA);
        int maxBeratA = Collections.max(collectionBeratA);
        int minBeratA = Collections.min(collectionBeratA);

        // Cari max dan min untuk Tim B
        int maxTinggiB = Collections.max(collectionTinggiB);
        int minTinggiB = Collections.min(collectionTinggiB);
        int maxBeratB = Collections.max(collectionBeratB);
        int minBeratB = Collections.min(collectionBeratB);

        // Output hasil
        System.out.println("Tim A:");
        System.out.println("Tinggi Badan Maksimum: " + maxTinggiA);
        System.out.println("Tinggi Badan Minimum: " + minTinggiA);
        System.out.println("Berat Badan Maksimum: " + maxBeratA);
        System.out.println("Berat Badan Minimum: " + minBeratA);
        System.out.println("\nTim B:");
        System.out.println("Tinggi Badan Maksimum: " + maxTinggiB);
        System.out.println("Tinggi Badan Minimum: " + minTinggiB);
        System.out.println("Berat Badan Maksimum: " + maxBeratB);
        System.out.println("Berat Badan Minimum: " + minBeratB);


        // soal d (Copy seluruh anggota Tim B ke Tim C yang baru dibentuk)
        System.out.println("\nsoal d");
        Integer[] tinggiC = new Integer[10]; // menyiapkan tempat untuk dimasukin tim B
        Integer[] beratC = new Integer[10]; // ini juga

        List<Integer>listTinggiC = Arrays.asList(tinggiC); // jadikan list biar bisa dimasukin data tim B
        List<Integer>listBeratC = Arrays.asList(beratC); // ini juga

        Collections.copy(listTinggiC, listTinggiB); // masukin data tinggi tim B ke tim C
        Collections.copy(listBeratC, listBeratB); // masukin data berat tim B ke tim C

        System.out.println("Isi tinggi badan tim C yang baru dibentuk adalah: " + listTinggiC); //  ngeprint data isi tim C
        System.out.println("Isi berat badan tim C yang baru dibentuk adalah: " + listBeratC);
        System.out.println("yang sama seperti isi tim B yaitu:");
        System.out.println(listTinggiB); // nunjukin kalau data tim B sama C sama menunjukkan kalau data tim B berhasil dicopy ke tim C
        System.out.println(listBeratB);
    }
}
