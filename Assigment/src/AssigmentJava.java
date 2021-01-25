

import java.util.Scanner;

public class AssigmentJava {

	public static void main(String[] args) {
		
		
		//---------------------- PART I -------------
		// PART 1  (1-7)
		// status (finished)
		
				int[] winnerNum = new int[10];
				//int[] UserNumb = new int[5];
				int total=0;
				Scanner in = new Scanner(System.in);
				int num, aux=0, e=0;		
				int repeat = 0;

//GENERATE THE 10 RANDOM NUMBERS				
				for(int i=0; i<winnerNum.length; i++){
					repeat = 1;
					while (repeat != 0){
						repeat = 0; 
						double randNum = (Math.random())*(99 - 0)+1;
						aux= (int)randNum; 
						for(e=0; e<i; e++){ 
							if(aux == winnerNum[e]){
								repeat = 1; 
								break;
							}//if 
							
							else {
								winnerNum[i] = aux;
								
							}//else
							
						}//for e

			

					}//while 
					
					winnerNum[i] = aux;
					total=total+(int)winnerNum[i]; //sum of winnerNumbers

				}//for

						
//print the winner numbers						 
						System.out.println("the winners number are: ");
						for(e=0;e<winnerNum.length;e++) {
							if(winnerNum[e]<10) {
								System.out.print("0"+winnerNum[e]+" ");
							}
								else {
								System.out.print(winnerNum[e]+" ");
								
								}
						
						}	
				
						System.out.println("\nthe sum of the winners numbers "+total);

						
						
//--------------------- PART II -------------------
// PART 2  (2-7)
// status (finished)
				
				
				int ResultSum,PrizeWin  ;
				int sumPrize, contPrizeSum1 = 0, contPrizeSum2=0, contPrizeSum3=0, contPrizeSum4=0, contPrizeSum5=0;
				int sum1 = 10, sum2=20, sum3=50, sum4=200, sum5=1000;
				int UserWins = 0;
				
				
				System.out.println("\nHow lucky are you? ");
				System.out.println("This is a bonus game, get some prizes, if the same prize appears more than once you WIN that Sum");
				
			
				for(int t=0; t<=3;t++ ) {
				double randSum = (Math.random())*(100 - 0)+1;
				ResultSum = (int)randSum;
				
					
					if(ResultSum>0 && ResultSum<=50 ) {
						
						
						System.out.print((int)sum1+ "€ " );
						contPrizeSum1++;									
					}
				
						else if(ResultSum>=50 && ResultSum<77) {
							
							System.out.print((int)sum2+ "€ " );
							contPrizeSum2++;	
						}
						
					else if(ResultSum>=77 && ResultSum<92 ) {
						
						System.out.print((int)sum3+ "€ " );
						contPrizeSum3++;
						}
					
					else if(ResultSum>=92 && ResultSum<98) {
						
						System.out.print((int)sum4+ "€ " );
						contPrizeSum4++;
						}
					
					else if(ResultSum>=98) {
						
						System.out.print((int)sum5+ "€ " );
						contPrizeSum5++;
						}
					
				
		}//for to prize stage
				int g=0;
				int aux2=0; //variable to defyne the sum winner
				//compare and find the prize the appears more than once and print it
				if(contPrizeSum1>contPrizeSum2 &&
						contPrizeSum1>contPrizeSum3 &&
						contPrizeSum1>contPrizeSum4 &&
						contPrizeSum1>contPrizeSum5) {
					
					System.out.println("\nyou got "+sum1+"€");
					UserWins=UserWins+sum1;
					aux2 = sum1;
				
					
				}
				
				else if(contPrizeSum2>contPrizeSum1 &&
						contPrizeSum2>contPrizeSum3 &&
						contPrizeSum2>contPrizeSum4 &&
						contPrizeSum2>contPrizeSum5) {
					
					System.out.println("\nyou got "+sum2+"€");
					UserWins=UserWins+sum2;
					aux2 = sum2;
				}
				
				else if(contPrizeSum3>contPrizeSum1 &&
						contPrizeSum3>contPrizeSum2 &&
						contPrizeSum3>contPrizeSum4 &&
						contPrizeSum3>contPrizeSum5) {
				
						System.out.println("\nyou got "+sum3+"€");
						UserWins=UserWins+sum3;
						aux2 = sum3;
				
				}
				
				else if(contPrizeSum4>contPrizeSum1 &&
						contPrizeSum4>contPrizeSum2 &&
						contPrizeSum4>contPrizeSum3 &&
						contPrizeSum4>contPrizeSum5) {
					
					System.out.println("\nYou got "+sum4+"€");
					UserWins=UserWins+sum4;
					aux2 = sum4;
				}
				else if(contPrizeSum5>contPrizeSum1 &&
						contPrizeSum5>contPrizeSum2 &&
						contPrizeSum5>contPrizeSum3 &&
						contPrizeSum5>contPrizeSum4) {
					
					System.out.println("\nYou got "+sum5+"€");
					UserWins=UserWins+sum5;
					aux2 = sum5;
				}
				
//if we get 10 10 = 20 20 / 50 50 / 200 200 / 1000 1000 
				
				else if(contPrizeSum1==contPrizeSum2){	
				
					g=Math.max(sum1,sum2);
					UserWins=UserWins+g;
					aux2 = g;
					System.out.println("\nYou got "+g+"€");		
					}
				
				else if(contPrizeSum1==contPrizeSum3){	
					
					g=Math.max(sum1,sum3);
					UserWins=UserWins+g;
					aux2 = g;
					System.out.println("\nYou got "+g+"€");		
					}
				
				else if(contPrizeSum1==contPrizeSum4){	
					
					g=Math.max(sum1,sum4);
					UserWins=UserWins+g;
					aux2 = g;
					System.out.println("\nYou got "+g+"€");		
					}
				
				else if(contPrizeSum1==contPrizeSum5){	
					
					g=Math.max(sum1,sum5);
					UserWins=UserWins+g;
					aux2 = g;
					System.out.println("\nYou got "+g+"€");		
					}
	
//if we get  20 20 = 50 50 / 200 200 / 1000 1000 				
				else if(contPrizeSum2==contPrizeSum3){	
					
					g=Math.max(sum2,sum3);
					UserWins=UserWins+g;
					aux2 = g;
					System.out.println("\nYou got "+g+"€");		
					}
				
				else if(contPrizeSum2==contPrizeSum4){	
					
					g=Math.max(sum2,sum4);
					UserWins=UserWins+g;
					aux2 = g;
					System.out.println("\nYou got "+g+"€");		
					}
				
				else if(contPrizeSum2==contPrizeSum5){	
					
					g=Math.max(sum2,sum5);
					UserWins=UserWins+g;
					aux2 = g;
					System.out.println("\nYou got "+g+"€");		
					}
				
//if we get 50 50  =  200 200 / 1000 1000 				
				else if(contPrizeSum3==contPrizeSum4){	
					
					g=Math.max(sum3,sum4);
					UserWins=UserWins+g;
					aux2 = g;
					System.out.println("\nYou got "+g+"€");		
					}
				
				else if(contPrizeSum3==contPrizeSum5){	
					
					g=Math.max(sum3,sum5);
					UserWins=UserWins+g;
					aux2 = g;
					System.out.println("\nYou got "+g+"€");		
					}
				
				
//if we get 200 200  =  / 1000 1000				
				else if(contPrizeSum4==contPrizeSum5){	
					
					g=Math.max(sum4,sum5);
					UserWins=UserWins+g;
					aux2 = g;
					System.out.println("\nYou got "+g+"€");		
					}
				
				else if(contPrizeSum4==contPrizeSum5){	
					
					g=Math.max(sum4,sum5);
					UserWins=UserWins+g;
					aux2 = g;
					System.out.println("\nYou got "+g+"€");		
					}
				
				
				else {
					System.out.println("\nOh no!, You're unlucky, any prize appeared more than once. you did not get anything!");
					aux2 = 0;
				}
				//what about either of the prize numbers appeard more than once?
				
				
//--------------------------- PART III -------------------------------------
// PART 3  (3-7)
// status (finished)
				
				int[] UserNumb = new int[5];
				int somaUser = 0; 
				System.out.println("\nEnter with 5 number");
	
		for(int i=0; i<UserNumb.length; i++){
			repeat = 1; //flag = on
			while (repeat != 0){
				repeat = 0; // I set flag=off after while
				System.out.println("Tap a number");
				aux= in.nextInt();
				for(e=0; e<i; e++){ // for goes until i (i is the total elements in a array so far)
					if(aux == UserNumb[e]){
						System.out.println("Number already in, tap another one");
						repeat = 1; //if aux = any number in the array, flag = on
						break; // stop for and repete while asking for a new number
					} // end if
					
					else {
						UserNumb[i] = aux;
						
						}
				} // end for 
			} //end while
			UserNumb[i] = aux; //save the value of aux in array and ask for another number

		}

				
				 //show user numbers
				System.out.println("your number are: ");
				for(e=0;e<5;e++) {
				System.out.print(UserNumb[e]+" ");
				}	
				
				
				
//-------------------------- PART IV ---------------------		
// PART 4  (4-7)
// status (finished)
			
	
//CHECK HOW MANY NUMBER THE USER GETS RIGHT
				int score=0;
				int[] foundNumb = new int[5];

				for(e=0;e<UserNumb.length;e++) {
					for(int a=0; a<winnerNum.length;a++) {
						if(UserNumb[e]==winnerNum[a]) {
							System.out.println("\n"+UserNumb[e]+" was found = " +winnerNum[a] );
							score++;
							foundNumb[e]=UserNumb[e];
							break;
							
						}
					
					}	
				}	
						

//first way to check how much users won

				int cash1=0;
				
				switch(score) {
				case 1: 
					System.out.println("You won €1.000");
					cash1=1000;
					break;
					
				case 2:
					System.out.println("You won €6.000");
					cash1=6000;
					break;
				
				case 3:
					System.out.println("You won €25.000");
					cash1=25000;
					break;
				
				
				case 4:
					System.out.println("You won €100.000");
					cash1=100000;
					break;				
				
				case 5:
					System.out.println("You won €800.000");
					cash1=800000;
					break;
				
				
				}//switch		

				System.out.println("You have won €"+cash1+" because you guested "+score+" numbers right");				
				
				
				
				
				
//--------------------- PART V -----------------------
// PART v  (5-7)
// status (unfinished)		
				
				
			int cash2=0;
			/*int sequencia = 0, aux3=0;
			for(e=0;e<UserNumb.length;e++) {
				for(int a=0; a<winnerNum.length;a++) {	
					for(int l=1;l<UserNumb.length; l++) {
						for(int t=1;t<winnerNum.length; t++) {
							
							if(UserNumb[e]==winnerNum[a]) {		
								if(UserNumb[l]==winnerNum[t]) {
									//System.out.println(UserNumb[l]+" = " + winnerNum[t]);
									sequencia++;
									aux3=+sequencia;
									if(sequencia > aux3) {
										aux3 = sequencia;
									}
								
									else {
										sequencia=aux3;
									}
									
									}//if 
									}
							
							else {
								break;
							}
							
							
							
								}
									
								//}//if e+l
														
							
					//}//if t
				}//if l
				
				}	
			}
			
			System.out.println("sequencia "+aux3);
			*/
			
			
//--------------------- PART VI ------------------------
// PART 6  (6-7)
// status (finished)
			
			
				int cash3=0; //third way to win
				int tap;
						

				int SumGess=0;
				System.out.println("\n\n Guess what the sum of all ten winning numbers");
				SumGess = in.nextInt();
				
				if(SumGess==total) {
					cash3=300000;
					System.out.println("Oooooooooh yes!, that is right! the sum of the winner numbers is "+total+" you €"+cash3);
			
				
				}
				
				else {
				
					System.out.print("\nOh no...it's wrong... the sum of the winner numbers is "+total);
				}
				
				
//-------------- PART VII ----------------------
// PART 1  (1-7)
// status (finished)
				
				
//check the higthest prize
				int GreatestPrize;

				GreatestPrize = Math.max(cash1, cash2);
				GreatestPrize = Math.max(GreatestPrize, cash3);
				UserWins=UserWins+GreatestPrize;
											
		
				System.out.println("\n\n");
				System.out.println("You could win in 3 different ways + bunos games, but you will get only the highest prize: ");
				System.out.println("Bonus: at the bonus game you won "+aux2);

//for -- show the user the numbers guessed but dont show if the array[i] = null				
				System.out.println("1 - You've got "+score+ " numbers right amoung the ten winning numbers ");
				System.out.print("Numbers: ");
				for(int i=0;i<foundNumb.length;i++) {
					if(foundNumb[i]==0) {
						
					}
					
				else{
					System.out.print(+foundNumb[i]+" ");
				}
				
				}//END FOR
				System.out.println("\nYou've got  €"+cash1);
				
				System.out.println("2 - UNFINISHED "+cash2+"€");
				
				//if the user had guessed the sum of winning number show the cash, else dont.
				if(SumGess==total) {
					cash3=300000;
					System.out.println("3 - You've guessed the sum of the winning numbers, the sum was "+total+" \nso you've got  €"+(double)cash3);
				}
				
				else {				
					System.out.print("3- You have not guessed the sum of the winning numbers, the sum was "+total+"\n so you did not get any money ");
				}
				
				
				System.out.println("\n\n ************The highest prize +bunos game is €"+UserWins+"***************");
				
				
				}//2 main
			}//main
