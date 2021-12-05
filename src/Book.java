
public class Book {
    
    private String kitapAdi;
    private String yazar;
    private String tur;
    private String sayfaSayisi;
    private String kitapId;

    public Book(String kitapAdi, String yazar, String tur, String sayfaSayisi, String kitapId) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.tur = tur;
        this.sayfaSayisi = sayfaSayisi;
        this.kitapId = kitapId;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(String sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getKitapId() {
        return kitapId;
    }

    public void setKitapId(String kitapId) {
        this.kitapId = kitapId;
    }
    
}
