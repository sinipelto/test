package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!wi", name = "R", descriptor = "[Lclient!qf;")
	public static Sprite[] hintMapEdge;

	@OriginalMember(owner = "client!wi", name = "db", descriptor = "I")
	public static int tileVisibilityDistance;

	@OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
	public static int anInt5850 = 0;

	@OriginalMember(owner = "client!wi", name = "X", descriptor = "[[B")
	public static final byte[][] aByteArrayArray16 = new byte[1000][];

	@OriginalMember(owner = "client!wi", name = "bb", descriptor = "I")
	public static int anInt5854 = 0;

	@OriginalMember(owner = "client!wi", name = "hb", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)Z")
	public static boolean method4640(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(12) int local12 = MiniMenu.actions[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		return local12 == 1003;
	}

}
