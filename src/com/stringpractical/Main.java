package com.stringpractical;

public class Main {

    public static void main(String[] args) {
        String greeting = "              Hello    ";
        System.out.println("Without trim() operation : " + greeting);
        System.out.println("With trim() operation : " + greeting.trim().toUpperCase());


        StringBuffer sb = new StringBuffer();
        sb.append("           Myself Yash Tailor from Ahmedabad \n");
        sb.append("As Talking about myself I have experience as a Full Stack Java Intern \n");
        sb.append("I also have an interest in Database with Strong command in MySQL \n");
        sb.append("During my free hours, I solve data structure and algorithms problems in Leetcode and GFG \n");
        sb.append("Best Regards !         ");
        System.out.println("Before operation in StringBuffer :  \n" + sb);
        System.out.println("After trim() and toUpperCase() :  \n" + sb.toString().trim().toUpperCase());


        StringBuilder sbr = new StringBuilder();
        sbr.append("           Myself Yash Tailor from Ahmedabad \n");
        sbr.append("As Talking about myself I have experience as a Full Stack Java Intern \n");
        sbr.append("I also have an interest in Database with Strong command in MySQL \n");
        sbr.append("During my free hours, I solve data structure and algorithms problems in Leetcode and GFG \n");
        sbr.append("Best Regards!              ");
        System.out.println("Before operation in StringBuilder:  \n" + sbr);
        System.out.println("After trim() and toUpperCase() :  \n" + sbr.toString().trim().toUpperCase());
    }
}