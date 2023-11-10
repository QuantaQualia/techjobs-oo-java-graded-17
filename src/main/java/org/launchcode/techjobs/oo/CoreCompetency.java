package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private static int nextId = 1;
    private String value;

    private String name;
    private String employer;
    private String location;
    private String positionType;
    private String coreCompetency;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }

    public CoreCompetency(int id) {
        this();
        this.id = id;
    }

    public CoreCompetency (String name, String employer, String location, String positionType, String coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(String coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.


    public static int getNextId() {
        return nextId;
    }
}
