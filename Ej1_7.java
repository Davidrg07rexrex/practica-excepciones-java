public class Ej1_7 {

    //Ejemplo 1: salirte del limite de la lista
    public void falloArray() {
        int[] anArray = new int[3]; //creamos lista de 3 huecos
        System.out.println(anArray[3]); //falla porque los huecos son 0,1,2
    }

    //Ejemplo 2: usar algo que esta vacio
    public void falloNulo() {
        String[] strs = new String[3]; //array vacio
        System.out.println(strs[0].length()); //peta pq no hay na q medir (nulo)
    }

    //Ejemplo 3: formato de numero mal puesto
    public void falloNumero() {
        Integer.parseInt("abc"); //falla pq abc no son numeros
    }

    //Ejemplo 4: intentar cambiar el tipo a lo bruto
    public void falloCasteo() {
        Object o = new Object(); //creamos un objeto cualquiera
        Integer i = (Integer)o; //falla pq no son compatibles
    }
}