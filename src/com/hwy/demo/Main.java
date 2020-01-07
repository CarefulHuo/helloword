package com.hwy.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student student = new Student(input.next(),input.next(),input.nextInt());
            studentList.add(student);
        }
        Collections.reverse(studentList);
        for (Student stu : studentList){
            System.out.println(stu.getGrade());
        }

    }

}

class Student implements Comparable<Student>{
    private String name;
    private String num;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public  Student(String name,String num,int grade){
        this.setGrade(grade);
        this.setNum(num);
        this.setName(name);
    }

    @Override
    public int compareTo(Student stu) {
        if (this.getGrade()>stu.getGrade()){
            return 1;
        }else if((this.getGrade()<stu.getGrade())){
            return -1;
        }
        return 0;
    }
}

