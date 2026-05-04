package fr.univ_amu.iut.exercice5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Exercice 5 - Réagir à un clic.*
 *
 * <p>Objectif : afficher un bouton "Clique-moi" et un label qui affiche le nombre de clics.
 * Chaqueclic incrémente le compteur.*
 *
 * <p>L'intérêt pédagogique est de voir qu'un même effet peut s'écrire avec trois styles
 * différentsd'écouteur (voir les commentaires dans {@link #start(Stage)}).
 */
public class EvenementsBouton extends Application {

  @Override
  public void start(Stage primaryStage) {
    // TODO exercice 5 : construire l'IHM et brancher un écouteur.
    //
    // L'IHM attendue :
    // - un Button "Clique-moi" avec l'id "bouton-clique-moi"
    // - un Label qui affichera "N clics" avec l'id "compteur"
    // - le tout dans un VBox, dans une Scene, dans le Stage
    //
    // Compteur compteur = new Compteur();
    // Label labelCompteur = new Label("0 clics");
    // Button bouton = new Button("Clique-moi");
    // // bouton.setOnAction(e -> {
    // // compteur.incrementer();
    // // labelCompteur.setText(compteur.getValeur() + " clics");
    // // });

    VBox vbox = new VBox();
    Compteur compteur = new Compteur();
    Label labelCompteur = new Label("0 clics");
    Button bouton = new Button("Clique-moi");
    bouton.setId("bouton-clique-moi");
    labelCompteur.setId("compteur");
    vbox.getChildren().add(bouton);
    vbox.getChildren().add(labelCompteur);

    bouton.setOnAction(
        e -> {
          compteur.incrementer();
          labelCompteur.setText(compteur.getValeur() + " clics");
        });

    primaryStage.setScene(new Scene(vbox, 400, 200));
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
