package puntos;

/**
 * Esta clase representa dos puntos en 3D con las coordenadas x,y,z
 * @author Luis David De hoyos
 *
 */
public class P3 extends P2 {
    //atributos
    private int z;

    /**
     * Construye un objeto de tipo P3
     *
     *
      */
    public P3(){
        //el super debe se lo primero al invocarlo
        super();
        this.z = 0;
    }

    /**
     * Crear un objeto de tipo p3
     * @param x coordenada X
     * @param y coordenada Y
     * @param z coordenada Z
     */
    public P3(int x,int y, int z){
        super(x, y);
        this.z =z;

    }
    /**
     *  Crear un objeto de tipo p3
     * @param p2  objeto de tipo P2
     * @param z coordenada z
     *
     */
    public P3(P2 p2, int z)
    {
        super(p2);
        this.z =z;
    }

    /**
     * Crea un objeto de tipo p3
     * @param p3 un objeto de 3 coordenada
     */

    public P3(P3 p3){

        this(p3.getX(), p3.getY(), p3.getZ());

    }

    /**
     * retorna coordenada z
     * @return coordenada z
     */
     public int getZ(){



        return this.z;
     }

    /**
     * asigna un valor a la coordenada z
     * @param z
     */
    public void setZ(int z) {
        this.z = z;
    }

    /**
     * Calcular la distancia entre dos puntos 3D
     * @param x coordenada X del otro punto
     * @param y coordenada Y del otro punto
     * @param z coordenada Z del otro punto
     * @return distancia
     */
    public double calcularDistancia(int x, int y, int z){

        double distancia=0.0;
        double diferCuadradoX = Math.pow((getX() - x),2);
        double diferCuadradoY = Math.pow((getY() - y),2);
        double diferCuadradoZ = Math.pow((this.z - z),2);

        distancia = Math.sqrt(diferCuadradoX + diferCuadradoY +diferCuadradoZ);

        return distancia;


    }

    /**
     * Calcular la distancia entre dos puntos en 3D
     * @param p2 Objeto de tipo p2
     * @param z Coordenada z
     * @return distancia
     */

    public double calacularDistancia(P2 p2, int z) {

        return  calcularDistancia(p2.getX(), p2.getY(), z);
    }
    /**
     * Calcular  la distancia entre dos puntos en 3D
     * @param p3 obbjeto de tipo P3
     * @return distancia
     *
     */

    public double calacularDistancia(P3 p3) {
        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ());
    }


    public String toString() {
        return super.toString() + " Z: " + this.z;
    }

}
