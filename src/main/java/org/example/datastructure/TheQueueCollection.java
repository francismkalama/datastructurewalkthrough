package org.example.datastructure;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;


public class TheQueueCollection {
    public static void main(String [] args){
        Queue<customer> mycustomerqueue = new LinkedList<>();
        mycustomerqueue.add(new customer("francis",25));
        mycustomerqueue.add(new customer("stano",30));
        mycustomerqueue.add(new customer("tobias",45));
        mycustomerqueue.add(new customer("wajakoya",70));
        mycustomerqueue.add(new customer("bazuu",25));

        System.out.println(mycustomerqueue.peek());
        System.out.println(mycustomerqueue.size());
        System.out.println(mycustomerqueue.poll());
        System.out.println(mycustomerqueue.size());
        System.out.println(mycustomerqueue.peek());
        mycustomerqueue.forEach(System.out::println);

    }
      static class customer{
        private String name;
        private int age;
        customer(String iname, int age){
            this.name = iname;
            this.age = age;

        }

          @Override
          public boolean equals(Object o) {
              if (this == o) return true;
              if (o == null || getClass() != o.getClass()) return false;
              customer customer = (customer) o;
              return age == customer.age && Objects.equals(name, customer.name);
          }

          @Override
          public int hashCode() {
              return Objects.hash(name, age);
          }

          @Override
          public String toString() {
              return "customer{" +
                      "name='" + name + '\'' +
                      ", age=" + age +
                      '}';
          }
      }
}
