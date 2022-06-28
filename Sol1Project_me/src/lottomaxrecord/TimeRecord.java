package lottomaxrecord;

import java.util.ArrayList;

public class TimeRecord implements maxRecord{
	private ArrayList<Integer> nlist = new ArrayList<>();
	private String count;
	private String select = "";
	private TimeRecord() {}
	
	public TimeRecord(String count) {
		this.count = count;
	}

	@Override
	public String SelectQuery(String count) {
		switch (count) {
		case "��ü�Ⱓ" :
			select = "select * from admin.copy_lotto_table_count_number_ASC";
			break;
		case "�ֱ� �Ѵ�" :
			select = "select * from admin.copy_lotto_table_count_number_ASC_MONTH1";
			break;
		case "�ֱ� 3����" :
			select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH3";
			break;
		case "�ֱ� 6����" :
			select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH6";
			break;
		case "�ֱ� 1��" :
			select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_YEAR1";
			break;
		}
		return select;
	}

	

	
	
	
	

}
