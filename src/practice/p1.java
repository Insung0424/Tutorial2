package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class p1 {

	public static void main(String[] args) throws IOException {
//		for(int i = 1;i<=5;i++) {
//			for(int j=1;j<i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println(" : "+i);
//		} 
		
//		for(int i = 5;i>=1;i--) {
//			for(int j=1;j<i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println(" : "+i);
//		} 
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<4-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<2*i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println(" i:"+i);
//		} 
		// ���ݱ��� ������ for���� ���Ǻΰ� Ƚ���� ������ ������
		// ���Ǻο��� Ƚ���� �����ϴ°ͻӾƴ϶� ���̰� �ø� �� ����
		
		InputStreamReader in =new InputStreamReader(System.in);
		PrintWriter out = null;
		try {
			out = new PrintWriter("sample.txt");
			int n =0;
			while((n=in.read())!=-1) {
				out.write(n);
			}
		}catch(Exception e) {}
 		in.close();
 		out.close();
 		
 		BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
 		try {
 			String s;
			while((s=br.readLine()) != null) {
				System.out.println(s);
			}
		}catch(Exception e) {}
		br.close();
	}

}
