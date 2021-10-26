package com.company.bridge;

public class WoodHouse extends House{
    public WoodHouse(Fence fence) {
        super(fence);
    }

    @Override
    public void showDetails() {
        System.out.println("Деревянный дом");
        fence.setMaterial();
    }
}
