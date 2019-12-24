package puntos;

/**
 * Esta clase representa dos puntos en 2D con las coordenadas x,y
 * @author Luis David De hoyos
 *
 */
public class P2 {

    //Atributos

    private int x;
    private int y;
    /**
     *  Crea una instancia del objeto P2
     */
    //constructores

    public P2(){


        this.x = this.y = 0;

    }
    /**
     *  Crea una instancia del objeto P2
     * @param x coordenada x
     * @param  y coordenada y
     */
    public P2(int x, int y){

        this.x = x;
        this.y = y;


    }

    /**
     *  Crea una instancia del objeto P2
     * @param p2 es un objeto puntos de dos dimensiones (P2)
     *
     */
    public P2(P2 p2)
    {
        this.x = p2.getX();
        this.y = p2.getY();


    }

    /**
     * el getX retorna el valor de x
     * @return
     */
    public int getX() {
        return this.x;
    }
    /**
     * Asigna el  valor de la coordenada x
     * @param x coordenada x
     */

    public int setX(int x) {
        return this.x;
    }
    /**
     * el getY retorna el valor de y
     * @return coordenada y
     */
    public int getY() {
        return this.y;
    }
    /**
     * Asigna el  valor de la coordenada y
     * @param y coordenada y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Calcula la distancia entre dos puntos
     *
     * @param x coordenada x del otro punto
     * @param y coordenada y del otro punto
     * @return distancia
     */
    public double calacularDistancia(int x, int y)
    {
        double distancia=0.0;
        double diferCuadradoX = Math.pow((this.x - x),2);
        double diferCuadradoY = Math.pow((this.y - y),2);

        distancia = Math.sqrt(diferCuadradoX + diferCuadradoY);

        return distancia;
    }
    public double calacularDistancia(P2 p2) {

        return this.calacularDistancia(p2.getX(), p2.getY());
    }

    public String toString() {
       StringBuilder sb = new StringBuilder();

       sb.append(" X: " ).append(this.x).append(" Y: ").append(this.y);


        return sb.toString();
    }
}
