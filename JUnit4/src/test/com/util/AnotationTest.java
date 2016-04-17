package test.com.util;

import com.util.Calculate;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
* Calculate Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 30, 2016</pre> 
* @version 1.0
 *
 * @Test(expected = XX.class)：会抛出异常
 * @Test(timeout = 毫秒)：设置执行的时间，用于结束死循环或是性能测试
 * @Ignore ：所修饰的测试方法会被测试运行器忽略
 *
*/ 
public class AnotationTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}
/** 
* 
* Method: add(int a, int b) 
* 
*/ 
@Test
public void testAdd() throws Exception {
    assertEquals(5,new Calculate().add(2,3));
} 

/** 
* 
* Method: subtract(int a, int b) 
* 
*/ 
@Test
public void testSubtract() throws Exception {
    assertEquals(6,new Calculate().subtract(10,4));
} 

/** 
* 
* Method: multiply(int a, int b) 
* 
*/ 
@Test
public void testMultiply() throws Exception { 
    assertEquals(18,new Calculate().multiply(3,6));
} 

/** 
* 
* Method: divide(int a, int b) 
* 
*/ 
@Test(expected = ArithmeticException.class)
public void testDivide() throws Exception { 
    assertEquals(9,new Calculate().divide(81,0));
}

    @Ignore
    @Test(timeout = 1000)
    public void testWhile() throws Exception{
        while (true){
            System.out.println("run forever...");
        }

    }

} 
