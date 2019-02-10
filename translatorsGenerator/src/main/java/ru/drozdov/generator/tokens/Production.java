package ru.drozdov.generator.tokens;

import java.util.List;

public class Production {
    public List<MyToken> getProductionTokens() {
        return productionTokens;
    }

    List<MyToken> productionTokens;

    public Production(List<MyToken> productionTokens) {
        this.productionTokens = productionTokens;
    }
}
