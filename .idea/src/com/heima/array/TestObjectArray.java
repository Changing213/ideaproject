package com.heima.array;
/*
            将三个学生的学生信息（张三，23），存入一个数组中，并遍历输出显示
            1.定义一个学生类
            2.创造三个学生对象，存入数据
            3.创造一个学生类型数组
            4.将学生对象存入数组
            5.遍历输出数组。
 */
import com.heima.domain.Student;
//Student不是同一个包的的类，要想使用，必须得导包。

public class TestObjectArray {
    public static void main(String[] args) {
    Student[] arr = new Student[3];   //动态初始化长度为3的数组，类型为Student类型。
        Student stu1 = new Student("张三",23);//创建三个对象，把数据存进去。
        Student stu2 = new Student("李四",24);
        Student stu3 = new Student("王五",25);
        //将学生对象存入数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //遍历数组，取出每一个学生对象,arr.fori快捷键
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i].getAge()+"***"+arr[i].getName());

        }
    }
}
