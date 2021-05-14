public class AddBottomLine {
	
	public static void main(String[] args) {
		String str = "Minimum Absolute Difference in an Array";
		str = str.replaceAll("[ :\\-]+", "_");
		
		System.out.println(str);
	}
	
}
