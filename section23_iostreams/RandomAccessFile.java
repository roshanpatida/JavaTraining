///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package section22_iostreams;
//
///**
// *
// * @author roshan_patidar
// */
//
//
//import java.io.*;
//
//public class RandomAccessFile 
//{
//
//    public RandomAccessFile(String homeroshan_patidarFileOutputStreamDestina, String rw) {
//    }
//    public static void main(String[] args) throws Exception
//    {
//        RandomAccessFile rf=new RandomAccessFile("/home/roshan_patidar/FileOutputStream/Destination.txt","rw");
//       //byte b[]={'A','B','C','D','E','F','G''H','I','J'};
//       
//        System.out.println((char)rf.read());
//        System.out.println((char)rf.read());
//        System.out.println((char)rf.read());
//        rf.write('d');
//        System.out.println((char)rf.read());
//        rf.skipBytes(3);
//        System.out.println((char)rf.read());
//        rf.seek(3);
//        System.out.println((char)rf.read());
//        System.out.println(rf.getFilePointer());
//        rf.seek(rf.getFilePointer()+2);
//        System.out.println((char)rf.read());
//
//        
//
//       
//    }   
//}