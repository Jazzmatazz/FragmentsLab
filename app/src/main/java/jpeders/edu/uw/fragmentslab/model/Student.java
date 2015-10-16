package jpeders.edu.uw.fragmentslab.model;

/**
 * Created by Jasmine on 10/14/2015.
 */
public class Student {
    private int mId;
    private String name;
    private String major;

    public void Student(int mId, String name, String major) {
        this.mId = mId;
        this.name = name;
        this.major = major;

    }


    public void setId(int id) {
        mId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return mId;
    }

    public String toString() {
        return mId + " - " + name + ", " + major;
    }
};


