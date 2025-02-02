package com.teamabnormals.woodworks.core;

import com.teamabnormals.blueprint.core.annotations.ConfigKey;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import org.apache.commons.lang3.tuple.Pair;

public class WoodworksConfig {

	public static class Common {
		@ConfigKey("wooden_boards")
		public final BooleanValue woodenBoards;
		@ConfigKey("wooden_bookshelves")
		public final BooleanValue woodenBookshelves;
		@ConfigKey("wooden_ladders")
		public final BooleanValue woodenLadders;
		@ConfigKey("wooden_beehives")
		public final BooleanValue woodenBeehives;
		@ConfigKey("wooden_chests")
		public final BooleanValue woodenChests;
		@ConfigKey("leaf_piles")
		public final BooleanValue leafPiles;

		public Common(ForgeConfigSpec.Builder builder) {
			builder.push("blocks");
			this.woodenBoards = builder.define("Wooden boards", true);
			this.woodenBookshelves = builder.define("Wooden bookshelves", true);
			this.woodenLadders = builder.define("Wooden ladders", true);
			this.woodenBeehives = builder.define("Wooden beehives", true);
			this.woodenChests = builder.define("Wooden chests", true);
			this.leafPiles = builder.define("Leaf piles", true);
			builder.pop();
		}
	}

	public static final ForgeConfigSpec COMMON_SPEC;
	public static final Common COMMON;

	static {
		Pair<Common, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Common::new);
		COMMON_SPEC = commonSpecPair.getRight();
		COMMON = commonSpecPair.getLeft();
	}
}