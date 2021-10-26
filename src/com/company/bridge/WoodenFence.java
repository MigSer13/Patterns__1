package com.company.bridge;

public class WoodenFence implements Fence {
    @Override
    public void setMaterial() {
        System.out.println("Забор из дерева");
    }
}
