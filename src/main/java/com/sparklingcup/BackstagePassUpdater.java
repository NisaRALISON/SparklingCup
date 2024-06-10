package com.sparklingcup;

/**
 * This class is used to treat "Backstage passes to a TAFKAL80ETC concert"
 */
public class BackstagePassUpdater implements ItemUpdater{
    /**
     * This method is used to update Backstage item
     * @param item to update
     */
    @Override
    public void update(Item item) {
        //Comme quality ne peut jamais être négatif, on va le remettre à 0 si c'est nagatif à l'entrée
        if(item.quality < 0 ) {
            item.quality = 0 ;
        }
        //Incrementation de quality tant que quality est inférieur à 50
        if (item.quality < 50 ) {
            item.quality++ ;
            //Il incrémente encore une fois si il reste 10 Jours ou moins
            if (item.sellIn < 11 && item.quality < 50) {
                item.quality++ ;
            }
            //Il incrémente encore une fois si il reste 5 Jours ou moins
            if (item.sellIn < 6 && item.quality < 50) {
                item.quality++ ;
            }
        }
        item.sellIn-- ;
        //la qualité tombe à 0 après le concert.
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
