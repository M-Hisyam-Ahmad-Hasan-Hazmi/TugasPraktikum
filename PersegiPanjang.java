
public class PersegiPanjang extends BangunDatar{
    
    public PersegiPanjang(int p, int l) {
        super(p, l);
    }
    int hitungLuas (){
        int p = super.getP();
        int l = super.getL();
        return p * l;
        
    }
    int hitungKeliling(){
        int p = super.getP();
        int l = super.getL();
        
       return 2*(p+l);
    }
    
    @Override
    public String toString (){
        return "Luas Persegi panjang :" + hitungLuas() + "\n" + 
                "Keliling Persegi Panjang :" + hitungKeliling();
        
    }        
     
}

