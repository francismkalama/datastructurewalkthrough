package org.example.datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class TheMapCollection {

    public static void main(String [] args){
        Map<Integer, customer> mymap = new HashMap<>();
        mymap.put(1, new customer("francis"));
        mymap.put(2, new customer("Jackob"));
        mymap.put(3, new customer("Thomas"));

        System.out.println(mymap.entrySet());
        mymap.entrySet().forEach(System.out::println);
//        System.out.println("-------------prints out foreach lambda-----------");
//        mymap.entrySet().forEach(x -> System.out.println(x.getKey()+" "+ x.getValue()));
        System.out.println("-----------prints out foreach---------------");
        mymap.forEach((Key, customer)->{
            System.out.println(Key+" "+customer);
        });
    }



    static class customer{
        private String name;

        customer(String iname){
            this.name = iname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            customer customer = (customer) o;
            return Objects.equals(name, customer.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "customer{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

}
