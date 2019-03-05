//학생부모클래스
public class Student{
	private String name;
	protected int computer_Score;
	//학생생성자
	Student(String name, int computer_Score)
	{
		this.name = name;
		this.computer_Score = computer_Score;
	}
	//이름알아내기
	public String getName()
	{
		System.out.println("학생의 이름은 " + name);
		return name;
	}
	//컴퓨터성적변경
	public void modifity_computerScore(int score)
	{
		computer_Score = score;
		return;
	}
	//평균알아내기
	double getAvg()
	{
		double avg = computer_Score;
		return avg;
	}
}
//이과클래스 자식클래스
public class ScienceStudent extends Student{
	int science_Score;
	//이과학생 생성자
	SciencesStudent(String name, int computer_Score, int science_Score){
		super(name, computer_Score);
		this.science_Score = science_Score;
	}
	//평균알아내기
	double getAvg()
	{
		double avg = (computer_Score+ science_Score)/2;
		return avg;
	}
	//과학성적변경
	void modifity_Science(int score)
	{
		science_Score = score;
	}
}
//문과클래스 자식 클래스
public class LiberalStudent extends Student{
	int social_Score;
	//문과학생생성자
	LiberalStudent(String name, int computer_Score, int social_Score){
		super(name, computer_Score);
		this.social_Score = social_Score;
	}
	//평균알아내기
	double getAvg()
	{
		double avg = (computer_Score + social_Score)/2;
		return avg;
	}
	//사회성적변경
	void modifity_Social(int score)
	{
		social_Score = score;
		return;
	}
}
//1학년 학생 클래스
public class Student_FirstGrade extends student{
	
	//1학년학생생성자
	Student_FirstGrade(String name, int computer_Score){
		super(name, computer_Score);
	}
}
