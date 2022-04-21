package Question33_60;

import java.util.ArrayList;

class WalkingBoy{
	int stepSize;
	int blockSize;
	WalkingBoy(int stepSize, int blockSize) 
	{
		this.stepSize=stepSize;
		this.blockSize=blockSize;
	}
	String targetHit(String platform) throws BombBlast
	{
		String a[]=new String[10];
		int n=platform.length()/blockSize;
		int rem=platform.length()%blockSize;
		for(int i=0;i<n;i++)
		{
			a[i]="";
			for(int j=0;j<blockSize;j++)
			{
				a[i]+=platform.charAt(i*blockSize+j);
			}
		}
		a[n]="";
		for(int i=platform.length()-rem;i<platform.length();i++)
		{
			a[n]+=platform.charAt(i);
		}

		ArrayList<String>aa=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=null)
				aa.add(a[i]);
		}
		;//package Question33_60;
		ArrayList<String> bb=new ArrayList<>();
		int n1;
		for(int i=0;i<aa.size();i++)
		{
			if(aa.get(i).length()<stepSize)
				n1=aa.get(i).length();
			else
				n1=stepSize;
			bb.add(aa.get(i).substring(0,n1));
		}
		
		boolean bomb=false;
		for(int i=0;i<bb.size();i++) 
		{
			if(bb.get(i).contains("x"))
			{
				bomb=true;
			}
		}
		if(bomb)
			throw new BombBlast("You hit the target");
		return "Win";
	}
}
class BombBlast extends Exception{
	BombBlast(String s)
	{
		super(s);
	}
}
public class Question43 {
	public static void main(String[] args) throws BombBlast {
		WalkingBoy b=new WalkingBoy(2, 3);
		String s1=b.targetHit("12121212");
		System.out.println(s1);
		
	}
}
