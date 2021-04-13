package mydolist;

class Parents {
	int compute(int num) {
		if(num<=1) return num;
		return compute(num-1) + compute(num-2);
	}
}

class Childs extends Parents{
	int compute(int num)  {
		if(num<=1) return num;
		return compute(num-1) + compute(num-3);
	}
}

public class Exam6 {
	public static void main(String[] args) {
		Parents obj = new Childs();
		System.out.print(obj.compute(4));
	}
}
