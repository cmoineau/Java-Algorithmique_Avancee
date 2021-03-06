package utils;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

@SuppressWarnings("serial")
public class Visu extends JFrame {

	// Ensemble de points à afficher
	Set <utils.Point> points;

	// Ensemble de lignes à afficher, une ligne est caractérisée par deux points représentant ses extremités.
	Set <Ligne> lignes;

	// Description de la solution, incluant son score et toute autre information utile
	String descriptionSolution;
	
	public Visu(Set <utils.Point> points, Set <Ligne> lignes, String descriptionSolution) {
		super();
		this.points = points;
		this.lignes = lignes;
		this.descriptionSolution = descriptionSolution;
		construitContenuFenetre();
	}

	public Visu(Set <Point> points, String descriptionSolution) {
		super();
		this.points = points;
		this.lignes = new HashSet<Ligne>();
		this.descriptionSolution = descriptionSolution;
		construitContenuFenetre();
	}

	
	public void construitContenuFenetre(){
		JFrame f = new JFrame();
		f.setTitle("Algorithmique avancée - Visualiseur points et lignes brisées");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Création des composants et ajout au ContentPane du cadre
		JLabel label = new JLabel(descriptionSolution);
		Plot2d plot = new Plot2d(points,lignes);
		
		f.getContentPane().add(plot, BorderLayout.CENTER);
		f.getContentPane().add(label, BorderLayout.SOUTH);
		
		f.setSize(600,600);
		f.setLocation(200,200);
		f.setVisible(true);	
	}

	public static void main(String[] args) {
		
		// EXEMPLE d'UTILISATION DE LA CLASSE
		
		// Création des points
		utils.Point p1 = new utils.Point(1.0,8.6);
		utils.Point p2 = new utils.Point(2.0,25.8);
		utils.Point p3 = new utils.Point(3.0,7.9);
		utils.Point p4 = new utils.Point(4.0,5.0);
		utils.Point p5 = new utils.Point(5.0,8.6);
		utils.Point p6 = new utils.Point(6.0,25.8);
		utils.Point p7 = new utils.Point(7.0,7.9);
		utils.Point p8 = new utils.Point(8.5,5.0);
		Set <utils.Point> points = new HashSet<utils.Point>();
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		points.add(p5);
		points.add(p6);
		points.add(p7);
		points.add(p8);
		// Les points peuvent être obtenus par lecture d'un fichier de données par :
		//Set  <utils.Point> points_lus ;
		//points_lus = utils.Parser.recuperePoints();

		
		// Création des lignes composanr la ligne brisée (A VOUS DE JOUER pour trouver la meilleure approximation)
		// Encore une fois, les structues données ici sont à adapter à votre programme.
		Set <Ligne> lignes = new HashSet<Ligne>();
		lignes.add(new Ligne (p1,p2));
		lignes.add(new Ligne (p2,p7));
		lignes.add(new Ligne (p7,p8));

		Double score_au_pif = 3.4;
		
		Visu v1 = new Visu(points,lignes,"Solution de score "+score_au_pif);
		// si pas de ligne à afficher :
		//new utils.Visu(points_lus,"Solution de score"+score_au_pif);

	}
}