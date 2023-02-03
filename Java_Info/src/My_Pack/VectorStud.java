package My_Pack;

public class VectorStud 
{
	private int no;
	private String name;
	
	
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public VectorStud(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}


	public static void main(String[] args) 
	{

		
	}


	@Override
	public String toString() {
		return " no = " + no + " name = " + name ;
	}

}
