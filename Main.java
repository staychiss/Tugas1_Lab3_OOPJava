public class Main {
    public static void main(String[] args) {
        //Penggunaan constructor overloading
        TokoKue TokoKue1 = new TokoKue();
        TokoKue TokoKue2 = new TokoKue("Tita");
        TokoKue TokoKue3 = new TokoKue("Siska", "Semprit Keju");
        TokoKue TokoKue4 = new TokoKue("Nurul", "Cookies", "Coklat");
        

        //Penggunaan method overloading
        TokoKue1.deskripsi();
        TokoKue2.deskripsi(20);
        TokoKue3.deskripsi(30);
        TokoKue4.deskripsi(40);

        // Membuat variabel baru untuk menampung nilai return dari method non-void
        double diskon = TokoKue2.diskon();
        System.out.println("Diskon yang diperoleh " + TokoKue2.pembeli + " adalah " + diskon +"%");
    }
}