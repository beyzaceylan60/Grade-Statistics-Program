import java.util.Scanner;
class DersIstatistik{
    private int notAA;
    private int notBA;
    private int notBB;
    private int notCB;
    private int notCC;
    private int notCD;
    private int notDD;
    public Scanner keyboard = new Scanner(System.in);
    private int toplamOgrenciSayisi=0;

    public int getNotAA() {
        return notAA;
    }

    public int getNotBA() {
        return notBA;
    }

    public int getNotBB() {
        return notBB;
    }

    public int getNotCB() {
        return notCB;
    }

    public int getNotCC() {
        return notCC;
    }

    public int getNotCD() {
        return notCD;
    }

    public int getNotDD() {
        return notDD;
    }

    public int getToplamOgrenciSayisi() {
        return toplamOgrenciSayisi;
    }

    public void setNotAA(int notAA) {
        this.notAA = notAA;
    }

    public void setNotBA(int notBA) {
        this.notBA = notBA;
    }

    public void setNotBB(int notBB) {
        this.notBB = notBB;
    }

    public void setNotCB(int notCB) {
        this.notCB = notCB;
    }

    public void setNotCC(int notCC) {
        this.notCC = notCC;
    }

    public void setNotCD(int notCD) {
        this.notCD = notCD;
    }

    public void setNotDD(int notDD) {
        this.notDD = notDD;
    }

    public void setToplamOgrenciSayisi(DersIstatistik dersIstatistik) {
        this.toplamOgrenciSayisi = dersIstatistik.getNotAA()+ dersIstatistik.getNotBA()+dersIstatistik.getNotBB()+ dersIstatistik.getNotCB()
                +dersIstatistik.notCC+ dersIstatistik.getNotCD()+ dersIstatistik.getNotDD();
    }
    public void baslikyazdir(){
        System.out.println("""
                ****************************************
                *** DERS NOTLARI İSTATİSTİK PROGRAMI ***
                ****************************************""");
    }
    public void menuYazdir(){
        System.out.println("""
                MENÜ:
                (1) Her bir harfli başarı notu için öğrenci sayısı gir
                (2) Metinsel istatistik yazdır
                (3) Grafiksel istatistik yazdır
                (4) Tüm verileri sıfırla
                (5) Programı sonlandır
                """);
    }
    public void notSayisiGir(){
        System.out.println("AA alan öğrenci sayısını giriniz:");
        setNotAA(keyboard.nextInt());
        System.out.println("BA alan öğrenci sayısını giriniz:");
        setNotBA(keyboard.nextInt());
        System.out.println("BB alan öğrenci sayısını giriniz:");
        setNotBB(keyboard.nextInt());
        System.out.println("CB alan öğrenci sayısını giriniz:");
        setNotCB(keyboard.nextInt());
        System.out.println("CC alan öğrenci sayısını giriniz:");
        setNotCC(keyboard.nextInt());
        System.out.println("CD alan öğrenci sayısını giriniz:");
        setNotCD(keyboard.nextInt());
        System.out.println("DD alan öğrenci sayısını giriniz:");
        setNotDD(keyboard.nextInt());
        setToplamOgrenciSayisi(this);
    }
    public void metinselIstatistikYazdir(){
        if(getToplamOgrenciSayisi() ==0){
            System.out.println("UYARI: Harfli başarı notları için henüz sayısal veriler girilmemiştir!");
        }
        else {
            System.out.printf("AA: %.2f\n" ,(100.0*getNotAA()/getToplamOgrenciSayisi()));
            System.out.printf("BA: %.2f\n" ,(100.0*getNotBA()/getToplamOgrenciSayisi()));
            System.out.printf("BB: %.2f\n" ,(100.0*getNotBB()/getToplamOgrenciSayisi()));
            System.out.printf("CB: %.2f\n" ,(100.0*getNotCB()/getToplamOgrenciSayisi()));
            System.out.printf("CC: %.2f\n" ,(100.0*getNotCC()/getToplamOgrenciSayisi()));
            System.out.printf("CD: %.2f\n" ,(100.0*getNotCD()/getToplamOgrenciSayisi()));
            System.out.printf("DD: %.2f\n" ,(100.0*getNotDD()/getToplamOgrenciSayisi()));
        }
    }
    public String yildizHesapla(int yuzdelik){
        String yildizSayisi = "*";
        while(yuzdelik>0){
            yildizSayisi= (yildizSayisi + "*");
            yuzdelik = yuzdelik-2;
        }
        return yildizSayisi;
    }
    public void grafikselIstatistikYazdir(){
        if(getToplamOgrenciSayisi() ==0){
            System.out.println("UYARI: Harfli başarı notları için henüz sayısal veriler girilmemiştir!");
        }
        else{
        System.out.println("""
                  .
                      0   10   20   30   40   50   60   70   80   90   100
                      |    |    |    |    |    |    |    |    |    |    |
                      ***************************************************""");
        System.out.println("AA: "+ yildizHesapla(100*getNotAA()/getToplamOgrenciSayisi()));
        System.out.println("AB: "+ yildizHesapla(100*getNotBA()/getToplamOgrenciSayisi()));
        System.out.println("BB: "+ yildizHesapla(100*getNotBB()/getToplamOgrenciSayisi()));
        System.out.println("CB: "+ yildizHesapla(100*getNotCB()/getToplamOgrenciSayisi()));
        System.out.println("CC: "+ yildizHesapla(100*getNotCC()/getToplamOgrenciSayisi()));
        System.out.println("CD: "+ yildizHesapla(100*getNotCD()/getToplamOgrenciSayisi()));
        System.out.println("DD: "+ yildizHesapla(100*getNotDD()/getToplamOgrenciSayisi()));
        }
    }
    public void verileriSifirla(){
        setNotAA(0);
        setNotBA(0);
        setNotBB(0);
        setNotCB(0);
        setNotCC(0);
        setNotCD(0);
        setNotDD(0);
        setToplamOgrenciSayisi(this);
    }
    public DersIstatistik(int AA,int BA, int BB,int CB,int CC, int CD, int DD){
        setNotAA(AA);
        setNotBA(BA);
        setNotBB(BB);
        setNotCB(CB);
        setNotCC(CC);
        setNotCD(CD);
        setNotDD(DD);
        setToplamOgrenciSayisi(this);
    }
}
public class Main {

    public static void main(String[] args) {
        DersIstatistik dersIstatistik = new DersIstatistik(10,10,0,0,0,0,0);
        int tercih;
        dersIstatistik.baslikyazdir();
        while(true){
            dersIstatistik.menuYazdir();
            tercih = dersIstatistik.keyboard.nextInt();
            if (tercih ==1){
                dersIstatistik.notSayisiGir();
            }
            else if (tercih == 2){
                dersIstatistik.metinselIstatistikYazdir();
            }
            else if (tercih == 3){
                dersIstatistik.grafikselIstatistikYazdir();
            }
            else if (tercih == 4){
                dersIstatistik.verileriSifirla();
            }
            else if (tercih == 5){
                System.exit(0);
            }
        }
    }
}