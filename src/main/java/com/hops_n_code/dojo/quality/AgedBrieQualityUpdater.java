package com.hops_n_code.dojo.quality;

import com.hops_n_code.dojo.Item;

public class AgedBrieQualityUpdater extends DefaultQualityUpdater {
    protected AgedBrieQualityUpdater(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }
}
