package ca.qc.bdeb.info204.spellington.gameentities;

import java.util.ArrayList;

/**
 * A LivingEntity opposing the player.
 *
 * @author Celtis
 * @see LivingEntity
 */
public abstract class Enemy extends LivingEntity {

    protected ArrayList<String> droppableSpells = new ArrayList<>();

    public Enemy(float x, float y, float width, float height, MouvementState mouvementState, int GRAVITY_MODIFIER,int maxLifePoint) {
        super(x, y, width, height, mouvementState, GRAVITY_MODIFIER, maxLifePoint);
    }

    public ArrayList<String> getDroppableSpells() {
        return droppableSpells;
    }

    public void setDroppableSpells(ArrayList<String> droppableSpells) {
        this.droppableSpells = droppableSpells;
    }

}
