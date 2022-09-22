package com.hops_n_code.dojo.quality;

import com.hops_n_code.dojo.Item;

import java.util.Map;
import java.util.function.Function;

public class QualityUpdaterFactory {

    private static final Map<String, Function<Item, QualityUpdater>> NAME_UPDATER_MAPPING = Map.of(
            "Aged Brie", AgedBrieQualityUpdater::new,
            "Backstage passes to a TAFKAL80ETC concert", BackstagePassQualityUpdater::new,
            "Sulfuras, Hand of Ragnaros", SulfurasQualityUpdater::new
    );

    public static QualityUpdater forItem(Item item) {
        return NAME_UPDATER_MAPPING.getOrDefault(item.name, DefaultQualityUpdater::new).apply(item);
    }
}