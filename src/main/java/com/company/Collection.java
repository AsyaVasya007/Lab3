package com.company;

public class Collection implements ICollection {

    private long t_array;

    private long t_link;

    public Collection() {
        t_array = 0;
        t_link = 0;
    }

    public long getT_array() {
        return t_array;
    }

    public long getT_link() {
        return t_link;
    }

    public void setT_array(long t) {
        t_array = t;
    }

    public void setT_link(long t) {
        t_link = t;
    }
}