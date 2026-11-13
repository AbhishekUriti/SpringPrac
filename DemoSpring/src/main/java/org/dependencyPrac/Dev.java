package org.dependencyPrac;

public class Dev {

//    private Laptop laptop;
    private Computer comp;
//   private int age;

    public Dev() {
        System.out.println("Dev Constructor");
    }

//    public Dev(int age) {
//        this.age = age;
//    }

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){
        System.out.println("working on Awesome Project");
        comp.compile();
    }
}
