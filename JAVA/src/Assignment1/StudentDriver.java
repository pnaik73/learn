package Assignment1;

public class StudentDriver {

	public static void main(String[] args) {
		Student []s=new Student[5];	
		s[0]=new Student("Tom",1);
		s[1]=new Student("James",2);
		s[2]=new Student("Jones",3);
		s[3]=new Student("Allen",4);
		s[4]=new Student("King",5);
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
	}
}
