package practice;

public class my {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog2 d=new Dog2();
d.strSplit();
	}
public String learnmaster4(){

	String dmo= "the ring";
	
	String h=dmo.replaceAll("-","\n");
	System.out.println(h);
String[] a=h.split("\\r\\n|\\n|\\r|\\s+");

	for(int x=0;x<a.length;x++){
	if(a[x].replaceAll("[^\\w|\\s+]","").matches(".*\\d+.*")){
	System.out.println(a[x]);
	}
	}
	return dmonmm;
}
}
