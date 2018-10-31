public class DasarSatu
{
	int  varUmur;

	public DasarSatu(String name)
	{
		 // Constructor
		System.out.println("My Name is :" + name);
	}

	public static void main(String []args)
	{
		DasarSatu myName = new DasarSatu("Dedi");

		myName.setUmur(25);

		myName.getUmur();
	}

	public void setUmur(int umur)
	{
		varUmur = umur;
	}

	public int getUmur()
	{
		System.out.println("Umurku adalah :" + varUmur);
		return varUmur;
	}
}
