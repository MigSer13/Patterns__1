package com.company.bridge;

public class ProfiledSheetFence implements Fence {
    @Override
    public void setMaterial() {
        System.out.println("Забор из профлиста");
    }
}
