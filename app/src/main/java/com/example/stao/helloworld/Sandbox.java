package com.example.stao.helloworld;

import android.graphics.drawable.shapes.RectShape;

import java.util.ArrayList;
import java.util.List;

public class Sandbox extends RectShape{
//    refactor initialization to constructor
    private List<String> mGreetings = new ArrayList<String>();

    @Override
    public boolean hasAlpha() {
        return true;
    }

    public boolean add(String object) {
        return mGreetings.add(object);
    }

    @Override
    public String toString() {
        return "Sandbox{" + "mGreetings=" + mGreetings + '}';
    }

    public Sandbox(List<String> greetings) {
        mGreetings = greetings;
    }

    public Sandbox() {

    }

    public List<String> getGreetings() {
        return mGreetings;
    }

    public void setGreetings(List<String> greetings) {
        mGreetings = greetings;
    }
}
