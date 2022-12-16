package org.example;

public class Building {
    private String material;
    private String earCreate;
    private String typeFoundation;

    public Building(String material, String earCreate, String typeFoundation) {
        this.material = material;
        this.earCreate = earCreate;
        this.typeFoundation = typeFoundation;
    }

    public Building() {
    }

    @Override
    public String toString() {
        return String.format("Здание %s года, материал %s, тип фундамента %s", earCreate,material,typeFoundation);
    }
}
