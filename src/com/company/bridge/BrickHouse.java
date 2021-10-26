package com.company.bridge;

public class BrickHouse extends House{
    public BrickHouse(Fence fence) {
        super(fence);
    }

    @Override
    public void showDetails() {
        System.out.println("Кирпичный дом");
        fence.setMaterial();
    }
}
