import structures.OrderedList;
import structures.OrderedList.NodeI;
import structures.OrderedList.Node;

import javax.sound.midi.Soundbank;
import java.util.Calendar;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {
        OrderedList<String> months = new OrderedList<>();

        months.insert("Jan");
        months.insert("Feb");
        months.insert("Mar");
        months.insert("Apr");
        months.insert("May");

        //Test foreach
        for (Object s : months) {
            System.out.println(s.toString());
        }

        System.out.println("months.remove(\"App\");");
        months.remove("App");
        System.out.println(months.toString());

        System.out.println("months.remove(\"Apr\");");
        months.remove("Apr");
        System.out.println(months.toString());

        System.out.println("Max : " + months.max().toString());
        System.out.println("Min : " + months.min().toString());
        System.out.println("At : " + months.at(3).toString());
        System.out.println("Search(Feb) : " + months.search("Feb"));
        System.out.println("Search(Fer) : " + months.search("Fer"));
        System.out.println("Index(Feb) : " + months.index("Feb"));
        System.out.println("Index(Fer) : " + months.index("Fer"));
        System.out.println("----------------------------------------");
        System.out.println("Iterator test: ");
        NodeI iter = months.iterator();
        while (iter.hasNext()){
            Node n = iter.next();
            System.out.println(n.toString());
            if(n.getData().compareTo("Mar") == 0)
                iter.remove();
        }
        System.out.println("----------------------------------------");

        iter = months.iterator();
        while (iter.hasNext()){
            Node n = iter.next();
            System.out.println(n.toString());
        }

        OrderedList<Calendar> days = new OrderedList<>();
        days.insert(Calendar.getInstance());

            System.out.println(days.max().getTime());



    }
}
