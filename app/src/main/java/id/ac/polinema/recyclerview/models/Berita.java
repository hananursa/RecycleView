package id.ac.polinema.recyclerview.models;

public class Berita {
    public String judul;
    public String kategori;
    public String image;

    public Berita(String judul, String kategori, String image) {
        this.judul = judul;
        this.kategori = kategori;
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
