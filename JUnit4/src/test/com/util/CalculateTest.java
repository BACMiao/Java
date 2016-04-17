package test.com.util;

import com.util.Calculate;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;


/**
* Calculate Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 30, 2016</pre> 
* @version 1.0
 *
 * 1.测试方法必须使用@Test进行修饰
 * 2.测试方法必须使用public void进行修饰，不能带任何参数
 * 3.要用另一个源代码文件夹来存放我们的测试代码
 * 4.测试类的包应该与被测试类的保持一致
*/ 
public class CalculateTest { 

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
@Test
public void testDivide() throws Exception { 
    assertEquals(9,new Calculate().divide(81,9));
} 


} 
