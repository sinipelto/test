import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!qf;")
	public static Sprite aClass3_Sub2_Sub1_9;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lclient!na;")
	public static final JagString aClass100_810 = JagString.parse("::qa_op_test");

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!na;")
	public static final JagString aClass100_811 = JagString.parse("::wm1");

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg5 >= TextureOp29.anInt4164 && arg5 <= TextureOp29.anInt5063 && arg0 >= TextureOp29.anInt4164 && arg0 <= TextureOp29.anInt5063 && arg6 >= TextureOp29.anInt4164 && TextureOp29.anInt5063 >= arg6 && TextureOp29.anInt4164 <= arg1 && arg1 <= TextureOp29.anInt5063 && TextureOp29.anInt5773 <= arg4 && arg4 <= TextureOp29.anInt2869 && arg7 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= arg7 && arg2 >= TextureOp29.anInt5773 && TextureOp29.anInt2869 >= arg2 && arg3 >= TextureOp29.anInt5773 && arg3 <= TextureOp29.anInt2869) {
			Static38.method962(arg2, arg8, arg7, arg6, arg1, arg3, arg4, arg0, arg5);
		} else {
			Static165.method3162(arg5, arg0, arg7, arg8, arg3, arg2, arg1, arg6, arg4);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Lclient!na;")
	public static JagString method3341(@OriginalArg(0) int arg0) {
		return JagString.concatenate(new JagString[] { Static123.parseInt(arg0 >> 24 & 0xFF), Static233.aClass100_994, Static123.parseInt(arg0 >> 16 & 0xFF), Static233.aClass100_994, Static123.parseInt(arg0 >> 8 & 0xFF), Static233.aClass100_994, Static123.parseInt(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V")
	public static void method3345(@OriginalArg(0) int arg0) {
		@Pc(8) DelayedStateChange local8 = Static238.method4143(5, arg0);
		local8.pushClient();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
	public static void method3346(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static53.method1292(arg1, arg0.length - 1, arg0, 0);
	}

}
