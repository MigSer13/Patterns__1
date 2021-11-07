package com.company.bridge;

public abstract class House {
    Fence fence;

    public House(Fence fence) {
        this.fence = fence;
    }

    public abstract void showDetails();
}
