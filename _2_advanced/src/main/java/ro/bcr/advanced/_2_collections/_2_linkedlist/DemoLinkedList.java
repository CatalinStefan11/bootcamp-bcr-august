package ro.bcr.advanced._2_collections._2_linkedlist;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

    public static void main(String[] args) {

        List<Customer> customers = new LinkedList<>();

        customers.add(new Customer("Vlad"));
        customers.add(new Customer("Stefan"));
        
        customers.add(new Customer("Laur"));
        customers.add(new Customer("Catalin"));

        System.out.println(customers.get(2));

        customers.set(0, new Customer("Stefania"));
        customers.remove(1);

        System.out.println(customers.size());

        for(Customer c : customers){
            System.out.println(c);
        }

    }

}
