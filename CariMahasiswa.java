public class CariMahasiswa {
    public static void main(String[] args) {

        String[] nim = {"20250101", "20250102", "20250103", "20250104", "20250105"};
        String[] nama = {"Lamdan", "Musa", "Ikiw", "Yogi", "Ahmed"};

        String cariNama = "Yogi";
        int posisi = -1;
        int langkah = 0;

        for (int i = 0; i < nama.length; i++) {
            langkah++; // menghitung jumlah perbandingan
            if (nama[i].equalsIgnoreCase(cariNama)) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Mahasiswa ditemukan");
            System.out.println("Nama  : " + nama[posisi]);
            System.out.println("NIM   : " + nim[posisi]);
            System.out.println("Indeks: " + posisi);
        } else {
            System.out.println("Mahasiswa tidak ditemukan");
        }

        System.out.println("Jumlah perbandingan pencarian: " + langkah);
    }
}
