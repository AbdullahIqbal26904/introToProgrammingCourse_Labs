public class point {
        private double x;
        private double y;

        public point(double x1, double y1){
            x = x1;
            y= y1;
        }
    public double getY(){
        return y;
    }
    public double getx(){
        return x;
    }
        public double distanceTo(point q){
            double distance = Math.sqrt((q.x-x)*(q.x-x)+(q.y-y)*(q.y-y));
            return distance;
        }
        public int quadrant(point s){
            if(s.x>0 && s.y>0) return 1;
            if(s.x<0 && s.y>0) return 2;
            if(s.x<0 && s.y<0) return 3;
            else return 4;
        }
        public void flip(point i){
            double temp = i.y;
            i.y = i.x;
            i.x = temp;
        }


}
