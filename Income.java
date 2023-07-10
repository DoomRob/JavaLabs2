//*monthly wage and weekly hours and calculates how much they make per year and per hour*//
/*
/ Lab Income
/ Date: 01/06/2022
/ Author: Robert Gannon
*/

import javax.swing.JOptionPane;
public class Income{
	public static void main(String[] args){
		//valariables
		int monthlywages;
		int weeklyhours;
		int peryear;
		int perhour;

		//input
		monthlywages=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter how much you earn a month?"));
		weeklyhours=Integer.parseInt(JOptionPane.showInputDialog(null,"How many hours do you work?"));

		//process
		peryear=monthlywages*12;
		perhour=(peryear/52/weeklyhours);

		//output
		JOptionPane.showMessageDialog(null,"Your Total Income per year is "+peryear);
		JOptionPane.showMessageDialog(null,"Your wages per hour are "+perhour);
	}
}