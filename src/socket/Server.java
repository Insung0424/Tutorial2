package socket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		BufferedWriter out = null;
		BufferedReader in = null;
		
		ServerSocket ser = null; //ip,port
		Socket so = null; //data �ְ� ������ ���
		//�����ʿ��� �ʿ��� ��ü��
		
		Scanner scan = new Scanner(System.in);
		try {
			ser = new ServerSocket(8080);
		}catch(Exception e) {}
		System.out.println("������ ��ٸ�");
		//Ŭ���̾�Ʈ�� �����û�� �ö����� ��ٸ���
		try {
			so=ser.accept();// ���� ����
		}catch(Exception e) {}
		//�����ʿ��� Ŭ���̾�Ʈ���� �޽����� ������
		
		try {
			out = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		
			in = new BufferedReader(new InputStreamReader(so.getInputStream()));
		
			while(true) {
				String msg = in.readLine();
				
				if(msg.equals("stop")) {
					System.out.println("stop");
					break;
				}
				
				System.out.println("send");
				
				String outmsg = scan.nextLine();
				out.write(outmsg+"\n");
				out.flush(); // ���� ���ۿ��ִ� ������ �����ϰ� ����
			}
		}catch(Exception e) {
			e.getStackTrace();
		}finally {
			try {
				scan.close();
				so.close();
				ser.close();
			} catch (IOException e) {
				System.out.println("�����߻�");
			}
		}

	}

}
