public class MPattern {
	public static void main(String[] args) {
	int num = 5;
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=num;j++) {
			if(j ==1 || j==num || (i==j && i<=num/2) ||(i+j == num+1 && i<=num/2) || (i==(num/2)+1 && j==(num/2)+1) )System.out.print("*  ");
			else System.out.print("   ");
		}System.out.println();
	}

}
}