package Practica;

import java.util.Arrays;

public class OrdenamientoNotas {
    static void main() {
        Estudent[] Estudents=new Estudent[5];

        Estudents[0] = new Estudent();
        Estudents[1] = new Estudent("Roberto", 18);
        Estudents[2] = new Estudent("Jonathan", 17);
        Estudents[3] = new Estudent("Derlis", 17);
        Estudents[4] = new Estudent("Camila", 14);

        Arrays.sort(Estudents);

        for (int i=0;i< Estudents.length;i++){
            System.out.println(Estudents[i].toString());
        }

    }

}

