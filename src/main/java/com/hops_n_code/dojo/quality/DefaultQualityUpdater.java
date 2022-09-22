package com.hops_n_code.dojo.quality;

import com.hops_n_code.dojo.Item;

public class DefaultQualityUpdater implements QualityUpdater {
    protected final Item item;

    protected DefaultQualityUpdater(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }
}
