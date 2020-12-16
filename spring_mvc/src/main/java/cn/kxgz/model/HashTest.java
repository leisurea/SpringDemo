package cn.kxgz.model;

import java.util.Objects;

public class HashTest {
    private String name;
    private int age;

    public HashTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        HashTest hashTest = (HashTest) o;
//        return age == hashTest.age && Objects.equals(name, hashTest.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        HashTest test1 = new HashTest("空虚公子",18);
        HashTest test2 = new HashTest("空虚公子",18);
        System.out.println(test1.hashCode() == test2.hashCode());
        System.out.println(test1.equals(test2));
        System.out.println("test1".equals("test1"));
        String gg = "test";
        String ggg = "test";
        Integer yiyi = 123456789;
        Integer yi = 123456789;
        System.out.println(yiyi==yi);
    }
}
