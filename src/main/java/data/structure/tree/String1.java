package data.structure.tree;

public class String1 {

	public static void main(String[] args) {
		String s = "122556";
		char[] cs = s.toCharArray();
		StringBuffer sb = new StringBuffer(s.length());
		for (int i = cs.length-1; i >= 0 ; i--) {
			sb.append(cs[i]);
		}
		System.out.println(sb.toString());
	}
}
