package com.sbw.hacker.eodFile;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Java End-of-file
 * "In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system
 * where no more data can be read from a data source." — (Wikipedia: End-of-file)
 * The challenge here is to read lines of input until you reach EOF, then number and print all lines of
 * content.
 * Hint: Java's Scanner.hasNext() method is helpful for this problem.
 * Input Format
 * Read some unknown lines of input from stdin(System.in) until you reach EOF; each line of input contains a
 * non-empty String.
 * Output Format
 * For each line, print the line number, followed by a single space, and then the line content received as input.
 * Sample Input
 * Hello world
 * I am a file
 * Read me until end-of-file.
 * Sample Output
 * 1 Hello world
 * 2 I am a file
 * 3 Read me until end-of-file
 */
public class EndOfFile {
    public static void main(String[] args) {
        ArrayList<String> line= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String data = sc.nextLine();
            if(data.length()> 0){
                line.add(data);
            }
        }



        IntStream.range(0, line.size())
                .forEach(i -> System.out.println((i+1)+" "+line.get(i)));
    }
}
