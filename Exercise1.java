public class Rational {
    private int p;
    private int q;

    // construct a rational number given p and q
    public Rational(int p, int q){
        int gcd = gcd(p,q);
        this.p =p/gcd;
        this.q =q/gcd;
    }
    // compute gcd, a helper method, not part of API
    private static int gcd(int a, int b){
        int i=2;
        int max=0;
        while(i<a && i<b){
            if(a%i == 0 && b%i==0){
                if(i>max){
                    max = i;
                }
            }
            i++;
        }
        return max;
    }
    // return p/q as double value
    public double abs(){
        double a = (double) p/q;
        return a;
    }
    // negate a rational number and return as new a Rational object
    public Rational negate(){
        double a = -1.0*this.p;
        Rational r = new Rational(this.p*-1,this.q);
        return r;
    }
    // add this and b and return as a new rational number
    public Rational plus(Rational b)
    // compute this += b
    public void plusEq(Rational b)
    public Rational multiply(Rational b)
    public void multiplyEq(Rational b)
    // convert this rational number to String
    public String toString()
}
