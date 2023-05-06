//package Classwork.day30;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class CalcTests {
//    Calculator calculator = new Calculator();
//
//    @Test
//    public void myCalcAddTest() {
//        Assert.assertEquals("Addition return wrong result: ", 4, calculator.add(2, 2));
//    }
//    @Test
//    public void myCalcAddNegativeTest() {
//        Assert.assertEquals("Addition return wrong result: ", -3, calculator.add(-2, -1));
//    }
//    @Test
//    public void myCalcAddZeroTest() {
//        Assert.assertEquals("Addition return wrong result: ", 0, calculator.add(0, 0));
//    }
//
//    @Test
//    public void myCalcSubtractTest() {
//        Assert.assertEquals("Addition return wrong result: ", 0, calculator.subtract(2, 2));}
//    @Test
//    public void myCalcSubtractNegativeTest() {
//        Assert.assertEquals("Addition return wrong result: ", -8, calculator.subtract(-3, 5));
//    }
//    @Test
//    public void myCalcSubtractZeroTest() {
//        Assert.assertEquals("Addition return wrong result: ", 0, calculator.subtract(0, 0));
//    }
//
//    @Test
//    public void myCalcMultiplyTest() {
//        Assert.assertEquals("Addition return wrong result: ", 4, calculator.multiply(2, 2));
//    }
//    @Test
//    public void myCalcMultiplyNegativeTest() {
//        Assert.assertEquals("Addition return wrong result: ", -6, calculator.multiply(-2, 3));
//    }
//    @Test
//    public void myCalcMultiplyZeroTest() {
//        Assert.assertEquals("Addition return wrong result: ", 0, calculator.multiply(0, 0));
//    }
//
//    @Test
//    public void myCalcDivideTest() {
//        Assert.assertEquals("Addition return wrong result: ", 1, calculator.divide(2, 2));
//    }
//    @Test
//    public void myCalcDivideNegativeTest() {
//        Assert.assertEquals("Addition return wrong result: ", -2, calculator.divide(-8, 4));
//    }
//    @Test
//    public void myCalcDivideZeroTest() {
//        Assert.assertEquals("Addition return wrong result: ", 0, calculator.divide(0, 3));
//    }
//}