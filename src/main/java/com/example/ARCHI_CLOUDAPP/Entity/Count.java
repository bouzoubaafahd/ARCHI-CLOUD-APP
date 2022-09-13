package com.example.ARCHI_CLOUDAPP.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Count {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private int counter;

    protected Count() {}

    public Count(String firstName, String lastName, int counter) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.counter = counter;
    }

    @Override
    public String toString() {
        return String.format(
                "Count[id=%d, firstName='%s', lastName='%s' , counter = '%s']",
                id, firstName, lastName, counter);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Count)) return false;
        Count count = (Count) o;
        return counter == count.counter && Objects.equals(id, count.id) && Objects.equals(firstName, count.firstName) && Objects.equals(lastName, count.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, counter);
    }
}
