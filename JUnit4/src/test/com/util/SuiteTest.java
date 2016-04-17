package test.com.util;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;




/**
* Calculate Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 30, 2016</pre> 
* @version 1.0
 *
 *
 * 1.测试套件就是组织测试类一起运行的
 *
 * 写一个作为测试套件的入口类，这个类里不包含其他方法
 * 更改测试运行器，更改为Suite.class
 * 将要测试的类作为数组传入到Suite.SuiteClasses({})
*/
@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class,TaskTest2.class,TaskTest3.class})
public class SuiteTest {

}
