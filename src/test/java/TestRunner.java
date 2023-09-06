import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestRunner extends Setup {
    CalcScreen cal;
    @Test (priority = 1,description = "Sum between two numbers")
    public void doSum() throws InterruptedException {
        cal = new CalcScreen(driver);
        String sum = cal.doSum();
        //System.out.println(sum);

        //Assertion
        Assert.assertEquals(sum, "14");
        cal.btnClr.clear();

    }

    @Test (priority = 2,description = "Sub between two numbers")
    public void doSub() throws InterruptedException {
        cal = new CalcScreen(driver);
        String sub = cal.doSub();
        //System.out.println(sub);

        //Assertion
        Assert.assertEquals(sub, "5");
    }

    @Test (priority = 3,description = "Multiply the result of sum and subtraction")
    public void doMul() throws InterruptedException {
        cal = new CalcScreen(driver);
        String mul=cal.doMul();
        //System.out.println(mul);

        //Assertion
        Assert.assertEquals(mul,"70");
    }

    @Test (priority = 4,description = " Divide the result of multiplication with 10")
    public void doDiv() throws InterruptedException {
        cal = new CalcScreen(driver);
        String div=cal.doDiv();
        cal.btnClr.clear();
        //System.out.println(div);

        //Assertion
        Assert.assertEquals(div,"7");
    }
    @Test (priority = 5,description = " Calculate the Series equation")
    public void doSeries() throws InterruptedException {
        cal = new CalcScreen(driver);
        String ser=cal.doSeries();
        cal.btnClr.clear();
        //System.out.println(ser);

        //Assertion
        Assert.assertEquals(ser,"260");
    }
    //@AfterMethod
    public void clearScreen(){
        cal=new CalcScreen(driver);
        cal.btnClr.clear();
    }
}
