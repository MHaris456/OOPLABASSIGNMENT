
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {


 List<Pc> list1 = new ArrayList<>();
 list1.add(new Pc (1,"dell","234gb","128gb","telenor",true));
 list1.add(1, new Pc (1,"dell","234gb","128gb","telenor",true));
 list1.add(1, new Pc (2,"dell","234gb","128gb","telenor",true));
 list1.add(1, new Pc (3,"dell","234gb","128gb","telenor",true));
 list1.add(1, new Pc (5,"dell","234gb","128gb","telenor",true));

 List<Pc> list2 = new ArrayList<>();
// list2.addAll(list1);
// list1.addAll(2,list2);
//for(Pc i : list1){
//	System.out.println(i);
//}
// for(Pc i : list2){
//  System.out.println(i);
// }
//
list1.remove(new Pc(1,"dell","234gb","128gb","telenor",true));
     //list1.remove(1);


     System.out.println(list1.contains(new Pc(1,"dell","234gb","128gb","telenor",true)));

     list1.set(3,new Pc(6,"abdullah","haris","ali","rahmanb",false) );

     Collections.sort(list1, Comparator.comparingInt(Pc::getId));

     for (int i = 0; i < list1.size(); i++) {
      list1.get(i).setId(list1.get(i).getId() + 2);
     }
     list1.sort(new Pc());

     for (Pc pc : list1) {
      System.out.println((pc));
     }
    }



}



































