package com.vinickiy.Recipe.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    @OneToOne
    private UnitOfMeasure unitOfMeasure;

    @ManyToOne
    private Recipe recipe;

    public Ingredient() {
    }

    public Long getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    public Recipe getRecipe() {
        return this.recipe;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Ingredient)) return false;
        final Ingredient other = (Ingredient) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        final Object this$unitOfMeasure = this.getUnitOfMeasure();
        final Object other$unitOfMeasure = other.getUnitOfMeasure();
        if (this$unitOfMeasure == null ? other$unitOfMeasure != null : !this$unitOfMeasure.equals(other$unitOfMeasure))
            return false;
        final Object this$recipe = this.getRecipe();
        final Object other$recipe = other.getRecipe();
        if (this$recipe == null ? other$recipe != null : !this$recipe.equals(other$recipe)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Ingredient;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final Object $unitOfMeasure = this.getUnitOfMeasure();
        result = result * PRIME + ($unitOfMeasure == null ? 43 : $unitOfMeasure.hashCode());
        final Object $recipe = this.getRecipe();
        result = result * PRIME + ($recipe == null ? 43 : $recipe.hashCode());
        return result;
    }

    public String toString() {
        return "Ingredient(id=" + this.getId() + ", description=" + this.getDescription() + ", amount=" + this.getAmount() + ", unitOfMeasure=" + this.getUnitOfMeasure() + ", recipe=" + this.getRecipe() + ")";
    }
}
