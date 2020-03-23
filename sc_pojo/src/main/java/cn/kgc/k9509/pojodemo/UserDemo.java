package cn.kgc.k9509.pojodemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname UserDemo
 * @Description TODO
 * @Date 2020/3/15 14:58
 * @Created by Alina
 */
@SuppressWarnings("serial")
@AllArgsConstructor  //创建全参的构造函数
@NoArgsConstructor   //空参的构造函数
@Data   //为每个数据都设置一个get/set方法
public class UserDemo {
    private int id;
    private String name;
}