import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecursiveFibonacciTest {
    private RecursiveFibonacci recursiveFibonacci;

    @BeforeEach
    public void prepare(){
        this.recursiveFibonacci = new RecursiveFibonacci();
    }

    @Test
    @DisplayName("0 when F(0)")
    public void when_zero_should_return_zero(){
        Assertions.assertEquals(0, this.recursiveFibonacci.calculate(0));
    }

    @Test
    @DisplayName("0 when F(0)")
    public void when_one_should_return_one(){
        Assertions.assertEquals(1, this.recursiveFibonacci.calculate(1));
    }

    @Test
    @DisplayName("0 when F(0)")
    public void when_x_should_return_x(){
        Assertions.assertEquals(2, this.recursiveFibonacci.calculate(3));
        Assertions.assertEquals(13, this.recursiveFibonacci.calculate(7));
        Assertions.assertEquals(377, this.recursiveFibonacci.calculate(14));
        Assertions.assertEquals(12586269025l, this.recursiveFibonacci.calculate(50));
    }

}
