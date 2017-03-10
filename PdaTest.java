import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class PdaTest {
Pda pda;
int test;
int num1;
int num2;
int intResult;
boolean booleanResult;
String stringResult;

@Before
public void before() {
  pda = new Pda(); 
test = 10;
num1 = 5;
num2 = 3;


}

@Test
public void test_func1() {
booleanResult = pda.func1(test);

assertEquals( false, booleanResult);

}

@Test
public void test_func1Passes() {
  test = 1;
booleanResult = pda.func1(test);

assertEquals( true, booleanResult);

}

@Test
public void test_max() {
intResult = pda.max(num1, num2);

assertEquals(5, intResult);

}

@Test
public void test_maxReturnsEqualValue() {
  num1 = 3;
intResult = pda.max(num1, num2);

assertEquals(3, intResult);

}

@Test 
public void test_looper() {
intResult = pda.looper();

  assertEquals(11, intResult);

}

@Test
public void test_checkLoop() {
stringResult = pda.checkLoop();
  assertEquals( "looper passed", stringResult);


}




}



