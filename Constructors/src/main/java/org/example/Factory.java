package org.example;

public class Factory extends Building {
    private String product;
    private int dangerClass;

    public Factory(String material, String earCreate, String typeFoundation, String product, int dangerClass) {
        super(material, earCreate, typeFoundation);
        this.product = product;
        this.dangerClass = dangerClass;
    }

    public Factory(String product, int dangerClass) {
        this.product = product;
        this.dangerClass = dangerClass;
    }

    public Factory() {
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" завод производит %s класс опасности %d ",product,dangerClass);
    }
}
