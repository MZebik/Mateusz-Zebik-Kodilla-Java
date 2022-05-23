package com.kodilla.stream.invoice.simple.sand;

import java.math.BigDecimal;

public final class Africa implements SandStorage{

    @Override
    public BigDecimal getSandBeansQuantity(){
        BigDecimal sandQuantity = new BigDecimal("99999999901234567890");
        return sandQuantity;
    }
}
