public class StringExemples {

	public static void main(String[] args) {
	   String txt;
		
	   txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	   System.out.println("Comprimeto de [" + txt + "] = " + txt.length());
		
	   txt = "Ol� Mundo!";
	   System.out.println(txt.toUpperCase());   // Sa�da = "OL� MUNDO!"
	   System.out.println(txt.toLowerCase());   // Sa�da = "ol� mundo"
		
	   txt = "Localize a posi��o da palavra 'eureka' neste texto!";
	   System.out.println(txt.indexOf("eureka")); // Sa�da = 31
	}
}