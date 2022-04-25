import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class DelayedStateChange extends SecondaryNode {

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!sc;")
	public static final HashTable changes = new HashTable(16);
	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!ce;")
	public static final SecondaryLinkedList clientQueue = new SecondaryLinkedList();
	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Lclient!ce;")
	public static final SecondaryLinkedList serverQueue = new SecondaryLinkedList();
	@OriginalMember(owner = "client!da", name = "T", descriptor = "I")
	public int intArg2;

	@OriginalMember(owner = "client!da", name = "U", descriptor = "I")
	public int intArg3;

	@OriginalMember(owner = "client!da", name = "V", descriptor = "I")
	public int intArg1;

	@OriginalMember(owner = "client!da", name = "W", descriptor = "Lclient!na;")
	public JagString stringArg;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(II)V")
	public DelayedStateChange(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.key = (long) arg0 << 32 | (long) arg1;
	}

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)V")
    public static void clear() {
        changes.clear();
        clientQueue.clear();
        serverQueue.clear();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    public static void setComponentModelRotationSpeedServer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(14) DelayedStateChange local14 = Static238.method4143(13, arg1);
        local14.pushServer();
        local14.intArg1 = arg0;
    }

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!na;BI)V")
	public static void method3498(@OriginalArg(0) JagString arg0, @OriginalArg(2) int arg1) {
		@Pc(10) DelayedStateChange local10 = Static238.method4143(2, arg1);
		local10.pushServer();
		local10.stringArg = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(III)V")
	public static void method2905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) DelayedStateChange local14 = Static238.method4143(7, arg0);
		local14.pushServer();
		local14.intArg1 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)V")
	public static void method2606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) DelayedStateChange local8 = Static238.method4143(1, arg0);
		local8.pushServer();
		local8.intArg1 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIBI)V")
	public static void method2607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) DelayedStateChange local8 = Static238.method4143(4, arg2);
		local8.pushServer();
		local8.intArg3 = arg3;
		local8.intArg2 = arg0;
		local8.intArg1 = arg1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	public static void method3893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) DelayedStateChange local14 = Static238.method4143(5, arg0);
		local14.pushServer();
		local14.intArg1 = arg1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIIII)V")
	public static void method4505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) DelayedStateChange local8 = Static238.method4143(8, arg1);
		local8.pushServer();
		local8.intArg2 = arg0;
		local8.intArg1 = arg3;
		local8.intArg3 = arg2;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)V")
	public static void method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) DelayedStateChange local4 = Static238.method4143(6, arg1);
		local4.pushServer();
		local4.intArg1 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII)V")
	public static void method4666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) DelayedStateChange local18 = Static238.method4143(11, arg1);
		local18.pushServer();
		local18.intArg3 = arg2;
		local18.intArg1 = arg0;
	}

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!na;II)V")
    public static void method3617(@OriginalArg(0) JagString arg0, @OriginalArg(2) int arg1) {
        @Pc(6) DelayedStateChange local6 = Static238.method4143(3, arg1);
        local6.pushServer();
        local6.stringArg = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public final void pushClient() {
		this.secondaryKey = MonotonicClock.currentTimeMillis() + 500L | Long.MIN_VALUE & this.secondaryKey;
		clientQueue.addTail(this);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)J")
	public final long getTime() {
		return this.secondaryKey & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)I")
	public final int getType() {
		return (int) (this.key >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(B)I")
	public final int getId() {
		return (int) this.key;
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(B)V")
	public final void pushServer() {
		this.secondaryKey |= Long.MIN_VALUE;
		if (this.getTime() == 0L) {
			serverQueue.addTail(this);
		}
	}
}
