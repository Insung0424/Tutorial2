import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClassTwentyone extends JFrame{
	
//	ClassTwentyone(){
//		setTitle("first");
//		
//		JButton j1=new JButton("button1");
//		JButton j2=new JButton("button2");
//		
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		c.add(j1);
//		c.add(j2);
//		c.setBackground(Color.black);
//		
//		setSize(300,450);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyone(){
//		setTitle("second");
//		JButton j1=new JButton("button1");
//		JButton j2=new JButton("button2");
//		
//		Container c = getContentPane();
//		c.setLayout(new BorderLayout(30,20));
//		c.add(j1, BorderLayout.EAST);
//		c.add(j2, BorderLayout.WEST);
//		setSize(300,450);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyone(){
//		setTitle("third");
//		
//		JButton j1=new JButton("button1");
//		JButton j2=new JButton("button2");
//		
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		c.add(j1);
//		c.add(j2);
//		
//		j1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JButton jb = (JButton) e.getSource();
//				if(jb.getText().equals("button1")) {
//					jb.setText("button push");
//				}
//				else {
//					jb.setText("button1");
//				}
//			}
//		});
//		
//		j2.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if(c.getBackground() != null) {
//					c.setBackground(Color.gray);
//				}
//			}
//		});
//		
//		setSize(300,450);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
	
//	JLabel j = new JLabel("Hi HI HIGH");
//	ClassTwentyone(){
//		setTitle("fourth");
//		Container c = getContentPane();
//		c.add(j);
//		c.setLayout(null);// ��ġ������ ����
//		j.setSize(100,50);// ����ũ��
//		j.setLocation(30,50);// ���� ��ġ
//		j.addMouseListener(new MouseListener() {
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//			}
//			@Override
//			public void mousePressed(MouseEvent e) {
//				int x = e.getX(); //���콺 Ŭ���� ��ǥ
//				int y = e.getY();
//				j.setLocation(x,y);
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//			}
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//			}
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//			}
//		});
//		
//		setSize(450,300);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyone(){
//		setTitle("fifth");
//		Container c = getContentPane();
//		JButton j1 = new JButton("one");
//		JButton j2 = new JButton("two");
//		c.add(j1);
//		c.add(j2);
//		c.setLayout(new GridLayout());
//		j1.addMouseMotionListener(new MouseMotionListener() {
//			@Override
//			public void mouseMoved(MouseEvent e) {
////				System.out.println(e.getX()+" "+e.getY());
//			}
//			@Override
//			public void mouseDragged(MouseEvent e) {
//				System.out.println(e.getX()+" "+e.getY());
//			}
//		});
//		
//		setSize(600,500);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyone(){
//		setTitle("sixth");
//		Container c = getContentPane();
//		c.setBackground(Color.pink);
//		c.addMouseMotionListener(new Mouse());
//		c.addMouseListener(new Mouse());
//		setSize(450,300);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyone(){
//		setTitle("seventh");
//		JLabel j = new JLabel("java");
//		Container c = getContentPane();
//		c.add(j);
//		c.setLayout(new FlowLayout());
//		j.addMouseListener(new Mouse());
//		
//		setSize(300,500);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
////	1
//	ClassTwentyone(){
//		Container c = getContentPane();
//		c.setBackground(Color.blue);
//		
//		JButton j1 = new JButton("OK");
//		JButton j2 = new JButton("Cancel");
//		JButton j3 = new JButton("Get");
//		
//		j1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				c.setBackground(Color.orange);
//			}
//		});
//		j2.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				j2.setEnabled(false);
//			}
//		});
//		j3.addMouseListener(new M());
//		
//		c.add(j1);
//		c.add(j2);
//		c.add(j3);
//		c.setLayout(new FlowLayout());
//		
//		setSize(300,500);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyone(){
//		Container c = getContentPane();
//		JCheckBox j1 = new JCheckBox("java");
//		JCheckBox j2 = new JCheckBox("DB",true);
//		JCheckBox j3 = new JCheckBox("HTML");
//		
//		c.setLayout(new FlowLayout());
//		
//		c.add(j1);
//		c.add(j2);
//		c.add(j3);
//		
//		setSize(300,500);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyone(){
//		Container c = getContentPane();
//		JCheckBox j1 = new JCheckBox("java");
//		c.setLayout(new FlowLayout());
//		c.add(j1);
//		j1.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					System.out.println("java is fun");
//				}
//			}
//		});
//		setSize(300,500);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyone(){
//		Container c = getContentPane();
//		JCheckBox[] jcheck = new JCheckBox[15];
//		
//		c.setLayout(new GridLayout(3,5));
//		
//		for(int i=0;i<jcheck.length;i++) {
//			jcheck[i] = new JCheckBox("üũ"+(i+1));
//			c.add(jcheck[i]);
//		}
//		
//		setSize(500,250);
//		setVisible(true);
//	}
	
//	ClassTwentyone(){
//		Container c = getContentPane();
//		
//		//1
//		JMenuBar j = new JMenuBar();
//		
//		//2
//		JMenu j1 = new JMenu("File");
//		JMenu j2 = new JMenu("Edit");
//		JMenu j3 = new JMenu("Source");
//		JMenu j4 = new JMenu("Help");
//		
//		//3
//		JMenuItem j5 = new JMenuItem("New");
//		JMenuItem j6 = new JMenuItem("Undo Typing");
//		
//		//4
//		setJMenuBar(j);
//		j.add(j1);
//		j.add(j2);
//		j.add(j3);
//		j1.add(j5);
//		j2.add(j6);
//		
//		j5.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("new");
//			}
//		});
//		
//		setSize(450,300);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyone(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		JLabel jl = new JLabel("HIGH");
//		c.add(jl);
//		ImageIcon i = new ImageIcon("C://Users//agdis//OneDrive//���� ȭ��//pexels-anna-shvets-4586887.jpg");
//		JLabel j1 = new JLabel(i,SwingConstants.CENTER);
//		c.add(j1);
//		JLabel j2 = new JLabel("TuesDay");
//		c.add(j2);
//		
//		setSize(1600,900);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
//	ClassTwentyone(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		
//		//�ϳ��� �����ϱ����� ��ư�׷��� �ʿ�
//		ButtonGroup g = new ButtonGroup();
//		JRadioButton j1 = new JRadioButton("java");
//		JRadioButton j2 = new JRadioButton("DB");
//		g.add(j1);
//		g.add(j2);
//		
//		c.add(j1);
//		c.add(j2);
//		
//		setSize(900,450);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	

//	JRadioButton j1 = new JRadioButton("Tom");
//	JRadioButton j2 = new JRadioButton("Bob");
//	ClassTwentyone(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(j2);
//		bg.add(j1);
//		c.add(j1);
//		c.add(j2);
//		
//		A a = new A();
//		j1.addItemListener(a);
//		j2.addItemListener(a);
//		
//		setSize(900,450);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//	class A implements ItemListener{
//		@Override
//		public void itemStateChanged(ItemEvent e) {
//			if(e.getStateChange() != ItemEvent.SELECTED) {
//				return;
//			}
//			if(e.getItem() == j1) {
//				System.out.println("Tom");
//				getContentPane().setBackground(Color.LIGHT_GRAY);
//			}
//			else if(e.getItem() == j2) {
//				System.out.println("Bob");
//				getContentPane().setBackground(Color.pink);
//			}
//		}
//	}
	
//	ClassTwentyone(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		JButton b1 = new JButton("button");
//		JRadioButton rab1 = new JRadioButton("��Ȱ��ȭ");
//		JRadioButton rab2 = new JRadioButton("���߱�");
//		rab1.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					b1.setEnabled(false);
//				}
//				else {
//					b1.setEnabled(true);
//				}
//			}
//		});
//		rab2.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					b1.setVisible(false);
//				}
//				else {
//					b1.setVisible(true);
//				}
//			}
//		});
//		c.add(b1);
//		c.add(rab1);
//		c.add(rab2);
//		setSize(900,450);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
	ClassTwentyone(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�̸� :"));
		c.add(new JTextField(20));
		
		c.add(new JLabel("�ּ� :"));
		c.add(new JTextField(20));
		
		c.add(new TextArea());
		
		setSize(300,450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
//	ClassTwentyone(){
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		JLabel jl = new JLabel("Enter");
//		c.add(tf);
//		c.add(jl);
//		c.add(new JScrollPane(ta));
//		tf.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JTextField jt=(JTextField) e.getSource();
//				//TextArea�� textfield�� ���� ������ �߰��Ѵ�
//				ta.append(jt.getText()+"\n");
//				jt.setText(" ");//�ؽ�Ʈ�ʵ带�������� �ʱ�ȭ
//			}
//		});
//		
//		setSize(300,450);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//	JTextField tf = new JTextField(20);
//	JTextArea ta = new JTextArea(10,20);
	
////	2,3,4
//	ClassTwentyone(){
//		Container c = getContentPane();
//		c.setBackground(Color.red);
//		c.setLayout(new FlowLayout());
//		
//		JButton j1 = new JButton("OK");
//		JButton j2 = new JButton("Cancel");
//		j1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				j1.setText("Ȯ��");
//			}
//		});
//		j2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				j2.setEnabled(false);
//			}
//		});
//		JRadioButton rb1 = new JRadioButton("magenta");
//		JRadioButton rb2 = new JRadioButton("red");
//		rb1.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					c.setBackground(Color.magenta);
//				}
//			}
//		});
//		rb2.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					c.setBackground(Color.RED);
//				}
//			}
//		});
//		
//		JLabel j=new JLabel("Hi");
//		j.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				j.setText("�ȳ�");
//			}
//		});
//		
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(rb1);
//		bg.add(rb2);
//		
//		c.add(j1);
//		c.add(j2);
//		c.add(rb1);
//		c.add(rb2);
//		c.add(j);
//		
//		setSize(300,450);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	
	
	public static void main(String[] args) {
		new ClassTwentyone();
		
//		JFrame jframe = new JFrame();
//		jframe.setLayout(new GridLayout(0,1));
//		JCheckBox jc1 = new JCheckBox("study choose");
//		jframe.add(jc1);
//		JRadioButton rb1 = new JRadioButton("java");
//		JRadioButton rb2 = new JRadioButton("python");
//		JRadioButton rb3 = new JRadioButton("DB");
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(rb1);
//		bg.add(rb2);
//		bg.add(rb3);
//		jframe.add(rb1);
//		jframe.add(rb2);
//		jframe.add(rb3);
//		rb1.setEnabled(false);
//		rb2.setEnabled(false);
//		rb3.setEnabled(false);
//		//üũ�ڽ� ���ý� ��ư Ȱ��ȭ
//		jc1.addItemListener(new Check(rb1,rb2,rb3));
//		rb1.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					System.out.println("java");
//				}
//			}
//		});
//		rb2.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					System.out.println("python");
//				}
//			}
//		});
//		rb3.addItemListener(new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					System.out.println("DB");
//				}
//			}
//		});
//		jframe.setSize(450,300);
//		jframe.setVisible(true);
//		jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
////		5
//		int ary[];
//		ary=make();
//		for(int i=0;i<ary.length;i++){
//			System.out.print(ary[i] + " ");
//		}

////		6
//		Set<Person> s=new HashSet<Person>();
//		s.add(new Person(12, "ȫ�浿"));
//		s.add(new Person(23, "��浿"));
//		s.add(new Person(12, "�̱浿"));
//		Iterator<Person> it=s.iterator();
//		while(it.hasNext()){
//			Person p=it.next();
//			System.out.println(p.num + " " + p.name);
//		}
		
////		7
//		int a[]={1,2,3,4,5};
//		int b[]={6,7,8,9,10};
//		int c=add(a,5);
//		int d=add(a,5,b);
//		System.out.println(c);//1~5 sum
//		System.out.println(d);//1~10 sum
		
////		8
//		String s = "6.7";
//		double d = Double.parseDouble(s);
//		System.out.println(d);
		
//		JFrame frame = new JFrame("first");//������ ����
//		frame.setBounds(800, 100, 400, 300);//( x��ǥ, y��ǥ, �ʺ�, ���� )
//		System.out.println(frame.getBounds().getWidth());//double�������� ��ȯ
//		System.out.println(frame.getBounds().height);//int�� �Ӽ�
//		frame.setBackground(Color.BLUE);//���� ����
//		frame.setVisible(true);//true�� ������ ȭ�鿡 ������ ����
//		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		//x��ư���� ������ �ݱ�
//		//�������� ������ �ƿ� �޸𸮿��� ��������!
//		//�� ����� JFrame������ ��� �����ϸ� �Ϲ� Frame������ ����� �� ����.
//		
//		//�������� �������� ���ϴ� �ϳ��� �����Ӹ� �����ϰ��� �Ѵٸ� dispose()
//		//�����ִ� �������� ���� ������� ������ VM�� �����Ϸ��� System.exit(0)
//		//frame.dispose();	
		
//		/*
//		ȭ�� �߾ӿ� ������ ��ġ ��Ű��
//		1. ���� ���� ������� �ػ󵵸� �˾ƾ��Ѵ�.
//		2. ������� �߾� ��ǥ�� �˾Ƴ��� ��,,
//		3. ������ �¿� ũ�⸦ �߾� ��ǥ���� ������Ѵ�.
//			awt.Toolkit  <-- �̱���
//			Toolkit   beep()
//					  get����ͻ�����() <==!!!  width  height ��!@
//			
//			x : ����� �߾� ��ǥ�� -  ���� ������� ��������width/2  
//			y : ����� �߾� ��ǥ�� -  ���� ������� ��������height/2
//	 	*/
//		JFrame fr = new JFrame("����°");
//		fr.setSize(400, 400);
//			//Toolkit�� ���� ����� �ػ� ������
//		Toolkit tk = Toolkit.getDefaultToolkit();
//			/*for(int i=0; i<3; i++){
//				try { Thread.sleep(1000); } catch (Exception e) {}
//				tk.beep(); //1�� �������� ������ ���
//			}*/
//		Dimension di = tk.getScreenSize();
//		int monitorW=di.width;
//		int monitorH=di.height;
//
//		int x = monitorW/2-fr.getWidth()/2;
//		int y = monitorH/2-fr.getHeight()/2;
//
//		fr.setLocation(x, y);
//		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		fr.setVisible(true);
		

	}
	
	
//	ClassTwentyone(){
//		Container c=getContentPane();
//		c.setLayout(new FlowLayout());
//		
//		JButton j1=new JButton("��ư 1");
//		c.add(j1);
//		j1.addActionListener(new ActionListener() { // 1
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				j1.setBackground(Color.red);
//			}
//		});
//		j1.addActionListener(new M());// 2
//		
//		j1.addMouseListener(new MouseAdapter() { // 3 
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				j1.setBackground(Color.red);
//			}
//		});
//		setSize(300,200);
//		setVisible(true);
//	}
	
//	static int add(int[] a,int b){
//		int sum=0;
//		for(int i=0;i<b;i++) {
//			sum+=a[i];
//		}
//		return sum;
//	}
//	static int add(int[] a,int b,int[] c){
//		int sum=0;
//		for(int i=0;i<b;i++) {
//			sum+=a[i];
//			sum+=c[i];
//		}
//		return sum;
//	}
//	static int add(int[] a, int b, int[] c) {
//		int sum=0;
//		for(int cc:c) {
//			sum+=cc;
//		}
//		return sum+add(a,b);
//	}

//	private static int[] make() {
////		int[] arr = {0,1,2,3,4};
//		int[] arr = new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = i;
//		}
//		return arr;
//	}
}
//class M implements ActionListener{
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton j1=(JButton)e.getSource();
//		j1.setBackground(Color.red);
//	}
//}
//class Person{
//	int num;
//	String name;
//	public Person(int num, String name) {
//		this.num = num;
//		this.name = name;
//	}
//	@Override
//	public int hashCode() {
//		return num;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Person p = (Person) obj;
//		if(this.num == p.num) {
//			return true;
//		}
//		return false;
//	}
//}
//class Check implements ItemListener{
//	JRadioButton j1,j2,j3;
//	Check(JRadioButton j1, JRadioButton j2, JRadioButton j3){
//		this.j1=j1;
//		this.j2=j2;
//		this.j3=j3;
//	}
//	@Override
//	public void itemStateChanged(ItemEvent e) {	
//		if(e.getStateChange() == ItemEvent.SELECTED) {
//			j1.setEnabled(true);
//			j2.setEnabled(true);
//			j3.setEnabled(true);
//		}
//		else {
//			j1.setEnabled(false);
//			j2.setEnabled(false);
//			j3.setEnabled(false);
//		}
//	}
//}

//class M extends MouseAdapter{
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		System.out.println(e.getX()+" "+e.getY());
//	}
//}

//class Mouse extends MouseAdapter{
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		JLabel j = (JLabel) e.getSource();
//		j.setText("java is fun");
//	}
//	@Override
//	public void mouseExited(MouseEvent e) {
//		JLabel j = (JLabel) e.getSource();
//		j.setText("java");
//	}
//}
//class Mouse extends MouseAdapter implements MouseMotionListener {
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		Container c = (Container) e.getSource();
//		c.setBackground(Color.pink);
//	}
//	@Override
//	public void mouseDragged(MouseEvent e) {
//		Container c = (Container) e.getSource();
//		c.setBackground(Color.green);
//	}
//	@Override
//	public void mouseMoved(MouseEvent e) {
//	}
//}