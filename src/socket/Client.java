package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client{
	
 public static void main(String [] args) throws UnknownHostException, IOException{
  
   Socket so=null;
   BufferedWriter out=null;
   BufferedReader in=null;
   Scanner s=new Scanner(System.in);
  try {
   so=new Socket("localhost",9999);
   in=new BufferedReader
        (new InputStreamReader
          (so.getInputStream()));
   out=new BufferedWriter
        (new OutputStreamWriter
          (so.getOutputStream()));
   while(true) {
    System.out.println("보내기: ");
     String outmsg=s.nextLine();
     if(outmsg.equalsIgnoreCase("stop")) {
    	 	// 대소문자 구분 안함
        out.write(outmsg+"\n");
        out.flush();
        break;
     }
     out.write(outmsg+"\n");
     out.flush();
     String msg=in.readLine();
     System.out.println(msg);
   }}catch(Exception e) {}
     s.close();
     so.close();
   }
 }
