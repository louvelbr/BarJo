package rendu2_BARJO_groupe8;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private Barman b1;
    private Client c1;
    
    /* Boissons alcoolisées */
    public BoissonAlcoolisee[] getBoissonsAlcoolisees() {
        return boissonsAlcoolisees;
    }
    
    private BoissonAlcoolisee[] boissonsAlcoolisees = {    
        new BoissonAlcoolisee("vodka", 40f, 0.04f, 20, 40f),
        new BoissonAlcoolisee("rhum", 40f, 0.05f, 20,  55f),
        new BoissonAlcoolisee("whisky", 40f, 0.03f, 15, 40f),
        new BoissonAlcoolisee("tequila", 40f, 0.03f, 15, 40f),
        new BoissonAlcoolisee("bière", 17f, 0.5f, 40, 5f)
    };
    
    public ArrayList<String> getBoissonsAlcooliseesName() {
        ArrayList<String> res = new ArrayList<String>();
        for (BoissonAlcoolisee boisson : boissonsAlcoolisees){
            res.add(boisson.getNomProduit());
        }
        return(res);
    }
    
    public ArrayList<Float> getBoissonsAlcooliseesPrix() {
        ArrayList<Float> res = new ArrayList<Float>();
        for (BoissonAlcoolisee boisson : boissonsAlcoolisees){
            res.add(boisson.getPrix());
        }
        return(res);
    }
    public ArrayList<Float> getBoissonsAlcooliseesStock() {
        ArrayList<Float> res = new ArrayList<Float>();
        for (BoissonAlcoolisee boisson : boissonsAlcoolisees){
            res.add(boisson.getStock());
        }
        return(res);
    }
    
    
    /* Boissons non alcoolisées */
    public BoissonNonAlcoolisee[] getBoissonsNonAlcoolisees() {
        return boissonsNonAlcoolisees;
    }

 

    private BoissonNonAlcoolisee[] boissonsNonAlcoolisees = {    
        new BoissonNonAlcoolisee("jus d'orange", 6f, 40, 60f),
        new BoissonNonAlcoolisee("coca", 4f, 20, 90f),
        new BoissonNonAlcoolisee("fanta", 4f, 40, 86f),
        new BoissonNonAlcoolisee("kas", 4f, 40, 86f),
        new BoissonNonAlcoolisee("perrier", 4f, 40, 3f),
        new BoissonNonAlcoolisee("limonade", 4f, 40, 70f)
    };
    
    public ArrayList<String> getBoissonsNonAlcooliseesName() {
        ArrayList<String> res = new ArrayList<String>();
        for (BoissonNonAlcoolisee boisson : boissonsNonAlcoolisees){
            res.add(boisson.getNomProduit());
        }
        return(res);
    }
    
    public ArrayList<Float> getBoissonsNonAlcooliseesPrix() {
        ArrayList<Float> res = new ArrayList<Float>();
        for (BoissonNonAlcoolisee boisson : boissonsNonAlcoolisees){
            res.add(boisson.getPrix());
        }
        return(res);
    }

    public ArrayList<Float> getBoissonsNonAlcooliseesStock() {
        ArrayList<Float> res = new ArrayList<Float>();
        for (BoissonNonAlcoolisee boisson : boissonsNonAlcoolisees){
            res.add(boisson.getStock());
        }
        return(res);
    }

    /* Cocktail(s) */
    /* Création du cocktail whisky/coca */    
    /* Liste d'alcool dans le whisky-coca */
    private BoissonAlcoolisee[] ingredientAlcoolWhiskyCoca = {boissonsAlcoolisees[2]};
    /* Liste de soft dans le whisky-coca */
    private BoissonNonAlcoolisee[] ingredientSoftWhiskyCoca = {boissonsNonAlcoolisees[1]};    
    
    /* Création du cocktail vodka/kas */    
    /* Liste d'alcool dans le vodka-kas */
    private BoissonAlcoolisee[] ingredientAlcoolVodkaKas = {boissonsAlcoolisees[0]};
    /* Liste de soft dans le vodka-kas */
    private BoissonNonAlcoolisee[] ingredientSoftVodkaKas = {boissonsNonAlcoolisees[3]};    

 

    /* Création du tableau de cocktail */
    public Cocktail[] getCocktails() {
        return cocktails;
    }

 

    private Cocktail[] cocktails = {    
        new Cocktail("Whisky Coca", 2, ingredientAlcoolWhiskyCoca, ingredientSoftWhiskyCoca),
        new Cocktail("Vodka Kas", 2, ingredientAlcoolVodkaKas, ingredientSoftVodkaKas)
    };
    
    public ArrayList<String> getCocktailsName() {
        ArrayList<String> res = new ArrayList<String>();
        for (Cocktail boisson : cocktails){
            res.add(boisson.getNomProduit());
        }
        return(res);
    }
    public ArrayList<String> getCocktailsPrix() {
        ArrayList<String> res = new ArrayList<String>();
        for (Cocktail boisson : cocktails){
           // res.add(boisson.getPrix());
        }
        return(res);
    }
    public ArrayList<String> getCocktailStock() {
        ArrayList<String> res = new ArrayList<String>();
        for (Cocktail boisson : cocktails){
           // res.add(boisson.getStock());
        }
        return(res);
    }
    
    /* Apéritifs */
    public Aperitif[] getApero() {
        return apero;
    }

 

    private Aperitif[] apero = {    
        new Aperitif("cacahuètes", 1),
        new Aperitif("chips", 2),
        new Aperitif("tuc", 2),
        new Aperitif("pistaches", 1),
        new Aperitif("olives", 1)
    };
    
    public ArrayList<String> getAperoName() {
        ArrayList<String> res = new ArrayList<String>();
        for (Aperitif nourriture : apero){
            res.add(nourriture.getNomProduit());
        }
        return(res);
    }

 

    
    public Client getClient() {
        return c1;
    }

 

    public void setClient(Client c1) {
        this.c1 = c1;
    }

 

    public Data (int idBarman) {
        this.b1 = new Barman(idBarman, 20000);
        
    }

 

    public Barman getBarman() {
        return b1;
    }
}