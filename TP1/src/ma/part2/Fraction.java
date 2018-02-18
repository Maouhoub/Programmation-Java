package ma.part2;

import java.math.BigInteger;
/**
 * 
 * @author MUSTAPHA
 * Cette classe représente les fractions sous forme de numerateur/denominateur
 * 
 */
public class Fraction 
{   
	/**
	 * numérateur et dénominateur de la fraction
	 */
	private BigInteger numerateur, denominateur;
	
	
	/**
	 * constructeur par défaut
	 */
	public Fraction()
	{
		this.numerateur = BigInteger.valueOf(1);
		this.denominateur =BigInteger.valueOf(1);
	}
	
	/**
	 * constructeur1 (surchargé)
	 * @param num numerateur de la fraction, instance de BigInt
	 * @param den denominateur de la fraction, instance de BigInt
	 */
	public Fraction(BigInteger num, BigInteger den) 
	{ 
		this.numerateur = num;
		this.denominateur = den;
	}
	
	/**
	 * constructeur2 (surchargé)
	 * @param n numerateur de type int
	 * @param d denominateur de type int
	 */
	
	public Fraction(int n, int d) 
	{ 
		this.numerateur = BigInteger.valueOf(n);
		this.denominateur = BigInteger.valueOf(d);
	}
	
	/**
	 * constructeur3 (surchargé)
	 * @param n numerateur et dénominateur de type int
	 */
	
	public Fraction(int n) 
	{
		this.numerateur = BigInteger.valueOf(n);
		this.denominateur = BigInteger.valueOf(1);
		
	}
	
	/**
	 * addition de deux fractions
	 * @param f fraction qu'on  ajoute à la fraction appelante.
	 * @return objet de type Fraction représentant "this + f"
	 */
	public Fraction add(Fraction f) 
	{  
		Fraction fr = new Fraction();
		fr.numerateur = this.numerateur.multiply(f.denominateur).add(f.numerateur.multiply(f.denominateur));
		fr.denominateur = this.denominateur.multiply(f.denominateur);
		return fr;
	}
	
	/**
	 * soustraction de deux fractions
	 * @param  f fraction qu'on  soustrait de la fraction appelante.
	 * @return objet de type Fraction représentant "this - f"
	 */
	public Fraction sub(Fraction f) 
	{  Fraction fr = new Fraction();
		fr.numerateur = this.numerateur.multiply(f.denominateur).subtract(f.numerateur.multiply(f.denominateur));
		fr.denominateur = this.denominateur.multiply(f.denominateur);
		return fr;
	}
	
	/**
	 * multiplier deux fractions
	 * @param f  fraction qu'on  multiplie avec fraction appelante
	 * @return objet de la classe Fraction représentant "this * f"
	 */
	public Fraction mult(Fraction f) 
	{
		Fraction fr = new Fraction(this.numerateur.multiply(f.numerateur), this.denominateur.multiply(f.denominateur));
		return fr;
	}
	
	/**
	 * décrire l'instance appelante
	 * @return un string représentant la fraction appelante.
	 */
	public String toString() 
	{
		return "valeur : " + this.numerateur + "/" + this.denominateur;
	}
	
	/**
	 * calculer une valeur approché de la fraction
	 * @return double représentant la valeur approché
	 */
	public double doubleValue() 
	{
		
		return (double)this.numerateur.intValue()/(double)this.denominateur.intValue();
		
	}

}
