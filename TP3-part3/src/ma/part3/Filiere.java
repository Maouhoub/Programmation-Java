package ma.part2;

public class Filiere 
{
	/**
	 * 
	 */
	private Etudiant[] etudiants ;
	
	/**
	 * 
	 */
	private Integer numeroSection;
	
	/**
	 * 
	 */
	private Professeur chefSection;
	
	/**
	 * 
	 */
	public Filiere()
	{
		this.etudiants = null;
		this.numeroSection = null;
		this.chefSection = null;
	}
    
	/**
	 * 
	 * @return
	 */
	public Integer getNumeroSection() {
		return numeroSection;
	}

	/**
	 * 
	 * @param numeroSection
	 */
	public void setNumeroSection(Integer numeroSection) {
		this.numeroSection = numeroSection;
	}
    
	/**
	 * 
	 * @return
	 */
	public Professeur getChefSection() {
		return chefSection;
	}
	
    /**
     * 
     * @param chefSection
     */
	public void setChefSection(Professeur chefSection) {
		this.chefSection = chefSection;
	}
	

}
