package ch24;

import java.util.ArrayList;

public class Student {
		String studentName;
		int studentId;
		
		ArrayList<Subject> subjectList;
		
		Student (int studentId, String StudentName){
			this.studentId = studentId;
			this.studentName = StudentName;
			
			subjectList = new ArrayList<>();
		}
		
		public void addsubject(String name, int point) {
			Subject subject = new Subject();
			subject.setName(name);
			subject.setScorePoint(point);
			
			subjectList.add(subject);
		}
				
		public void showScoreInfo() {
			int total = 0;
			
			for (Subject subject : subjectList) {
				total += subject.getScorePoint();
				System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScorePoint() + "입니다.");
			}
			System.out.println(studentName + "학생의 총점은 "+ total + "입니다.");
		}
}
