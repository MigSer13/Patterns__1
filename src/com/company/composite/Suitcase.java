package com.company.composite;

import java.util.ArrayList;
import java.util.List;

public class Suitcase implements Shell{
    private List<Shell> shellList = new ArrayList<>();

    public void addComponent(Shell shell){
        shellList.add(shell);
    }
    public void removeComponent(Shell shell){
        shellList.remove(shell);
    }
    @Override
    public void pack() {
        for (Shell component : shellList) {
            component.pack();
        }
    }
}
