package com.mane.prototype;

public class ConcretePrototype extends Prototype {
    @Override
    Prototype copyMe() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }
}
