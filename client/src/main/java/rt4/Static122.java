package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static122 {

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_591 = JagString.parse("(Udns");

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ve;ZIIZI)V")
	public static void method2410(@OriginalArg(0) Js5 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		Static172.aClass153_70 = arg0;
		MidiPlayer.anInt441 = 1;
		MidiPlayer.anInt5527 = arg2;
		Static226.anInt5085 = 0;
		MidiPlayer.anInt5853 = arg1;
		MidiPlayer.aBoolean116 = false;
		MidiPlayer.anInt1757 = 10000;
	}

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!ve;Lclient!ve;I)Lclient!dd;")
	public static SoftwareFont method2412(@OriginalArg(0) int arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Js5 arg2) {
		return SpriteLoader.decode(arg2, 0, arg0) ? Static114.method4635(arg1.getFile(arg0, 0)) : null;
	}
}
