package Junit.Test;


import Junit.Demo.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /**
     * 初始化方法：
     *  用于资源申请，在所有测试方法执行之前都会执行此方法
     */
    @Before
    public void init(){
        System.out.println("init...");
    }

    /**
     * 释放资源的方法：
     *  在所有测试方法执行完之后执行此方法
     */
    @After
    public void close(){
        System.out.println("close...");
    }
    /*
        测试add方法
     */
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int result = c.add(1, 2);
//        System.out.println(result);
        //采用断言判断程序是否按照期望执行
        Assert.assertEquals(3, result);
    }

}
