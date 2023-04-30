public class TokoKue {
    String pembeli;
    private String kue;
    private String bahanutama;
    int banyakkue;

    public String getPembeli(){
        return pembeli;
    }

    public void setPembeli (String pembeli){
        this.pembeli = pembeli;
    }

    public TokoKue(){
        this ("Nina", "Kue Nanas", "Nanas", 1);
    }

    public TokoKue(String pembeli){
        this (pembeli, "Kue Nanas", "Nanas", 2);
    }

    public TokoKue(String pembeli, String kue){
        this (pembeli, kue, "Keju", 3);
    }

    public TokoKue(String pembeli, String kue, String bahanutama){
        this (pembeli, kue, bahanutama , 4);
    }

    public TokoKue(String pembeli, String kue, String bahanutama, int banyakkue){
        this.pembeli = pembeli;
        this.kue = kue;
        this.bahanutama = bahanutama;
        this.banyakkue = banyakkue;
    }

    public void deskripsi(){
        System.out.println ("Nama Pembeli : " + pembeli);
        System.out.println ("Nama Kue : " + kue);
        System.out.println ("Bahan Utama : " + bahanutama);
        System.out.println ("Banyak Kue : " + banyakkue + " toples");
        System.out.println("");
    }

    public void deskripsi(int harga){
        System.out.println ("Nama Pembeli : " + pembeli);
        System.out.println ("Nama Kue : " + kue);
        System.out.println ("Bahan Utama : " + bahanutama);
        System.out.println ("Banyak Kue : " + banyakkue + " toples");
        System.out.println ("Harga Kue : " + harga + " rupiah");
        System.out.println("");
    }

    public double diskon(){
        return banyakkue*0.1;
    }
}