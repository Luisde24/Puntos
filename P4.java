package puntos;
/**
 * Esta clase representa dos puntos en 4D con las coordenadas x,y,z,w
 * @author Luis David De hoyos
 *
 */
public class P4 extends P3{

    //Atributo
    private int w;
    /**
     * Construye un objeto de tipo P4
     *
     *
     */
    public P4(){
            super();
            this.w =0;

    }
    /**
     * Crear un objeto de tipo p4
     * @param x coordenada X
     * @param y coordenada Y
     * @param z coordenada Z
     * @param w coordenadas W
     */
    public P4(int x, int y, int z, int w){

        super(x,y,z);
        this.w= w;
    }
    /**
     *  Crear un objeto de tipo p4
     * @param p3  objeto de tipo P3
     * @param w coordenada w
     *
     */
    public P4(P3 p3, int w){

        super(p3);
        this.w = w;

    }
    /**
     * Crea un objeto de tipo p4
     * @param p4 un objeto de 4 coordenada
     */
    public P4(P4 p4){

        this(p4.getX(), p4.getY(), p4.getZ(), p4.getW());
    }
    /**
     * retorna coordenada w
     * @return coordenada w
     */
    public int getW() {
        return w;
    }

    /**
     * asigna un valor a la coordenada w
     * @param w
     */

    public void setW(int w){  this.w=w; }
    /**
     * Calcular la distancia entre DOS puntos 4D
     * @param x coordenada X del otro punto
     * @param y coordenada Y del otro punto
     * @param z coordenada Z del otro punto
     * @param w coordenada W del otro punto
     * @return distancia
     */

    public double calcularDistancia(int x, int y, int z, int w){

        double distancia=0.0;
        double diferCuadradoX = Math.pow((getX() - x),2);
        double diferCuadradoY = Math.pow((getY() - y),2);
        double diferCuadradoZ = Math.pow((getZ() - z),2);
        double diferCuadradoW = Math.pow((this.w - z),2);

        distancia = Math.sqrt(diferCuadradoX + diferCuadradoY +diferCuadradoZ + diferCuadradoW);


        return distancia;
    }
    /**
     * Calcular la distancia entre dos puntos en 3D
     * @param p3 Objeto de tipo p3
     * @param w Coordenada W
     * @return distancia
     */
    public double calacularDistancia(P3 p3, int w) {

        return  calcularDistancia(p3.getX(), p3.getY(), p3.getZ(), w);
    }
    /**
     * Calcular  la distancia entre dos puntos en 4D
     * @param p4 objeto de tipo P4
     * @return distancia
     *
     */
    public double calacularDistancia(P4 p4) {
        return calcularDistancia(p4.getX(), p4.getY(), p4.getZ(), p4.getW());
    }


    public String toString() {
        return  super.toString() +    " W = "  + this.w;
    }
}



