
public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean is_pal(int[] num, int size) {
		int l=0; int r = size-1;
		while(l<r) {
			if(num[l++] != num[r--]) {
				return false;
			}
		}
		return true;
	}
	public int static check(int[] num, int index, int len) {
		
		if(len==1) {
			num[0] = 0;
			num[1] = 1;
		}
		else {
			for(int i=0; i<Math.pow(2, len-1); i++) {
				num[index] = 10*(len-1) + num[i];
				if(is_pal(num, len))
					System.out.println(num[index]);
			}
		}
		return check(num, index++, len++);
	}
}
