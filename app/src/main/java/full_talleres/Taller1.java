/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {
        
        
        }


    

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */

    public static String Convertir_km_seg(float velocidad_kilometros_segundos) {
        try {
            // se declaran las constantes y las variables del problema
            float vel_m_seg = 0;
            float vel_m_hra = 0;
            final int km_m = 1000;
            final int seg_hra = 3600;
    
            // se usan las variables y las contantes para los problemas matematicos
            vel_m_seg = velocidad_kilometros_segundos * km_m; 
            vel_m_hra = velocidad_kilometros_segundos * km_m * seg_hra;
    
            return vel_m_seg + " m/s - " + vel_m_hra + " m/h";
        } catch (Exception errException) {
            return "Error en la conversión";
        }
    }

   
    

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */

   public static float Convertir_cm_lt (double cantidad_centimetros){
    try {//se inicia con un try catch

        //se declarar las variables y las constanteel problema
        float cantidad_l = 0;
        final int litros_centimetros = 1000; 

        //se usan las variables y las contantes para los problemas matematicos
        cantidad_l = (float) (cantidad_centimetros / litros_centimetros);

        return cantidad_l; 
    } 
    
    catch (Exception erException) {
        return 0; 
    }
}


   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
   
   public static long Convertir_us_cops(int cantidad_dolares){
    try {//se inicia con un try catch

        //se declarar las variables y las constanteel problema
        long Cantidad_Pesos = 0;
        final long trm = 4170;

        //se usan las variables y las contantes para los problemas de conversion
        Cantidad_Pesos = cantidad_dolares * trm;

        return Cantidad_Pesos; 
    } 


    catch (Exception errException) {
        return -1; 
    }
}


  
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */

   public static double Convertir_cent_far(double centigrados) {
    try {//se inicia con un try catch

        //se declarar las variables y las constanteel problema
        
        double C = centigrados; 
        final double Constante1 = 32; 
        final double division = 9.0 / 5.0; 

        //se usan las variables y las constantes para la conversion
        double Fahrenheit = Constante1 + (division * C);

        return Fahrenheit;
    } 
    
    
    catch (Exception errException) {

        return 0;
    }
}

          

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
  public static int Calcular_segs(short dias, short horas, short minutos, short segundos) {
    try {//se inicia con un try catch

        //se declarar las variables y las constanteel problema
        int seg_dia = 24 * 60 * 60;
        int seg_h = 60 * 60;
        int seg_min= 60;

        //se usan las variables y las constantes para el calculo

        int total_seg = dias * seg_dia + horas * seg_h + minutos * seg_min + segundos;

        return total_seg;
    } 
    
    
    catch (Exception errException) {
    
        return -1;
    }
}
   

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

   public static String Calcular_peso_carga(float peso_total, float peso_vacio) {
    try {//se inicia con un try catch

        //se declarar las variables y las constanteel problema
        
        final int ton_kl = 1000;
        float Peso_nt = peso_total - peso_vacio;
        float Peso_nt_kl = Peso_nt * ton_kl;
        float Peso_nt_ton = Peso_nt;

        String resultado = (Peso_nt_kl + " kilos - " + Peso_nt_ton + " toneladas");

        return resultado;
    } 
    
    
    catch (Exception errException) {
        return "Error en la función Calcular_peso_carga";
    }
}
   

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */

   public static float Calcular_horasxviaje(String destino, short distancia, short velocidad) {
    try {//se inicia con un try catch

        //se declarar las variables y las constanteel problema
    
        float tpo_viaje = 0;

        //se usan las variables y las constantes para el calculo
        tpo_viaje = (float) distancia / velocidad;

        return (float) (int) tpo_viaje;

    } 
    
    
    catch (Exception errException) {
        
        return -1;
    }
}

  
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/

   public static float Calcular_combustible(int ruta1, int ruta2, int ruta3, int ruta4) {
    try {//se inicia con un try catch

        //se declarar las variables y las constanteel problema
        float aterrizaje = (float) 0.4;
        float km = (float) (0.2 / 60.8);
        float despegue = (float) 1.2; 
        int cantidad_rutas =4;
        

        //se calcula el combustible total para cada una de las ruta
        float despg_atrrza= (despegue + aterrizaje)*cantidad_rutas;
        float ruta_1 = (float) (ruta1 * km);
        float ruta_2 = (float) (ruta2 * km);
        float ruta_3 = (float) (ruta3 * km);
        float ruta_4 = (float) (ruta4 * km);

        //se calcula el combustible total
        float total = ruta_1 + ruta_2 + ruta_3 + ruta_4 + despg_atrrza;

        return total;

    } 
    
    catch (Exception errException) {
        return -1;
    }
}

   
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */

   public static String Calcular_peso_luna(byte peso_kilos) { 
    
    try { // Declarar variables y constantes 
        double gravedad_tierra = 9.81; 
        double factor_luna = 0.165;

    // Calcular el peso en la Tierra
    
    double peso_tierra_ = peso_kilos * gravedad_tierra;

    // Calcular el peso 
    double peso_luna_nuevo = peso_tierra_ * factor_luna;

    // Formatear el resultado con 11 decimales
    String resultado = String.format("%.11f", peso_luna_nuevo);

    return resultado;
} catch (Exception e) {
    
    return "0";
}
   
   
}
}
