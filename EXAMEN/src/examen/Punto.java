package examen;

public class Punto {
    // creamos los atributos
    private double cx;
    private double cy;
    
    // creamos los constructores
    public Punto(){
        this.cx=0.0;
        this.cy=0.0;
    }
    
    public Punto(double x, double y){
        this.cx=x;
        this.cy=y;
    }
    
    // creamos los get y set para cada atributo

    public double getCx() {
        return cx;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    @Override
    public String toString() {
        return "( " + this.cx + " , " + this.cy + " )";
    }
    
    // creamos los métodos
    public double Pendiente(Punto p1, Punto p2){
        double m;
        if( p1.getCx()==p2.getCx() ) {
            return 0;
        }else{
            m = (p2.getCy() - p1.getCy() ) / ( p2.getCx() - p1.getCx() );
            return m;
        }
    }
    
    
}
