import java.util.*;

public class ejercicio1615 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);		
		int a, b, ma, me, cont=1;
		int digitos[] = new int[10];	
		
		while(true)
		{
			a = in.nextInt();
			if(a == 0) 
			{
			    break;
			 }
			b = in.nextInt();
			
            
			if(a > b){
				ma = a;
				me = b;
			}
			else{
				ma = b;
				me = a;
			}
              
			for(int i = me; i <= ma; i++){
				String aux = Integer.toString(i);
				for(int j = 0; j < aux.length(); j++){
					char c = aux.charAt(j);
					switch(c)
					{
						case '0':
							digitos[0] += 1;
							break;
						case '1':
							digitos[1] += 1;
							break;
						case '2':
							digitos[2] += 1;
							break;
						case '3':
							digitos[3] += 1;
							break;
						case '4':
							digitos[4] += 1;
							break;
						case '5':
							digitos[5] += 1;
							break;
						case '6':
							digitos[6] += 1;
							break;
						case '7':
							digitos[7] += 1;
							break;
						case '8':
							digitos[8] += 1;
							break;
						case '9':
							digitos[9] += 1;
							break;
					}	
				}
			}
	
			System.out.print("Case "+cont+": ");
			System.out.print("0:"+digitos[0]);
			digitos[0] = 0;
			for(int i = 1; i <= 9; i++){
				System.out.print(" "+i+":"+digitos[i]);
				digitos[i] = 0;
			}
			cont++;
			System.out.println();
		}

	}	
}