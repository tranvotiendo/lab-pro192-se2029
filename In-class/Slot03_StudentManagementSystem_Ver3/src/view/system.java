/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import data.Student;

/**
 *
 * @author tranv
 */
public class system {

    public static void main(String[] args) {
        Student a = new Student();
        a.setName("Pham Truong Nguyen Cho Vy Hao");
        a.setHocphi(10000000);
        String name1 = a.getName();
        System.out.println(name1);
        System.out.println(a.getHocphi());
        a.xuatHocVien();

    }
}
