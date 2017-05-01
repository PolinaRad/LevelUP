package com.company.Farm;

public class Tractor extends Farm{
    Tractor() {

    }
    void driver(Farm other){
        System.out.println(
            name + " едет с "
                    + other.name);
    }


    }

