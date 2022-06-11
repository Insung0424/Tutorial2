package Movie.frame;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameBase extends JFrame{
	private static FrameBase instance;
	
	private FrameBase(JPanel jPanel) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		�ý��� ����(ȭ�� ũ�⸦ ��� ���� Toolkit)
		
		setTitle("movie ticket reservation");
		setLayout(null);
		setBounds(((int) toolkit.getScreenSize().getWidth()) / 2 - 300,
				((int) toolkit.getScreenSize().getHeight()) / 2 - 400,
				600,800);
		
		add(jPanel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void getInstance(JPanel jPanel) {
		instance = new FrameBase(jPanel);
		//�����ڸ� ���� �⺻ ������ ����
		
		instance.getContentPane().removeAll();
		instance.getContentPane().add(jPanel);
		
		instance.revalidate();
//		���̾ƿ� �����ڿ��� ���̾ƿ������� �ٽ� ����ϵ��� ����
		instance.repaint();
//		���̾ƿ��� ���� �׸���
	}
}
