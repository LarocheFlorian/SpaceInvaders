package fr.unilim.iut.SpaceInvaders;

public class Vaisseau {
	
	int abscisse;
	int ordonnee;
	int longueur;
	int hauteur;

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

    public Vaisseau(int longueur, int hauteur, int x, int y) {
	   this.longueur=longueur;
	   this.hauteur=hauteur;
	   this.abscisse = x;
	   this.ordonnee = y;
    }
	
    public boolean occupeLaPosition(int x, int y) {
	     return(estAbscisseCouverte(x) && estOrdonneeCouverte(y));
    }

	/**
	 * @param y
	 * @return
	 */
	private boolean estOrdonneeCouverte(int y) {
		return (ordonneeLaPlusBasse()<=y) && (y<=ordonneeLaPlusHaute());
	}

	/**
	 * @return
	 */
	private int ordonneeLaPlusBasse() {
		return ordonneeLaPlusHaute()-this.hauteur+1;
	}

	/**
	 * @return
	 */
	private int ordonneeLaPlusHaute() {
		return this.ordonnee;
	}

	/**
	 * @param x
	 * @return
	 */
	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
	}

	/**
	 * @return
	 */
	private int abscisseLaPlusAGauche() {
		return this.abscisse;
	}

	/**
	 * @return
	 */
	public int abscisseLaPlusADroite() {
		return abscisseLaPlusAGauche()+this.longueur-1;
	}




	
    public void seDeplacerVersLaDroite() {
	      this.abscisse = abscisseLaPlusAGauche() + 1 ;
    }
    
    public void seDeplacerVersLaGauche() {
	      this.abscisse = abscisseLaPlusAGauche() - 1 ;
    }
    
   	public int abscisse() {
        return abscisseLaPlusAGauche();
	}

	public void positionner(int x, int y) {
	    this.abscisse = x;
	    this.ordonnee = y;
    }
   	
}
