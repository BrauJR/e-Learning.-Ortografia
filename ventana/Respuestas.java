package ventana;


import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
        "1", "2", "3", "4"
    };

    String[] radioR = {
        "1,2,3,4",
        "1,2,3,4",
        "1,2,3,4",
        "1,2,3,4",};

    public String getRespuesta(int posicion) {
        return respuestas[posicion];
    }

    public String[] separar(String cadena, String separador) {
        StringTokenizer token = new StringTokenizer(cadena, separador);
        String[] a = new String[4];
        int i = 0;

        while (token.hasMoreTokens()) {
            a[i] = token.nextToken();
            i++;
        }
        return a;
    }
public String [] setRespuestas (int posicion) {
    String s1 = radioR [posicion];
    String [] s2 = separar (s1, ",");
    return s2;
}
}
