package fr.unilim.iut.SpaceInvaders;

public class Vaisseau {
	
	int abscisseLaPlusAGauche; //A VERIFIER
	int y;
	int longueur;
	int hauteur;

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

    public Vaisseau(int longueur, int hauteur, int x, int y) {
	   this.longueur=longueur;
	   this.hauteur=hauteur;
	   this.abscisseLaPlusAGauche = x;
	   this.y = y;
    }
	
    public boolean occupeLaPosition(int x, int y) {
	     if (estAbscisseCouverte(x)) 
		      if ( (this.y-this.hauteur+1<=y) && (y<=this.y))
			  return true;
		
	     return false;
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
		return this.abscisseLaPlusAGauche;
	}

	/**
	 * @return
	 */
	public int abscisseLaPlusADroite() {
		return abscisseLaPlusAGauche()+this.longueur-1;
	}




	
    public void seDeplacerVersLaDroite() {
	      this.abscisseLaPlusAGauche = abscisseLaPlusAGauche() + 1 ;
    }
    
    public void seDeplacerVersLaGauche() {
	      this.abscisseLaPlusAGauche = abscisseLaPlusAGauche() - 1 ;
    }
    
   	public int abscisse() {
        return abscisseLaPlusAGauche();
	}

	public void positionner(int x, int y) {
	    this.abscisseLaPlusAGauche = x;
	    this.y = y;
    }
   	
}
