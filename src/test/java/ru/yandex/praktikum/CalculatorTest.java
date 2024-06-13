package ru.yandex.praktikum;
import ru.yandex.praktikum.Calculator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class CalculatorTest {
    private final int a;
    private final int b;
    private final int result;

    public CalculatorTest(int a, int b, int result){
        this.a = a;
        this.b = b;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData(){
            return new Object[][]{
                    {10,20,30},
                    {2,2,4}, 
            };
    }

    @Test
    public void CheckPositiveNumber(){

        Calculator calculator = new Calculator();
        int sum = calculator.sum(a,b);
        assertEquals("Сумма значений: " + a + " + " + b + " должно быть равно: " + result + ". Фактический результат равен: " + sum, result, sum);
    }
}