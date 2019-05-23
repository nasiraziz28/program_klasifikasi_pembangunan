
package fuzzy;

/**
 *
 * @author nasier
 */
public class hitung {
//menuhitung a = new menuhitung();   

    //drajat keanggotaan untuk tahun low
    public double tahun_low (double tahun){
        double x = 0;
        if      (tahun <= 2778071.00)                   {x=1;}
        else if ((tahun >= 2778071.00)&&(tahun <= 215983054.50))  {x=(215983054.50 - tahun)/213204983.49;}
        else                                    {x = 0;}
        return x;
    }
    
    public double tahun_high (double tahun){
        //drajat keanggotaan untuk tahun high
        double x = 0;
        if     (tahun <= 2778071.00)                  {x=0;}
        else if((2778071.00 <= tahun)&&(tahun <= 215983054.50)) {x=(tahun-2778071.00)/213204983.49;}
        else                                  {x=1;}
        return x;
    }
    
    //drajat keanggotaan untuk tahun_n_low
    public double tahun_n_low (double tahun_n){
        double x = 0;
        if      (tahun_n <= 2624236.79)                               {x=1;}
        else if ((tahun_n >= 2624236.79)&&(tahun_n <= 205967480.87))  {x=(205967480.87 - tahun_n)/203343244.077;}
        else                                        {x = 0;}
        return x;
    }
    
    public double tahun_n_high (double tahun_n){
        //drajat keanggotaan untuk tahun_n_high
        double x = 0;
        if     (tahun_n <= 2624236.79)                              {x=0;}
        else if((2624236.79 <= tahun_n)&&(tahun_n <= 205967480.87)) {x=(tahun_n-2624236.79)/203343244.077;}
        else                                                        {x=1;}
        return x;
    }
    
    public double rd_low (double rd){
        double x = 0;
        if      (rd <= 0.08)                 {x=1;}
        else if ((rd >= 0.08)&&(rd <= 7.79)) {x=(7.79 - rd)/7.71;}
        else                                 {x = 0;}
        return x;
    }
    
    public double rd_high (double rd){
        //drajat keanggotaan untuk rd high
        double x = 0;
        if     (rd <= 0.08)                 {x=0;}
        else if((0.08 <= rd)&&(rd <= 7.79)) {x=(rd-0.08)/7.71;}
        else                                {x=1;}
        return x;
    }
    
     public double rc_low (double rc){
        double x = 0;
        if      (rc <= 0.22)                   {x=1;}
        else if ((rc >= 0.22)&&(rc <= 17.00))  {x=(17.00 - rc)/16.78;}
        else                                   {x = 0;}
        return x;
    }
    
    public double rc_high (double rc){
        //drajat keanggotaan untuk rc high
        double x = 0;
        if     (rc <= 0.22)                  {x=0;}
        else if((0.22 <= rc)&&(rc <= 17.00)) {x=(rc-0.22)/16.78;}
        else                                 {x=1;}
        return x;
    }
    
}
