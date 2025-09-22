package com.jbio.io;

import java.io.*;

public class B_IO{

    private static String charSet = "UTF-8";
    private static BufferedReader br;
    
    public B_IO(){
        try{
            br = new BufferedReader(new InputStreamReader(System.in, charSet));
        } catch (Exception e){}
        
    }// end Constructor

    public B_IO(String charSet){
        try{
            br = new BufferedReader(new InputStreamReader(System.in, charSet));
        } catch (Exception e){}

        setCharSet(charSet);
        
    }// end Constructor

    public void setCharSet(String charSet){
        B_IO.charSet = charSet;
    }
//Reading Integers

    public int readInt() throws IOException{
        return Integer.parseInt(br.readLine());
    }//end readInt

    public int readInt(String str) throws IOException{
        print(str);
        return readInt();
    }//end readInt

//Reading Doubles

    public static double readDouble() throws IOException {
        return Double.parseDouble(br.readLine().trim());
    }//end readDouble

    public static double readDouble(String prompt) throws IOException {
        print(prompt);
        return readDouble();
    }//end readDouble

//Reading Floats

    public static float readFloat() throws IOException {
        return Float.parseFloat(br.readLine().trim());
    }//end readFloat

    public static float readFloat(String prompt) throws IOException {
        print(prompt);
        return readFloat();
    }//end readFloat

//Reading Longs

    public static long readLong() throws IOException {
        return Long.parseLong(br.readLine().trim());
    }//end readLong

    public static long readLong(String prompt) throws IOException {
        print(prompt);
        return readLong();
    }//end readLong

//Reading Shorts

    public static short readShort() throws IOException {
        return Short.parseShort(br.readLine().trim());
    }//end readShort

    public static short readShort(String prompt) throws IOException {
        print(prompt);
        return readShort();
    }//end readShort

//Reading Bytes

    public static byte readByte() throws IOException {
        return Byte.parseByte(br.readLine().trim());
    }//end readBytes

    public static byte readByte(String prompt) throws IOException {
        print(prompt);
        return readByte();
    }//end readBytes

//Reading Boolean

    public static boolean readBoolean() throws IOException {
        return Boolean.parseBoolean(br.readLine().trim());
    }//end readBoolean

    public static boolean readBoolean(String prompt) throws IOException {
        print(prompt);
        return readBoolean();
    }//end readBoolean

//Reading String

    public static String readString() throws IOException {
        return br.readLine();
    }//end readString

    public static String readString(String prompt) throws IOException {
        print(prompt);
        return readString();
    }//end readString

//Reading Chars

    public static Char readChar() throws IOException {
        return br.readLine();
    }//end readString

    public static Char readChar(String prompt) throws IOException {
        print(prompt);
        return readChar();
    }//end readChar

    
    public static void print(Object obj){
        System.out.println(obj);
    }//end print

}