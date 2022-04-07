
package com.mycompany.student;

/**
 *
 * @author LENOVO
 */

class Name{
    String name;
}

public class Student {

    public static void main(String[] args) {
        Name nama_siswa = new Name();
        nama_siswa.name = "Yusuf";
        
        System.out.println("Hello! My name is " +nama_siswa.name);
    }
}
