import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public static int anInt5441;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public static int anInt5443;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "Lclient!ve;")
	public static Js5 aClass153_101;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Z")
	public static boolean aBoolean283 = true;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Lclient!na;")
	public static final Class100 aClass100_1040 = Static28.method790(" autres options");

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt5434 = 0;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!n;")
	public static final Class99 aClass99_33 = new Class99(260);

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!na;")
	public static final Class100 aClass100_1041 = Static28.method790("scrollbar");

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!na;")
	public static final Class100 aClass100_1042 = Static28.method790("Null");

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Lclient!na;")
	public static final Class100 aClass100_1043 = Static28.method790(" <col=00ff80>");

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public static int anInt5444 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method4273() {
		@Pc(14) int local14 = Static173.aClass8_Sub4_Sub1_2.anInt3412 + Static132.anInt3291;
		@Pc(20) int local20 = Static173.aClass8_Sub4_Sub1_2.anInt3421 + Static206.anInt4774;
		if (Static81.anInt2223 - local14 < -500 || Static81.anInt2223 - local14 > 500 || Static111.anInt2900 - local20 < -500 || Static111.anInt2900 - local20 > 500) {
			Static81.anInt2223 = local14;
			Static111.anInt2900 = local20;
		}
		if (Static111.anInt2900 != local20) {
			Static111.anInt2900 += (local20 - Static111.anInt2900) / 16;
		}
		if (Static81.anInt2223 != local14) {
			Static81.anInt2223 += (local14 - Static81.anInt2223) / 16;
		}
		if (Static33.aBoolean63) {
			for (@Pc(93) int local93 = 0; local93 < Static182.anInt4313; local93++) {
				@Pc(104) int local104 = Static227.anIntArray447[local93];
				if (local104 == 98) {
					Static72.anInt2031 = Static72.anInt2031 + 47 & 0xFFFFFFF0;
				} else if (local104 == 99) {
					Static72.anInt2031 = Static72.anInt2031 - 17 & 0xFFFFFFF0;
				} else if (local104 == 96) {
					Static57.anInt1747 = Static57.anInt1747 - 65 & 0xFFFFFF80;
				} else if (local104 == 97) {
					Static57.anInt1747 = Static57.anInt1747 + 191 & 0xFFFFFF80;
				}
			}
		} else {
			if (Static187.aBooleanArray101[98]) {
				Static56.anInt1743 += (12 - Static56.anInt1743) / 2;
			} else if (Static187.aBooleanArray101[99]) {
				Static56.anInt1743 += (-Static56.anInt1743 - 12) / 2;
			} else {
				Static56.anInt1743 /= 2;
			}
			if (Static187.aBooleanArray101[96]) {
				Static38.anInt1203 += (-Static38.anInt1203 - 24) / 2;
			} else if (Static187.aBooleanArray101[97]) {
				Static38.anInt1203 += (24 - Static38.anInt1203) / 2;
			} else {
				Static38.anInt1203 /= 2;
			}
			Static72.anInt2031 += Static56.anInt1743 / 2;
			Static57.anInt1747 += Static38.anInt1203 / 2;
		}
		Static87.method1812();
	}
}
