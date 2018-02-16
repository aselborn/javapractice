package se.selborn.practice.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by anders on 5/24/17.
 */
public class MyModel {

    public static final String FIRSTNAME="firstName";
    public static final String LASTNAME="lastName";

    private List<Person> persons = new ArrayList<Person>();
    private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();

    public class Person{
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setFirstName(String firstName) {
            notifyListeners(
                    this, FIRSTNAME, this.firstName, this.firstName=firstName
            );
        }

        public void setLastName(String lastName) {

            notifyListeners(this, LASTNAME, this.lastName, this.lastName=lastName);

        }
    }

    public List<Person> getPersons(){
        return persons;
    }

    public MyModel(){

        persons.add(new Person("Anders", "Selborn"));
        persons.add(new Person("Carolina", "Fuxin"));

    }

    private void notifyListeners(Object object, String property, String oldValue, String newValue){
        for (PropertyChangeListener name : listener){
            name.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
        }
    }

    public void addChangeListener(PropertyChangeListener newListener){
        listener.add(newListener);
    }

}
