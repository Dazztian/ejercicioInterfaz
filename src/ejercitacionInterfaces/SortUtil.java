package ejercitacionInterfaces;

import java.util.List;

public class SortUtil {

    public static <T> Precedable<T>[] ordenar ( Precedable<T> arr[])
    {

            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j].precedeA( (T) arr[j+1] ) > 0 )
                    {
                        // swap arr[j+1] and arr[j]
                        T temp = (T) arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = (Precedable<T>) temp;
                    }
        return arr;

    }

    public static void main(String[] args) {
        Persona[] arrayDePersonas = {new Persona("pablo", 111111),
                        new Persona("carla", 2323),
                        new Persona("matias", 4234),
                        new Persona("camila", 56757),
                        new Persona("tucumano", 9999)};

        /*
        //Array sin ordenar
        for (Persona persona: arrayDePersonas)
            System.out.println( persona.dni);

        SortUtil.ordenar(arrayDePersonas);

         //Array ordenado
         for (Persona persona: arrayDePersonas)
        System.out.println( persona.dni);
         */

         Celular[] arrayDeCelulares = { new Celular( 7237626, "matuke"),
                 new Celular( 7237626, "fernando"),
                 new Celular( 34, "carla"),
                 new Celular( 3423, "pilagros"),
                 new Celular( 76767, "fede"),
                 new Celular( 000001, "lujan") };


        //Array sin ordenar
        for (Celular celular: arrayDeCelulares)
            System.out.println( celular.getNumero());

        SortUtil.ordenar(arrayDeCelulares);

        //Array ordenado
        for (Celular celular: arrayDeCelulares)
            System.out.println( celular.getNumero());
    }



}

