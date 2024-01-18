

import java.io.FileWriter;

class P108_CreateFileandWritetotheFile {
public static void main(String[] args) {
String program = "hello i am rohithhhhhh";



 try {

   
   FileWriter output = new FileWriter("JavaFile.java");


   output.write(program);
   System.out.println("Data is written to the file.");

  
   output.close();

 }
 catch(Exception e) {
   e.getStackTrace();
 }
}
}
