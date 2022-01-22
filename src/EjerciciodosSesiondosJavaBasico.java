public class EjerciciodosSesiondosJavaBasico {
    public static void main(String[] args) {

        System.out.println(precioFinal(12.50f,1.21f));
    }
    public static float precioFinal(float precio, float iva) {

        return precio*iva;
    }
}
