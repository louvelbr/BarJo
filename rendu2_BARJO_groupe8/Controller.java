package rendu2_BARJO_groupe8;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
public class Controller {
    Data data = new Data(0);
    Barman b1 = data.getBarman();
    Client c1 = data.getClient();
    private float prixTot;
 
    @FXML
    private ListView<String> commandeClient;
    @FXML
    private ListView<String> commandeBarman;
    @FXML
    private ListView<String> nomSoft;
    @FXML
    private ListView<String> nomAlcool;
    @FXML
    private ListView<Float> stockSoft;
    @FXML
    private ListView<Float> stockAlcool;
    @FXML
    private ListView<Float> prixSoft;
    @FXML
    private ListView<Float> prixAlcool;
    @FXML
    private ComboBox<String> boissonAlcoolisee;
    @FXML
    private ComboBox<String> boissonSoft;
    @FXML
    private ComboBox<String> cocktails;
    @FXML
    private ComboBox<String> aperitif;
    @FXML
    private TextField prixClient;
    @FXML
    private TextField prixBarman;
    @FXML
    private TextField budget;
    @FXML
    private TextField caisse;
    
    private void alert(String message, String titre, String header) {
    	 Alert alert = new Alert(AlertType.INFORMATION);
         alert.setTitle(titre);
         alert.setHeaderText(header);
         alert.setContentText(message);
         alert.showAndWait();
    }
    private void actualiserPrix(float prixBoisson, float contenance) {
    	float prixFinal;
    	prixFinal = prixBoisson*contenance + Float.parseFloat(prixClient.getText());
    	prixClient.clear();
    	prixClient.replaceSelection(Float.toString(prixFinal));
    	prixBarman.clear();
    	prixBarman.replaceSelection(Float.toString(prixFinal));
    }

    private void actualiseStock(float stock, ComboBox<String> boisson, ListView<Float> stocks) {
    	int index = boisson.getSelectionModel().getSelectedIndex();
    	if(stocks.getItems().get(index)==0) {
    		alert("Désolé cette boisson n'est plus en stock","Alert Stock","Fin de stock");
    	}else {
    	//set(index, nouveau stock avec seulement deux chiffres significatifs)
    	stocks.getItems().set(index, (float)((int)((stocks.getItems().get(index)-stock)*100))/100); 
    	}
    }
    @FXML
    private void payer() {
    	float budgetClient;
    	float caisseBarman;
    	prixTot = Float.parseFloat(prixClient.getText());
    	budgetClient = Float.parseFloat(budget.getText()) - prixTot;
    	caisseBarman = Float.parseFloat(caisse.getText()) + prixTot;
    	budget.clear();
    	budget.replaceSelection(Float.toString(budgetClient));
    	caisse.clear();
    	caisse.replaceSelection(Float.toString(caisseBarman));    
    	annuler();
    }
    @FXML
    private void ajouterBoissonSoft() {
    	int index = boissonSoft.getSelectionModel().getSelectedIndex();
    	if(index==-1) {
        	alert("Veuillez selectionner une boisson à ajouter.","Boissons Soft","Selectionnez une boisson.");
        }else {
        commandeClient.getItems().add(boissonSoft.getValue());
        commandeBarman.getItems().add(boissonSoft.getValue());
        
        actualiserPrix(prixSoft.getItems().get(index),0.25f);
        actualiseStock(0.25f, boissonSoft, stockSoft);
        }
    }
    @FXML
    private void ajouterBoissonAlcoolisee() {
    	int index = boissonAlcoolisee.getSelectionModel().getSelectedIndex();
    	if(index==-1) {
    		alert("Veuillez selectionner une boisson à ajouter.","Boissons Alcoolisée","Selectionnez une boisson.");
    	}else {
        commandeClient.getItems().add(boissonAlcoolisee.getValue());
        commandeBarman.getItems().add(boissonAlcoolisee.getValue());
        actualiserPrix(prixAlcool.getItems().get(index),0.05f);
        actualiseStock(0.05f, boissonAlcoolisee, stockAlcool);
    	}
    }
    @FXML
    private void ajouterCocktails() {
    	int index = cocktails.getSelectionModel().getSelectedIndex();
    	if(index==-1) {
    		alert("Veuillez selectionner un cocktail à ajouter.","Coktail","Selectionnez un cocktail.");
    	}else {
        commandeClient.getItems().add(cocktails.getValue());
        commandeBarman.getItems().add(cocktails.getValue());
        actualiserPrix(8,1);
    	}
    }
    @FXML
    private void ajouterAperitifs() {
    	int index = aperitif.getSelectionModel().getSelectedIndex();
    	if(index==-1) {
    		System.out.println("Veuillez selectionner un apéritif à ajouter.");
    	}else {
        commandeClient.getItems().add(aperitif.getValue());
        commandeBarman.getItems().add(aperitif.getValue());
        actualiserPrix(1,1);
    	}
    }
    @FXML
    private void retirerElmt() {
    	int index = commandeClient.getSelectionModel().getSelectedIndex();
    	if(index==-1) {
    		alert("Veuillez selectionner un élément à retirer.","Commande","Selectionnez élémenent.");
    	}else{
    	commandeClient.getItems().remove(index);
    	commandeBarman.getItems().remove(index);
    	}
    }
    @FXML
    private void annuler() {
    	commandeClient.getItems().clear();
    	commandeBarman.getItems().clear();
    	prixClient.clear();
    	prixClient.replaceSelection("0");
    	prixBarman.clear();
    	prixBarman.replaceSelection("0");
    }
    //Interface Barman
    @FXML
    private void ouvrir() {

    	boissonAlcoolisee.getItems().clear();
    	boissonSoft.getItems().clear();
    	aperitif.getItems().clear();
    	cocktails.getItems().clear();
    	stockSoft.getItems().clear();
    	stockAlcool.getItems().clear();
    	prixSoft.getItems().clear();
    	prixAlcool.getItems().clear();
    	nomSoft.getItems().clear();
    	nomAlcool.getItems().clear();
    	caisse.clear();
    	budget.clear();
    	prixBarman.clear();
    	prixClient.clear();
    	commandeClient.getItems().clear();
    	commandeBarman.getItems().clear();
    	
    	caisse.replaceSelection("0");
    	budget.replaceSelection("200");
    	prixBarman.replaceSelection("0");
    	prixClient.replaceSelection("0");
    	stockSoft.getItems().addAll(data.getBoissonsNonAlcooliseesStock());
    	stockAlcool.getItems().addAll(data.getBoissonsAlcooliseesStock());
    	prixSoft.getItems().addAll(data.getBoissonsNonAlcooliseesPrix());
    	prixAlcool.getItems().addAll(data.getBoissonsAlcooliseesPrix());
    	nomSoft.getItems().addAll(data.getBoissonsNonAlcooliseesName());
        nomAlcool.getItems().addAll(data.getBoissonsAlcooliseesName());
    	
        boissonAlcoolisee.getItems().addAll(data.getBoissonsAlcooliseesName());
        boissonSoft.getItems().addAll(data.getBoissonsNonAlcooliseesName());
        aperitif.getItems().addAll(data.getAperoName());
        cocktails.getItems().addAll(data.getCocktailsName());
    }
    
    
}
