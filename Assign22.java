
public class Assign22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		 char[] chars = new char[x];
		 for (int i = 0; i < x; i++) {
		 chars[i] = '*';
		 chars[x - 1 - i] = '*';
		 for (int j = 0; j < x; j++) 
		  {
		    if (j == i || j == (x - 1 - i)) 
		      {
		        continue;
		      }
		  chars[j] = '_';
		  }
		System.out.println(new String(chars));
		}

	}

}
