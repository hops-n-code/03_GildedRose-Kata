package com.hops_n_code.dojo;

import com.hops_n_code.dojo.quality.QualityUpdater;
import com.hops_n_code.dojo.quality.QualityUpdaterFactory;

import java.util.Arrays;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items)
                .map(QualityUpdaterFactory::forItem)
                .forEach(QualityUpdater::updateQuality);
    }

}
