package ru.maximov.calculator;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.junit.Assert;

/**
 * Created by maxim_000 on 07.06.2017.
 */
public class CalculatorSteps {
    private Calculator calc;

    private double a;
    private double b;
    private double result;

    @Допустим("^дано два числа (\\d) и (\\d)$")
    public void given(double a, double b) throws Throwable {
        this.a = a;
        this.b = b;
        this.calc = new Calculator();
    }

    @Если("^сложить их$")
    public void whenSum() throws Throwable {
        result = calc.sum(a, b);
    }

    @То("^получим (\\d)$")
    public void getResult(double res) throws Throwable {
        Assert.assertEquals(res, result, 0.0001);
    }

}
