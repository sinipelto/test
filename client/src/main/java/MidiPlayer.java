import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MidiPlayer {
    @OriginalMember(owner = "client!le", name = "k", descriptor = "Z")
    public static boolean jingle = false;
    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "Lclient!le;")
    public static SoundBank aClass89_1;
    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int anInt441 = 0;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(Z)Z")
    public static boolean method2699() {
        try {
            if (anInt441 == 2) {
                if (Static144.aClass3_Sub29_1 == null) {
                    Static144.aClass3_Sub29_1 = Song.create(Static172.aClass153_70, Static277.anInt5853, Static226.anInt5085);
                    if (Static144.aClass3_Sub29_1 == null) {
                        return false;
                    }
                }
                if (aClass89_1 == null) {
                    aClass89_1 = new SoundBank(Static78.aClass153_32, Static252.aClass153_103);
                }
                if (Static172.aClass3_Sub3_Sub4_2.method4411(Static144.aClass3_Sub29_1, Static210.aClass153_87, aClass89_1)) {
                    Static172.aClass3_Sub3_Sub4_2.method4412();
                    Static172.aClass3_Sub3_Sub4_2.method4447(Static253.anInt5527);
                    Static172.aClass3_Sub3_Sub4_2.method4431(Static72.aBoolean116, Static144.aClass3_Sub29_1);
                    anInt441 = 0;
                    Static144.aClass3_Sub29_1 = null;
                    aClass89_1 = null;
                    Static172.aClass153_70 = null;
                    return true;
                }
            }
        } catch (@Pc(68) Exception local68) {
            local68.printStackTrace();
            Static172.aClass3_Sub3_Sub4_2.method4446();
            Static172.aClass153_70 = null;
            Static144.aClass3_Sub29_1 = null;
            anInt441 = 0;
            aClass89_1 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
    public static void method801() {
        Static253.anInt5527 = 0;
        Static226.anInt5085 = -1;
        anInt441 = 1;
        Static57.anInt1757 = 2;
        Static72.aBoolean116 = false;
        Static172.aClass153_70 = null;
        Static277.anInt5853 = -1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZIILclient!ve;ZII)V")
    public static void playFadeOut(@OriginalArg(1) int arg0, @OriginalArg(3) Js5 arg1, @OriginalArg(5) int arg2) {
        Static172.aClass153_70 = arg1;
        Static226.anInt5085 = 0;
        Static277.anInt5853 = arg0;
        Static72.aBoolean116 = false;
        anInt441 = 1;
        Static57.anInt1757 = 2;
        Static253.anInt5527 = arg2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!va;Lclient!ve;Lclient!ve;Lclient!ve;)Z")
    public static boolean init(@OriginalArg(1) MidiPcmStream arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Js5 arg2, @OriginalArg(4) Js5 arg3) {
        Static210.aClass153_87 = arg1;
        Static78.aClass153_32 = arg3;
        Static252.aClass153_103 = arg2;
        Static172.aClass3_Sub3_Sub4_2 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    public static void loop() {
        try {
            if (anInt441 == 1) {
                @Pc(16) int local16 = Static172.aClass3_Sub3_Sub4_2.method4440();
                if (local16 > 0 && Static172.aClass3_Sub3_Sub4_2.method4414()) {
                    local16 -= Static57.anInt1757;
                    if (local16 < 0) {
                        local16 = 0;
                    }
                    Static172.aClass3_Sub3_Sub4_2.method4447(local16);
                    return;
                }
                Static172.aClass3_Sub3_Sub4_2.method4446();
                Static172.aClass3_Sub3_Sub4_2.method4426();
                Static144.aClass3_Sub29_1 = null;
                aClass89_1 = null;
                if (Static172.aClass153_70 == null) {
                    anInt441 = 0;
                } else {
                    anInt441 = 2;
                }
            }
        } catch (@Pc(62) Exception local62) {
            local62.printStackTrace();
            Static172.aClass3_Sub3_Sub4_2.method4446();
            Static172.aClass153_70 = null;
            Static144.aClass3_Sub29_1 = null;
            anInt441 = 0;
            aClass89_1 = null;
        }
    }
}
