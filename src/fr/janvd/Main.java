package fr.janvd;

public class Main {

    public static void main(String[] args) {
        System.out.println("L'addition de 4 et 3 est : " + additionner(4, 3));
        System.out.println("La soustraction entre 4 et 3 est : " + soustraire(4,3));
    }

	static int additionner(int nombre1, int nombre2) {
	    return nombre1 + nombre2;
    }

    static int soustraire(int nombre1, int nomrebre2) {
        return nombre1 - nomrebre2;
    }
}
