package com.lhf.java1;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: EnumDemo.java
 * @Description: Java枚举
 * 原理：当我们使用enmu来定义一个枚举类型的时候，编译器会自动帮我们创建一个final类型的类继承Enum类，
 * 所以枚举类型不能被继承。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月28日 下午4:36:38
 */
public enum EnumDemo {
	Success,
	Fail;
}
