
public class BangunDatar {
    private int p; //panjang
    private int l; //lebar
    private int s; //sisi
    //Konstruktor Untuk Persegi Panjang
    
    BangunDatar(int p,int l){
        this.p = p;
        this.l = l;
    }
    //Konstruktor Bujur sangkar\
    BangunDatar (int s){
        this.s = s;
    }
    
    void setPL(int p,int l){
        this.p = p;
        this.l = l;
    }
    void setS(int s){
        this.s = s;
    }
    int getP(){
        return p;
    }
    int getL(){
        return l;
    }
    int getS(){
        return s;
    }
}