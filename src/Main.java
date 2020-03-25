import java.util.ArrayList;
import java.util.prefs.Preferences;

public class Main {
    public static void main(String[] args) {

        /*GenericArray<String> list = new GenericArray<String>();
        list.add("uno");
        list.add("dos");
        list.add("tres");

        for(String str : list.getList()){
            System.out.println(str);
        }

        if(list.exist("cuatro")){
            System.out.println("sipiriri");
        }

        GenericArray<Integer> list2 = new GenericArray<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        Integer rta = list2.max();
        if(rta == null){
            System.out.println("esta vacio");
        }else{
            System.out.println("esto es max: "+rta);
        }*/

        Pila pila = new Pila();

        pila.push(1);
        pila.push(3);
        pila.push(2);

        System.out.println(pila);

        System.out.println(pila.pop());

        System.out.println(pila.size());
    }


}
