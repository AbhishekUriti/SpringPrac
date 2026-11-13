package org.dependencyprac.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AlienDev {
    @Autowired
    @Qualifier("desktop")
    private Computer computer;
//
//    public AlienDev(Laptop laptop){
//        this.laptop=laptop;
//    }
//        @Autowired
//        public void setLaptop(Laptop laptop){
//            this.laptop=laptop;
//        }


    public void build(){
        System.out.println("working on Awesome Project");
        computer.compile();
    }
}
