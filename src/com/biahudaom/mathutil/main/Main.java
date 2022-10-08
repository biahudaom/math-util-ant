/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.biahudaom.mathutil.main;

import com.biahudaom.mathutil.core.MathUtil;

/**
 *
 * @author Bia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        System.out.println("This message comes from the main() method");
        tryTDDFirst();
    }
    
    public static void tryTDDFirst() {
        //Test case #1 - Tình huống xài hàm số 1;
        //n = 0; hy vọng hàm trả về expected = 1;
        //  thực tế hàm trả về mấy, actual
        long expected = 1;
        long actual = MathUtil.getFactorial(0); //xài hàm vừa viết
        //so sánh 2 giá trị để hàm viết đúng hay ko???
        //3 thứ này tổ hợp nên 1 thứ gọi là TEST CASE - TÌNH HUỐNG XÀI APP
        System.out.println("0! Status | Expected = " + expected + 
                                    " | Actual = " + actual);
        //vietsub: 0! có đúng là = 1 hay ko???
        
        //Test case #2: n = 1, 1! hy vọng trả về 1 luôn, thực tế là mấy, chạy hàm mới biết
        expected = 1;
        actual = MathUtil.getFactorial(1);
        System.out.println("1! Status | Expected = " + expected + 
                                    " | Actual = " + actual);
        //vietsub: 1! có bằng 1 hay ko???
        
        //Test case #3: n = 2, 2! hy vọng trả về 1 luôn, thực tế là mấy, chạy hàm mới biết
        System.out.println("2! Status | Expected = 2" + 
                                    " | Actual = " + MathUtil.getFactorial(2));
    }
    
    
}
