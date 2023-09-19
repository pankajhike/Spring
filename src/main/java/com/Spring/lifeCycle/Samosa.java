package com.Spring.lifeCycle;

public class Samosa {
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public Samosa() {
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public void init(){
        System.out.println("Inside init Method");
    }
    public void destroy(){
        System.out.println("Inside destroy Method");
    }
}
