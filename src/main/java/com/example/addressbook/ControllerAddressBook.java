package com.example.addressbook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class ControllerAddressBook implements AddressBook{
    @Override
    public void add(Person person) {
        personList.add(person);

    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {
        personList.remove(person);

    }

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    public void print(){
        int number = 0;

        for (Person person: personList){
            number++;
            System.out.println(number + ". PIP: " + person.getPip() + "; Phone:" + person.getPhone());
        }
    }

    public void fillTestData(){
        personList.add(new Person("Петро", "+380508841637"));
        personList.add(new Person("Олег", "+380639951425"));
        personList.add(new Person("Оксана", "+380955754473"));
        personList.add(new Person("Дмитро", "+380997594458"));
        personList.add(new Person("Ілона", "+380682524778"));
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ObservableList<Person> personList) {
        this.personList = personList;
    }
}

