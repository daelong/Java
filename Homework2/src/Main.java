//�л��θ�Ŭ����
public class Student{
	private String name;
	protected int computer_Score;
	//�л�������
	Student(String name, int computer_Score)
	{
		this.name = name;
		this.computer_Score = computer_Score;
	}
	//�̸��˾Ƴ���
	public String getName()
	{
		System.out.println("�л��� �̸��� " + name);
		return name;
	}
	//��ǻ�ͼ�������
	public void modifity_computerScore(int score)
	{
		computer_Score = score;
		return;
	}
	//��վ˾Ƴ���
	double getAvg()
	{
		double avg = computer_Score;
		return avg;
	}
}
//�̰�Ŭ���� �ڽ�Ŭ����
public class ScienceStudent extends Student{
	int science_Score;
	//�̰��л� ������
	SciencesStudent(String name, int computer_Score, int science_Score){
		super(name, computer_Score);
		this.science_Score = science_Score;
	}
	//��վ˾Ƴ���
	double getAvg()
	{
		double avg = (computer_Score+ science_Score)/2;
		return avg;
	}
	//���м�������
	void modifity_Science(int score)
	{
		science_Score = score;
	}
}
//����Ŭ���� �ڽ� Ŭ����
public class LiberalStudent extends Student{
	int social_Score;
	//�����л�������
	LiberalStudent(String name, int computer_Score, int social_Score){
		super(name, computer_Score);
		this.social_Score = social_Score;
	}
	//��վ˾Ƴ���
	double getAvg()
	{
		double avg = (computer_Score + social_Score)/2;
		return avg;
	}
	//��ȸ��������
	void modifity_Social(int score)
	{
		social_Score = score;
		return;
	}
}
//1�г� �л� Ŭ����
public class Student_FirstGrade extends student{
	
	//1�г��л�������
	Student_FirstGrade(String name, int computer_Score){
		super(name, computer_Score);
	}
}
