import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "[I")
	public static final int[] anIntArray351 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!mc", name = "fb", descriptor = "Lclient!na;")
	private static final JagString aClass100_725 = JagString.parse("pt");

	@OriginalMember(owner = "client!mc", name = "mb", descriptor = "Lclient!na;")
	private static final JagString aClass100_726 = JagString.parse("en");

	@OriginalMember(owner = "client!mc", name = "vb", descriptor = "Lclient!na;")
	private static final JagString aClass100_728 = JagString.parse("de");

	@OriginalMember(owner = "client!mc", name = "pb", descriptor = "Lclient!na;")
	private static final JagString aClass100_727 = JagString.parse("fr");

	@OriginalMember(owner = "client!mc", name = "ob", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array113 = new JagString[] { aClass100_726, aClass100_728, aClass100_727, aClass100_725 };

	@OriginalMember(owner = "client!mc", name = "tb", descriptor = "S")
	public static short aShort22 = 1;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)V")
	public static void method2909() {
		Protocol.outboundBuffer.p1isaac(184);
		for (@Pc(18) Class3_Sub31 local18 = (Class3_Sub31) Static119.aClass133_9.head(); local18 != null; local18 = (Class3_Sub31) Static119.aClass133_9.next()) {
			if (local18.anInt5879 == 0) {
				Static132.method2605(true, local18);
			}
		}
		if (Static39.aClass13_10 != null) {
			Static43.redraw(Static39.aClass13_10);
			Static39.aClass13_10 = null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
	public static void method2910(@OriginalArg(1) int arg0) {
		@Pc(4) DelayedStateChange local4 = Static238.method4143(8, arg0);
		local4.pushClient();
	}
}
