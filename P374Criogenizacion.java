import java.util.Scanner;

public class P374Criogenizacion {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int casos, vecesmax=0, vecesmin=0;
		long temp, max, min;

		//Se le
		casos=scn.nextInt();

		for(int i=0;i<casos;i++) {
			//Inicializar las variables para cada caso nuevo
			max=Long.MIN_VALUE;
			min=Long.MAX_VALUE;
			
			do{
				temp=scn.nextLong();
				//Se comprobara que la temperatura no sea 0
				if(temp!=0) {
					//La temperatura es mayor que el actual maximo
					if(temp>max) {
						max=temp;
						vecesmax=1;
					}
					//La temperatura es igual que el mayor actual
					else if(temp==max) {
						vecesmax++;
					}
					//La temperatura es menor que el actual minimo
					if(temp<min) {
						min=temp;
						vecesmin=1;
					}
					//La temperatura es igual que el menor actual
					else if(temp==min) {
						vecesmin++;
					}
				}
			}while(temp!=0); //Terminara cuando lea un 0
			
			System.out.println(min+" "+vecesmin+" "+max+" "+vecesmax);
		}

	}

}
