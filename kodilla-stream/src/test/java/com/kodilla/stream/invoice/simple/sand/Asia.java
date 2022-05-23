package com.kodilla.stream.invoice.simple.sand;

import java.math.BigDecimal;

public final class Asia implements SandStorage{

    @Override
    public BigDecimal getSandBeansQuantity(){
        BigDecimal sandQuantity = new BigDecimal("98765432101234567890");
        return sandQuantity;
    }
}
