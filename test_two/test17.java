package test_two;

//17-2
public class test17{
	public static void main(String[] args){
		Color c=Color.getInstance(1);
		System.out.println(c.getName());
	}
}
////17-1
class Color {
	private String name;
	public static final Color red=new Color("ºìÉ«");
	public static final Color green=new Color("ÂÌÉ«");
	public static final Color blue=new Color("À¶É«");
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	private Color(String name){
		this.setName(name);
	}
//	public interface Color{
//		public static final int red=0;
//		public static final int green=1;
//		public static final int blue=2;
//	}
	public static Color getInstance(int i){
		if(i==0){
			return red;
		}
		if(i==1){
			return green;
		}
		if(i==2){
			return blue;
		}
		return null;
	}
}
