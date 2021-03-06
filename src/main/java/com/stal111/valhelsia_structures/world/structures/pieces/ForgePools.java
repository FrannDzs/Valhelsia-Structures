package com.stal111.valhelsia_structures.world.structures.pieces;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.stal111.valhelsia_structures.utils.JigsawHelper;
import net.minecraft.world.gen.feature.jigsaw.JigsawPattern;

public class ForgePools {

    public static final JigsawPattern PATTERN = JigsawHelper.register("forges", JigsawPattern.PlacementBehaviour.RIGID, ImmutableList.of(Pair.of("forge", 1)), true);

}
