
package modul3;


public class Buku{
    String judul,penulis, publisher, kategori;
    int stock, tahun;
    
    //constructor
    public Buku(String judul, String penulis, String publisher, String eror, int stock, int tahun){
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stock = stock;
        this.tahun = tahun;
    }

    Buku(String judul, String penulis, String publisher, String eror) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void display(){
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Penulis\t\t: " + penulis);
        System.out.println("Publisher\t: " + publisher);
        System.out.println("Kategori\t: " + kategori);
        System.out.println("Stock\t\t: " + stock);
        System.out.println("Tahun\t\t: " + tahun);
        System.out.println("\n");
    }
}

class BukuAnak extends Buku{
    //constractor
    public BukuAnak(String judul, String penulis, String publisher, int stock, int tahun){
        super(judul, penulis, publisher,"A", stock, tahun);
    }

}

class BukuRemaja extends Buku{
    public BukuRemaja(String judul, String penulis, String publisher, int stock, int tahun){
        super(judul, penulis, publisher, "R", stock, tahun);
    }

}

class BukuDewasa extends Buku{
    public BukuDewasa(String judul, String penulis, String publisher, int stock, int tahun){
        super(judul, penulis, publisher, "D", stock, tahun);
    }

}

class BukuSemuaUmur extends Buku{
    public BukuSemuaUmur(String judul, String penulis, String publisher, int stock, int tahun){
        super(judul, penulis, publisher, "SU", stock, tahun);
    }

}





