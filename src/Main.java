import entities.product;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

         List<product> list = new ArrayList<>();

         list.add(new product("TV", 900.00));
         list.add(new product("Notebook", 1200.00));
         list.add(new product("Tablet", 450.00));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (product p : list) {
            System.out.println(p);
        }


    }
    }
