package com.stal111.valhelsia_structures.world.structures;

import com.mojang.serialization.Codec;
import com.stal111.valhelsia_structures.config.StructureConfigEntry;
import com.stal111.valhelsia_structures.init.ModStructureFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.VillageConfig;

/**
 * Tower Ruin Structure
 * Valhelsia-Structures - com.stal111.valhelsia_structure.world.structures.TowerRuinStructure
 *
 * @author Valhelsia Team
 * @version 16.0.3
 * @since 2019-10-31
 */

public class TowerRuinStructure extends AbstractValhelsiaStructure {

    public TowerRuinStructure(Codec<VillageConfig> villageConfigCodec) {
        super(villageConfigCodec, "tower_ruin", 1,
                new StructureConfigEntry(0.8D, 25, 8,
                        Biome.Category.PLAINS.getName(),
                        Biome.Category.FOREST.getName(),
                        Biome.Category.EXTREME_HILLS.getName(),
                        Biome.Category.TAIGA.getName()
                ));
    }

    @Override
    public int getSeedModifier() {
        return 24357670;
    }

    @Override
    public StructureFeature<VillageConfig, ? extends Structure<VillageConfig>> getStructureFeature() {
        return ModStructureFeatures.TOWER_RUIN;
    }
}