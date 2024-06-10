package com.sparklingcup;

/**
 * This class is used to treat "Aged Brie"
 */
public class AgedBrieUpdater implements ItemUpdater{
    /**
     * This method is used to update Aged Quality
     * @param item to update
     */
    @Override
    public void update(Item item) {
        //Comme quality ne peut jamais être négatif, on va le remettre à 0 si c'est négatif à l'entrée
        if(item.quality < 0 ) {
            item.quality = 0 ;
        }
        //Incrementation de quality tant que quality est inférieur à 50
        if (item.quality < 50 ) {
            item.quality++ ;
        }
        item.sellIn-- ;
        //"Aged Brie" augmente sa qualité (quality) au fil du temps.
        //La qualité d'un produit n'est jamais de plus de 50.
        //Une fois que la date de péremption est passée, la qualité se dégrade deux fois plus rapidement sauf pour AgedBrid qui augmente encore
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++ ;
        }
    }
}
