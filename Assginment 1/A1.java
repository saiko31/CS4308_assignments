/*
	Alexander San Agustin Melendez
	Assingment 1 Source Code
	CS 4308 : Concepts of Programming Languages - S01
	Emin Mary Abraham
*/



import java.util.Random;


public class ComplexNum{
	
	int real, img;


	ComplexNum(int a, int b){
		this.real = a;
		this.img = b;
	}


	public String print(){
		return this.real + "+" + this.img + "i";
	}



	public static ComplexNum sum(ComplexNum a, ComplexNum b){

		ComplexNum res = new ComplexNum(0,0);

		res.real = a.real + b.real;
		res.img = a.img + b.img;

		return res;
	}

	public static ComplexNum substract(ComplexNum a, ComplexNum b){

		ComplexNum res = new ComplexNum(0,0);

		res.real = a.real - b.real;
		res.img = a.img - b.img;

		return res;
	}


	public static ComplexNum multiplication(ComplexNum a, ComplexNum b){

		// Formula -> (ac - bd) + (ad + bc)i

		ComplexNum res = new ComplexNum(0,0);

		res.real = (a.real * b.real) - (a.img * b.img);
		res.img = (a.real * b.img) + (a.img * b.real);

		return res;
	}

	//Division Pending



	public static void main(String[] args){

		Random r = new Random();

		ComplexNum c1 = new ComplexNum(r.nextInt(99),r.nextInt(99));
		ComplexNum c2 = new ComplexNum(r.nextInt(99),r.nextInt(99));

		System.out.println("Random Complex Number 1: " + c1.print());
		System.out.println("Random Complex Number 2: " + c2.print());
		System.out.println();



		ComplexNum resultSum = sum(c1,c2);
		System.out.println(c1.print() +  " + " +  c2.print() + " = " + resultSum.print());

		ComplexNum resultSubs = substract(c1,c2);
		System.out.println(c1.print() +  " - " +  c2.print() + " = " + resultSubs.print());

		ComplexNum resultMult= multiplication(c1,c2);
		System.out.println(c1.print() +  " * " +  c2.print() + " = " + resultMult.print());




	}
}

