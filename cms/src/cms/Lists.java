/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class Lists {
    public static ArrayList<String> state(){
        ArrayList<String> result = new ArrayList<String>();
        result.add("غير منجزة");
        result.add("تم شطبها");
        result.add("لم يراجع احد");
        result.add("منجزة");
        result.add("تحت الإنجاز");
        return result;
    }
    
    public static ArrayList<String> catcgory(){
        ArrayList<String> result = new ArrayList<String>();
        result.add("حسابي");
        result.add("كهربائي");
        result.add("زراعي");
        result.add("بئيي");
        result.add("هندسي");
        result.add("مساحي");
        return result;
    }
}
