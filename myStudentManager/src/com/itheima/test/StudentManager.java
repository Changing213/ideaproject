package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

////////////////////////菜单搭建///////////////////////

public class StudentManager {
    public static void main(String[] args) {
        //注意，不用一直创建Scanner对象，用一个一直接受键盘输入就可以
        Scanner sc = new Scanner(System.in);//全局变量

        //创建集合容器用于存储Student对象
        ArrayList<Student> list = new ArrayList<>();
        //循环次数不可知，应当使用while循环

        //执行完毕之后推出这个循环就可以，继续往下执行，因此要使用循环标号
        lo:while (true) {

            //搭建主界面菜单
            System.out.println("*********欢迎来到学生管理系统**********");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            System.out.println("请输入您需要的选择：");


            String choice = sc.next();

            switch (choice) {
                case "1":
                    System.out.println("添加学生");
                    //现在才来写具体的添加学生的逻辑
                    //写一个方法  不要一直在循环创造scanner对象
                    addStudent(list);
                    break;
                case "2":
                    System.out.println("删除学生");
                    delStudent(list);
                    break;
                case "3":
                    System.out.println("修改学生");
                    revStudent(list);
                    break;
                case "4":
                    System.out.println("查看学生");
                    printStudent(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break lo;//跳出while循环
                //如果输入的不是1-5
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }
    }

    public static void revStudent(ArrayList<Student> list) {
        System.out.println("请输入您需要修改的学生学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();
        int index = getIndex(list,sid);
        if(index != -1){
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();//int型就要用这个
            System.out.println("请输入生日");
            String birth = sc.next();
            Student stu = new Student(sid,name,age,birth);//有参构造方法

            list.set(index,stu);

            System.out.println("修改成功");
        }
        else{
            System.out.println("您输入的学号不存在");
        }
    }

    public static void printStudent(ArrayList<Student> list) {
        //判断集合中是否有数据
        //存在则展示表头信息
        //遍历集合，获取每一个学生对象的信息，打印在控制台

        if(list.size()==0){
            System.out.println("无信息，请添加后再查询");
            return;//以下代码不再执行
        }

        System.out.println("学号\t姓名\t年龄\t生日");

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);//获取集合中每一个学生对象
            System.out.println(stu.getSid()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getBirth());



        }
    }

    public static void delStudent(ArrayList<Student> list) {
        Scanner sc =new Scanner(System.in);//局部变量  不循环使用
        System.out.println("请输入学号");
        String sid = sc.next();
        int index = getIndex(list, sid);
        if(index != -1) {
            list.remove(index);

            System.out.println("删除成功");
        }
        else{
            System.out.println("您输入的信息不存在，请重新输入");
        }
    }

    //添加学生的方法
    public static void addStudent(ArrayList<Student> list) {
        //给出录入的提示信息
        //将键盘录入的信息封装为学生对象
        //将封装好的学生对象，添加到集合容器中
        //给出添加成功的提示信息

        Scanner sc =new Scanner(System.in);
        while (true)//并不知道会输错几次
        {
            System.out.println("请输入学号");
            String sid = sc.next();
            int a = getIndex(list,sid);
            if(a == -1 ){
                System.out.println("请输入姓名");
                String name = sc.next();//可反复接受
                System.out.println("请输入年龄");
                int age = sc.nextInt();//int型就要用这个
                System.out.println("请输入生日");
                String birth = sc.next();

                Student stu = new Student(sid,name,age,birth);//有参构造方法

                list.add(stu);

                System.out.println("添加成功");
                break;//停掉无线循环
            }
            else{
                System.out.println("您输入的学号已存在");
            }

        }


    }

    /*
        getIndex :接受一个集合对象，接受一个学生学号
        查找这个学号，在集合中出现的索引位置
     */
    public static int getIndex(ArrayList<Student> list,String sid){
        //假设集合中没有这个学号
        int index = -1;
        //遍历集合，获取每个学生对象，准备查找
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            //获取每一个学生对象的学号
            String id = stu.getSid();
            //字符串之间比对用equals
            if(id.equals(sid)){
                //存在则用index记录匹配的索引位置
                index = i;

            }

        }
        return index;
    }
}


















