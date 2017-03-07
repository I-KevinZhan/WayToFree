package com.github.siemen.generics;

/**
 * Created by Zhan on 2017/3/7 0007.
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first,T second){
        this.first = first;
        this.second = second;
    }

    public Pair() {
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
