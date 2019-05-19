package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.utils.MissileException;

public class Vaisseau extends Sprite{

	public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
	}
	
	
	
   public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
	    if(dimension.longueur() < dimensionMissile.longueur()){
	    	throw new MissileException("Erreur : le missile est de taille supérieure au vaisseau");
	    }
		else {
			Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);
			return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
		}
	}

	
	/*
   public void tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
		
	   if ((vaisseau.hauteur()+ dimensionMissile.hauteur()) > this.hauteur )
		   throw new MissileException("Pas assez de hauteur libre entre le vaisseau et le haut de l'espace jeu pour tirer le missile");
						
	   this.missile = this.vaisseau.tirerUnMissile(dimensionMissile,vitesseMissile);
   }
	*/

/**
 * @param dimensionMissile
 * @return
 */
	private Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
		int abscisseMilieuVaisseau = this.abscisseLaPlusAGauche() + (this.longueur() / 2);
		int abscisseOrigineMissile = abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);
	
		int ordonneeeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
		Position positionOrigineMissile = new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);
		return positionOrigineMissile;
	}
		

}