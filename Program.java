public class Program{
	public static void main(String[] args){
		int fim = 10;
		for(int i = 1; i<=fim; i++){
			if(i < fim-1){
				System.out.print(i + ", ");
			}
			else if(i == fim-1){
				System.out.print(i);
			}
			else{
				System.out.print(" ou " + i + "\n");
			}
		}
			
	}
}
