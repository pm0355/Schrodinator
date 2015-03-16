package schrodinator;

import java.math.BigDecimal;
import java.util.Scanner;

public class schrodinator {
public static void main(String[] args){
	
	//this program can be used to calculate wave equation, and other parameters of schrodinger's equation. based on given inputs. great for checking answers.
	/*sources cited: 
	 * 
	 * http://bcs.whfreeman.com/tiplermodernphysics4e/content/cat_020/GraphicalSolutionoftheFiniteSquareWell.pdf
	 * 
	 * http://hyperphysics.phy-astr.gsu.edu/hbase/quantum/pfbox.html#c1
	 * 
	 * http://physics.mq.edu.au/~jcresser/Phys201/LectureNotes/SchrodingerEqn.pdf
	 * 
	 * Modern Physics, Krane
	 */
	
	//some global nested values useful for later calculations
	BigDecimal  thirtyfour = BigDecimal.valueOf(10,-34);

	BigDecimal  sixteen = BigDecimal.valueOf(10,-16);
	double h_bar_js = 0.000000000000000000000000000000000105;
	double h_bar_eVs = 0.00000000000000065;
	double h_js = 0.00000000000000000000000000000000066;
	double h_eVs =0.0000000000000041356675; 
	double pi = 3.14;
	
/********
	//double k_naught = sqrt(2*m*E/h_bar_js^2);
	//double k_one= sqrt(2*m*E/h_bar_js^2);
	//double k=sqrt(2*m*E)/(h_bar_js^2);
******/
	
	//prompts user for type of equation
	System.out.println("Welcome to the Schrodinator! Please type in INF for Infinite Potential Energy Well, or F for Finite Energy Well to continue.: ");

	Scanner scan= new Scanner(System.in);
	String eq_type = scan.next();
	
	


//solves for variables of the Infinite Energy well problem.
//prompts user so as to solve for either a 1-d or 2-d well
	if(eq_type.equals("INF")){

		System.out.println("1 or 2 dimensions?: ");
		
		Scanner dscan = new Scanner(System.in);
		int D_s = dscan.nextInt();
		System.out.println("hint: Type 'none' into the variable you are trying to solve for");
//1-d algorithm
	if(D_s ==1){	
		System.out.println("Enter coefficient, A: ");
		Scanner a = new Scanner(System.in);
		String A = a.next();
		System.out.println("Enter boundry condition, L: ");
		Scanner l = new Scanner(System.in);
		String L = l.next();
		System.out.println("Enter principal quantum number, n: ");
		Scanner n = new Scanner(System.in);
		String n_d = n.next();
		System.out.println("Enter mass of particle, m: ");
		Scanner m = new Scanner(System.in);
		String m_d = m.next();
		System.out.println("Enter energy, E: ");
		Scanner e = new Scanner(System.in);
		String E = e.next();
	

		if(E.equals("none")){	//calculates energy
			double ndub = Double.parseDouble(n_d);													//calculates energy
			double mdub = Double.parseDouble(m_d);
			double Ldub = Double.parseDouble(L);
			double	Adub= Math.sqrt(2/Ldub);
		double E_dub=(h_js *h_js)*(ndub*ndub)/(8*mdub*Ldub*Ldub);
		System.out.println("Energy =" +E_dub);
		System.out.println("mass = " +mdub);
		System.out.println("n =" +ndub);
		System.out.println("L =" +Ldub);	
		System.out.println("coefficient, A= " +A);

		}

		
		if( m_d.equals("none"))	{			//calculates mass
			double ndub = Double.parseDouble(n_d);
			double Ldub = Double.parseDouble(L);
			double	Adub= Math.sqrt(2/Ldub);
			double Edub = Double.parseDouble(E);
				
		double mdub = (h_bar_js*h_bar_js*pi*pi*ndub*ndub)/(2*Ldub*Ldub);
		System.out.println("Energy =" +E);
		System.out.println("mass = " +mdub);
		System.out.println("n =" +ndub);
		System.out.println("L =" +Ldub);	
		System.out.println("coefficient, A= " +A);

		}
		
		if(n_d.equals("none")){				// calculates principal quantum number
			double mdub = Double.parseDouble(m_d);
			double Ldub = Double.parseDouble(L);
			double Edub = Double.parseDouble(E);
			double ndub = Math.sqrt((2*Edub*mdub*(Ldub*Ldub))/(h_bar_js*pi*pi));
			System.out.println("Energy =" +E);
			System.out.println("mass = " +mdub);
			System.out.println("n =" +ndub);
			System.out.println("L =" +Ldub);	
			System.out.println("coefficient, A= " +A);
		
		}
		if(L.equals("none"))		{	//calculates Length of well
			double mdub = Double.parseDouble(m_d);
			double Edub = Double.parseDouble(E);
			double ndub = Double.parseDouble(n_d);		
			double Ldub= Math.sqrt(((h_bar_js*h_bar_js*pi*pi*ndub*ndub)/(2*Edub*mdub)));
			System.out.println("Energy =" +E);
			System.out.println("mass = " +mdub);
			System.out.println("n =" +ndub);
			System.out.println("L =" +Ldub);	
			System.out.println("coefficient, A= " +A);
		}
		if(A.equals("none"))		{	//calculates Coefficient 
			double mdub = Double.parseDouble(m_d);
			double Edub = Double.parseDouble(E);
			double ndub = Double.parseDouble(n_d);		
			double Ldub= Double.parseDouble(L);
			double	Adub= Math.sqrt(2/Ldub);
			System.out.println("Energy =" +E);
			System.out.println("mass = " +mdub);
			System.out.println("n =" +ndub);
			System.out.println("L =" +L);	
			System.out.println("coefficient, A= " +Adub);
		}


		
	}
//2-d algorithm
	if(D_s==2){	
/*	System.out.println("Enter coefficient, A': ");
	Scanner A = new Scanner(System.in);
	Double A_prime = A.nextDouble();
	*/
		System.out.println("Enter coefficient, A: ");
		Scanner a_1 = new Scanner(System.in);
		String A_1 = a_1.next();
		
		System.out.println("Enter boundry condition, L: ");
		Scanner l_1 = new Scanner(System.in);
		String L_1 = l_1.next();
		System.out.println("Enter principal quantum number, nx: ");
		Scanner n_1 = new Scanner(System.in);
		String n_d_1 = n_1.next();
		System.out.println("Enter principal quantum number, ny: ");
		Scanner ny = new Scanner(System.in);
		String n_dy = ny.next();
		System.out.println("Enter mass of particle, m: ");
		Scanner m_1 = new Scanner(System.in);
		String m_d_1 = m_1.next();
		System.out.println("Enter energy, E: ");
		Scanner e_1 = new Scanner(System.in);
		String E_1 = e_1.next();
	if(E_1.equals("none")){
		double ndub = Double.parseDouble(n_d_1);	
		double nydub = Double.parseDouble(n_dy);	//calculates energy
		double mdub = Double.parseDouble(m_d_1);
		double Ldub = Double.parseDouble(L_1);
		double	Adub= (2/Ldub);
	double E_dub=(h_js *h_js)*(ndub*ndub+nydub*nydub)/(8*mdub*Ldub*Ldub);
	System.out.println("Energy =" +E_dub);
	System.out.println("mass = " +mdub);
	System.out.println("n =" +ndub);
	System.out.println("n =" +ndub);
	System.out.println("L =" +Ldub);	
	System.out.println("coefficient, A= " +Adub);
	

	}
	if( m_d_1.equals("none"))	{			//calculates mass
		double ndub = Double.parseDouble(n_d_1);	
		double nydub = Double.parseDouble(n_dy);	
		double Ldub = Double.parseDouble(L_1);
		double	Adub= Math.sqrt(2/Ldub);
		double Edub = Double.parseDouble(E_1);
	double mdub = (h_js *h_js)*(ndub*ndub+nydub*nydub)/(8*Edub*Ldub*Ldub);
	System.out.println("Energy =" +Edub);
	System.out.println("mass = " +mdub);
	System.out.println("nx =" +ndub);
	System.out.println("ny =" +nydub);
	System.out.println("L =" +Ldub);	
	System.out.println("coefficient, A= " +Adub);}
		
	if(L_1.equals("none"))		{	//calculates Length of well
		double mdub = Double.parseDouble(m_d_1);
		
		double Edub = Double.parseDouble(E_1);
		double ndub = Double.parseDouble(n_d_1);	
		double nydub = Double.parseDouble(n_dy);
		double Ldub= Math.sqrt(((h_bar_js*h_bar_js*pi*pi*(ndub*ndub+nydub*nydub))/(2*Edub*mdub)));
		double	Adub=2/Ldub;
		System.out.println("Energy =" +Edub);
		System.out.println("mass = " +mdub);
		System.out.println("n =" +ndub);
		System.out.println("n_y =" +n_dy);
		System.out.println("L =" +Ldub);	
		System.out.println("coefficient, A= " +Adub);
	}
	if(A_1.equals("none"))		{	//calculates coefficient 
		double mdub = Double.parseDouble(m_d_1);
		double Edub = Double.parseDouble(E_1);
		double ndub = Double.parseDouble(n_d_1);	
		double nydub = Double.parseDouble(n_dy);
		double Ldub= Double.parseDouble(L_1);
		double	Adub=2/Ldub;
		System.out.println("Energy =" +Edub);
		System.out.println("mass = " +mdub);
		System.out.println("n =" +ndub);
		System.out.println("n_y =" +n_dy);
		System.out.println("L =" +Ldub);	
		System.out.println("coefficient, A= " +Adub);}
		
	}}

	//Solves for Finite Energy Well. The bound conditions are 0 and a so solves the coefficients for odd and even solutions for the bounds 0<= x <= a.
	if(eq_type!="INF"){
		System.out.println("Enter boundry condition, a: ");
		Scanner a_2 = new Scanner(System.in);
	
		String L_2 = a_2.next();
		System.out.println("Enter principal quantum number, n: ");
		Scanner n_2 = new Scanner(System.in);
		String n_d_2 = n_2.next();
		System.out.println("Enter mass of particle, m: ");
		Scanner m_2 = new Scanner(System.in);
		String m_d_2 = m_2.next();
		System.out.println("Enter potential energy, U_naught: "); //prompts user for U_naught, where U_naught is not zero?
		Scanner U = new Scanner(System.in);
		String U_naught = U.next();
		System.out.println("Enter energy, E: ");
		Scanner e_2 = new Scanner(System.in);
		String E_2 = e_2.next();
	if(E_2.equals("none")){
		double ndub = Double.parseDouble(n_d_2);		//calculates energy
		double mdub = Double.parseDouble(m_d_2);
		double Ldub = Double.parseDouble(L_2);
		double E_dub=(h_js *h_js)*(ndub*ndub)/(8*mdub*Ldub*Ldub);
		double U_dub=Double.parseDouble(U_naught);
		double alpha = Math.sqrt(2*mdub*(U_dub-E_dub)/h_bar_js);
		double co_C =  Math.sqrt(2*mdub*E_dub/h_bar_js*h_bar_js)/Math.sqrt(2*mdub*U_dub/h_bar_js*h_bar_js)*Math.sqrt(alpha/(.5*alpha*Ldub +1));
		double co_D =  -co_C;
		
	System.out.println("Energy =" +E_dub);
	System.out.println("U =" +U_dub);
	System.out.println("mass = " +mdub);
	System.out.println("n =" +ndub);
	System.out.println("a =" +Ldub);	
	System.out.println("alpha =" +alpha);
	System.out.println("Even coefficient, C =" +co_C);	
	System.out.println("Odd coefficient, D =" +co_D);	

	}			
	if(m_d_2.equals("none")){
		double ndub = Double.parseDouble(n_d_2);		//calculates energy
		double Ldub = Double.parseDouble(L_2);
		double mdub = (h_bar_js*h_bar_js*pi*pi*ndub*ndub)/(2*Ldub*Ldub);
		double E_dub=(h_js *h_js)*(ndub*ndub)/(8*mdub*Ldub*Ldub);
		double U_dub=Double.parseDouble(U_naught);
		double alpha = Math.sqrt(2*mdub*(U_dub-E_dub)/h_bar_js);
		double co_C =  Math.sqrt(2*mdub*E_dub/h_bar_js*h_bar_js)/Math.sqrt(2*mdub*U_dub/h_bar_js*h_bar_js)*Math.sqrt(alpha/(.5*alpha*Ldub +1));
		double co_D =  -co_C;
		
	System.out.println("Energy =" +E_dub);
	System.out.println("U =" +U_dub);
	System.out.println("mass = " +mdub);
	System.out.println("n =" +ndub);
	System.out.println("a =" +Ldub);	
	System.out.println("alpha =" +alpha);
	System.out.println("Even coefficient, C =" +co_C);	
	System.out.println("Odd coefficient, D =" +co_D);	

	}	
	
	if(n_d_2.equals("none")){	{			// calculates principal quantum number
		double mdub = Double.parseDouble(m_d_2);
		double Ldub = Double.parseDouble(L_2);
		double Edub = Double.parseDouble(E_2);
		double U_dub=Double.parseDouble(U_naught);
		double ndub = Math.sqrt((2*Edub*mdub*(Ldub*Ldub))/(h_bar_js*pi*pi));
		double alpha = Math.sqrt(2*mdub*(U_dub-Edub)/h_bar_js);
		double co_C =  Math.sqrt(2*mdub*Edub/h_bar_js*h_bar_js)/Math.sqrt(2*mdub*U_dub/h_bar_js*h_bar_js)*Math.sqrt(alpha/(.5*alpha*Ldub +1));
		double co_D =  -co_C;
		System.out.println("U =" +U_dub);
		System.out.println("Energy =" +Edub);
		System.out.println("mass = " +mdub);
		System.out.println("n =" +ndub);
		System.out.println("a =" +Ldub);	
		System.out.println("alpha =" +alpha);
		System.out.println("Even coefficient, C =" +co_C);	
		System.out.println("Odd coefficient, D =" +co_D);	
	}
			
			if(L_2.equals("none"))		{		//calculates Length of well
			double mdub = Double.parseDouble(m_d_2);
			double U_dub=Double.parseDouble(U_naught);
			double Edub = Double.parseDouble(E_2);
			double ndub = Double.parseDouble(n_d_2);
			double Ldub= Math.sqrt(((h_bar_js*h_bar_js*pi*pi*ndub*ndub)/(2*Edub*mdub)));
			double	Adub=2/Ldub;
			double alpha = Math.sqrt(2*mdub*(U_dub-Edub)/h_bar_js);
			double co_C =  Math.sqrt(2*mdub*Edub/h_bar_js*h_bar_js)/Math.sqrt(2*mdub*U_dub/h_bar_js*h_bar_js)*Math.sqrt(alpha/(.5*alpha*Ldub +1));
			double co_D =  -co_C;
			System.out.println("U =" +U_dub);
		System.out.println("Energy =" +Edub);
		System.out.println("mass = " +mdub);
		System.out.println("n =" +ndub);
		System.out.println("L =" +Ldub);
		System.out.println("(even solution) coefficient C =" +co_C);
		System.out.println("(even solution) coefficient D =" +co_C);}
	}
			

	}}}

	

	
		
	




