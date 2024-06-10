package com.sparklingcup;

/**
 * This class is used to treat "Conjured Mana Cake"
 */
public class ConjuredItemUpdater implements ItemUpdater{
    /**
     * This class is used to update Conjured quality
     * @param item to update
     */
    @Override
    public void update(Item item) {
        //Les éléments "Conjured" voient leur qualité se dégrader de deux fois plus vite que les objets normaux.
        if (item.quality < 50) {
            item.quality -= 2 ;

        }
        item.sellIn-- ;
        //Une fois que la date de péremption est passée, la qualité se dégrade deux fois plus rapidement.
        //Quality ne doit pas être négatif
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 2 ;
        }

        //Remettre à 0 SI quality est négatif
        if (item.quality < 0 ) {
            item.quality = 0 ;
        }
    }
}
