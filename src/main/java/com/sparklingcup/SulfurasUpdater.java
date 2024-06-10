package com.sparklingcup;

/**
 * This class is used to treat "Sulfuras, Hand of Ragnaros"
 */
public class SulfurasUpdater implements ItemUpdater{
    /**
     * This method is used to update sulfuras quality
     * @param item to update
     */
    @Override
    public void update(Item item) {
        //"Sulfuras", étant un objet légendaire, n'a pas de date de péremption et ne perd jamais en qualité (quality)
        //Pas d'opération pour Sulfuras
        //"Sulfuras" est un objet légendaire et comme tel sa qualité est de 80 et elle ne change jamais
        if(item.quality != 80) {
            item.quality = 80 ;
        }
    }
}
