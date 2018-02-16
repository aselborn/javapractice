package se.selborn.practice.main;

import se.selborn.practice.observer.MyModel;
import se.selborn.practice.observer.MyObserver;

/**
 * Created by anders on 5/24/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");

        MyModel myModel = new MyModel();
        MyObserver myObserver = new MyObserver(myModel);

        for (MyModel.Person person : myModel.getPersons()){
            person.setLastName(person.getLastName() + "1");
        }

        for (MyModel.Person person : myModel.getPersons()){
            person.setFirstName(person.getFirstName()+ "1");
        }
    }

}
