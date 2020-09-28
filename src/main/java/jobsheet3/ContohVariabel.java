package jobsheet3;

public class ContohVariabel {
    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;
        short huruf = (byte)'A';
        System.out.println(huruf);
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));

        System.out.println(String.format("Saya %s bapak dan ibu saya setulus hati",'\u2764'));
        System.out.println(String.format("Simbol %s untuk copyright",'\u00A9'));
        System.out.println(String.format("Simbol %s untuk trademark",'\u2122'));
        System.out.println(String.format("Simbol %s untuk register",'\u00AE'));
    }
}
