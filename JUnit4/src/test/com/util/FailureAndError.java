package test.com.util;

import com.util.Calculate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
* Calculate Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 30, 2016</pre> 
* @version 1.0
 *
 * 1.Failure（黄色）一般由单元测试使用的断言方法判断失败所引起的，它表示在测试点发现了问题
 * 就是说程序输出的结果和我们预期的不一样。
 * 2.Error（红色）是由代码异常引起的，它可能产生于测试代码本身的错误，也可能是被测试代码中
 * 一个隐藏的bug。
 * 3.测试用例不是用来证明你是对的，而是用来证明你没有错。
*/ 
public class FailureAndError {

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
    assertEquals(6,new Calculate().add(2,3));
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
    assertEquals(9,new Calculate().divide(81,0));
} 


} 
