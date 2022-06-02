package dictionaryelev;

import opg1.Bil;


public class Opg2Afproevning {
    public static void main(String[] args) {
        Dictionary<Bil, Integer> map = new DictionaryLinked<>();

        Bil b1 = new Bil(123, "Audi", "A1", "Gul");


        System.out.println(map.remove(b1) + " : null");
        System.out.println(map.get(b1) + " : null");
        System.out.println(map.put(b1, 3) + " : null");
        System.out.println(map.put(b1, 20) + " : 3" );
        System.out.println(map.get(b1) + " : 20");
        System.out.println(map.remove(b1) + " : 20");
        System.out.println(map.get(b1) + " : null");
    }


}
