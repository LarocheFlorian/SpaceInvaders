package fr.unilim.iut.spaceinvaders.utils;

@SuppressWarnings("serial")
public class HorsEspaceJeuException extends RuntimeException {

	public HorsEspaceJeuException(String message) {
		super(message);
	}


	@SuppressWarnings("serial")
	public class MissileException extends RuntimeException {

		public MissileException(String message) {
			super(message);
		}
	}

}

