package basics.strings;

public class CompareStrings {

	public static void main(String[] args) {
		        String str = "";
		        str.concat(" World");  // Not stored
		        System.out.println("String (immutable): " + str);  // 

		        StringBuffer sb1 = new StringBuffer("");
		        sb1.append(" World");
		        System.out.println("StringBuffer (mutable): " + sb1);  //  World

		        StringBuilder sb2 = new StringBuilder("");
		        sb2.append(" World");
		        System.out.println("StringBuilder (mutable): " + sb2);  //  World
		    }
		}
