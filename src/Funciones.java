public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Área de un círculo
        //pi * r2

        circleArea(y);

        //Área de una esfera
        //4*Pi*r2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)*pi * r3
        sphereVolumen(y);

        System.out.println(" PESOS A DOLARES : " + converToDolar(100, "COP")) ;
    }

    public static double circleArea (double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4* Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r) {
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Declaración: Función que especifica su moeda convierte a una cantidad de dineto a dólares
     *
     * @param quantity Cantida de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dólares
     **/

    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }


}
