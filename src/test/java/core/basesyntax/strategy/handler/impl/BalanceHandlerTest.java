package core.basesyntax.strategy.handler.impl;

import static org.junit.Assert.assertEquals;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.model.Operation;
import core.basesyntax.strategy.handler.OperationHandler;
import org.junit.BeforeClass;
import org.junit.Test;

public class BalanceHandlerTest {
    private static final FruitTransaction balanceFruitTransaction
            = new FruitTransaction(Operation.BALANCE, "apple", 100);
    private static OperationHandler operationHandler;

    @BeforeClass
    public static void beforeClass() {
        operationHandler = new BalanceHandler();
    }

    @Test
    public void balanceOperationResult_Ok() {
        FruitTransaction actualFruitTransaction
                = operationHandler.getOperationResult(balanceFruitTransaction);
        assertEquals(balanceFruitTransaction, actualFruitTransaction);
    }
}