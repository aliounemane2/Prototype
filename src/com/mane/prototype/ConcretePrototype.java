package com.mane.prototype;

public class ConcretePrototype extends Prototype {

    /**
     * Implements Prototype, meaning clone method.
     */
    @Override
    Prototype copyMe() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }
}
