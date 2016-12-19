package fr.formation.entity;

import java.io.Serializable;

public class CocktailIngredient implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private Cocktail cocktail;
	private Integer id;
	private Ingredient ingredient;

	public Cocktail getCocktail() {
		return cocktail;
	}

	public void setCocktail(Cocktail cocktail) {
		this.cocktail = cocktail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

}
