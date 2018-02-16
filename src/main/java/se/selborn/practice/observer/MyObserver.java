package se.selborn.practice.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by anders on 5/24/17.
 */
public class MyObserver implements PropertyChangeListener {

    public MyObserver(MyModel model){
        model.addChangeListener(this);
    }

    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Changed property: " + evt.getPropertyName() + " [old -> " + evt.getOldValue() + " ] | [new -> " + evt.getNewValue() + " ]");
    }


}
