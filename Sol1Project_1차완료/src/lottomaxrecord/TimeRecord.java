package lottomaxrecord;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import UI.LottoLogin;

public class TimeRecord implements maxRecord{
	private ArrayList<Integer> nlist = new ArrayList<>();
	private String count;
	private String select = "";
	
	private TimeRecord() {}
	
	public TimeRecord(String count) {
		this.count = count;
	}

	@Override
	public void countRecord() {
		try {
			Connection conn = LottoLogin.getConnection();
			Statement stmt = conn.createStatement();
			
			select = SelectQuery(count);
			ResultSet rset = stmt.executeQuery(select);
			
			while(rset.next()) {
				int i=rset.getInt(1);
				nlist.add(i);
				int j=rset.getInt(2);
				System.out.println("���� "+ i+"�� "+count+"���� ���� Ƚ�� "+ j);
			}
			
			NoneNum Nn = new NoneNum(nlist);
			
			if(Nn.getNoneNum().length() > 2) {
				System.out.println("��Ͽ� ���� ����" +
						Nn.getNoneNum() + "��(��) "+ count +"���� ������ �ʾҽ��ϴ�");
			}
			
		}catch(Exception er) {
			er.printStackTrace();
		}
	}

	@Override
	public String SelectQuery(String count) {
		switch (count) {
		case "��ü�Ⱓ" :
			select = "select * from copy_lotto_table_count_number_ASC";
			break;
		case "�ֱ� �Ѵ�" :
			select = "select * from copy_lotto_table_count_number_ASC_MONTH1";
			break;
		case "�ֱ� 3����" :
			select = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH3";
			break;
		case "�ֱ� 6����" :
			select = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH6";
			break;
		case "�ֱ� 1��" :
			select = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_YEAR1";
			break;
		}
		return select;
	}
	
	
	

}
