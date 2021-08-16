import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    @Test
    void toReturnSumWhenAddingTwoPositiveNumbers()  // Additionoftwopositivenumbers
    {
        Arithmetic aobj = new Arithmetic(2,5);
        int expectedSum = 7;
        int actualSum = aobj.sum();
        assertEquals(expectedSum,actualSum);
    }

    @Test
    void toReturnSumWhenAddingTwoNegativeNumbers()     //Additionodtwonegativenumbers
    {
        Arithmetic aobj = new Arithmetic(-2,-5);
        int expectedSum = -7;
        int actualSum = aobj.sum();
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void positivenumberminusnegativenumber()     //Additionofbothnegativeandpositive
    {
        Arithmetic aobj = new Arithmetic(-6,2);
        int expectedSum = -4;
        int actualSum = aobj.sum();
        assertEquals(expectedSum, actualSum);
    }

    void substractionoftwopositivenumbers()    //substractionoftwopositivenumbers
    {
        Arithmetic aobj = new Arithmetic(6,2);
        int expectedDiff = 4;
        int actualDiff = aobj.diff();
        assertEquals(expectedDiff, actualDiff);
    }

    void substractionoftwonegativenumbers()    //substractionoftwonegativeenumbers
    {
        Arithmetic aobj = new Arithmetic(-6,-2);
        int expectedDiff = -4;
        int actualDiff = aobj.diff();
        assertEquals(expectedDiff, actualDiff);
    }

    void productoftwopositivenumbers()    //productoftwopositivenumbers
    {
        Arithmetic aobj = new Arithmetic(6,2);
        int expectedproduct = 12;
        int actualproduct = aobj.product();
        assertEquals(expectedproduct, actualproduct);
    }

    void productoftwonegativenumbers()    //productoftwonegativenumbers
    {
        Arithmetic aobj = new Arithmetic(-6,-2);
        int expectedproduct = 12;
        int actualproduct = aobj.product();
        assertEquals(expectedproduct, actualproduct);
    }

    void productofpositiveandzero()    //productofpositiveandzero
    {
        Arithmetic aobj = new Arithmetic(6,0);
        int expectedproduct = 0;
        int actualproduct = aobj.product();
        assertEquals(expectedproduct, actualproduct);
    }

    void divsionofpositivenumber()    //divisonofpositivenumbers
    {
        Arithmetic aobj = new Arithmetic(6,2);
        int expecteddivision = 3;
        int actualdivision = aobj.divison();
        assertEquals(expecteddivision, actualdivision);
    }

    void divsionofpositivenumberandzero()    //divisonofpositivenumberandzero
    {
        Arithmetic aobj = new Arithmetic(0,6);
        int expecteddivision = 0;
        int actualdivision = aobj.divison();
        assertEquals(expecteddivision, actualdivision);
    }
}
