package org.java8;

public class Employee {

    public int arr[] =  {2, 4, 5, 7};
    private String name;
    private int sal;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int sal, int age) {
        this.name = name;
        this.sal = sal;
        this.age = age;
    }

    public Employee() {

    }

    public void show() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getSal());

        for(int i = 0 ; i< arr.length ; i++){
            System.out.println(i);
        }

    }
}
