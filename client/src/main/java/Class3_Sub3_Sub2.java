import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class3_Sub3_Sub2 extends PcmStream {

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "Lclient!ih;")
	private final Class69 aClass69_43 = new Class69();

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "Lclient!ih;")
	private final Class69 aClass69_44 = new Class69();

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
	private int anInt1780 = 0;

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
	private int anInt1781 = -1;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!cc;)V")
	private void method1342(@OriginalArg(0) Class3_Sub6 arg0) {
		arg0.method4658();
		arg0.method780();
		@Pc(9) Node local9 = this.aClass69_44.aClass3_109.aClass3_222;
		if (local9 == this.aClass69_44.aClass3_109) {
			this.anInt1781 = -1;
		} else {
			this.anInt1781 = ((Class3_Sub6) local9).anInt905;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!qb;)V")
	public final synchronized void method1343(@OriginalArg(0) PcmStream arg0) {
		this.aClass69_43.method2283(arg0);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "([III)V")
	@Override
	public final synchronized void method4408(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1781 < 0) {
				this.method1346(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1780 + arg2 < this.anInt1781) {
				this.anInt1780 += arg2;
				this.method1346(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1781 - this.anInt1780;
			this.method1346(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1780 += local33;
			this.method1344();
			@Pc(60) Class3_Sub6 local60 = (Class3_Sub6) this.aClass69_44.method2289();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method779(this);
				if (local68 < 0) {
					local60.anInt905 = 0;
					this.method1342(local60);
				} else {
					local60.anInt905 = local68;
					this.method1348(local60.aClass3_222, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "()V")
	private void method1344() {
		if (this.anInt1780 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub6 local8 = (Class3_Sub6) this.aClass69_44.method2289(); local8 != null; local8 = (Class3_Sub6) this.aClass69_44.method2288()) {
			local8.anInt905 -= this.anInt1780;
		}
		this.anInt1781 -= this.anInt1780;
		this.anInt1780 = 0;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lclient!qb;")
	@Override
	public final PcmStream method4406() {
		return (PcmStream) this.aClass69_43.method2289();
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
	private void method1345(@OriginalArg(0) int arg0) {
		for (@Pc(5) PcmStream local5 = (PcmStream) this.aClass69_43.method2289(); local5 != null; local5 = (PcmStream) this.aClass69_43.method2288()) {
			local5.method4410(arg0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "([III)V")
	private void method1346(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) PcmStream local5 = (PcmStream) this.aClass69_43.method2289(); local5 != null; local5 = (PcmStream) this.aClass69_43.method2288()) {
			local5.method4405(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(Lclient!qb;)V")
	public final synchronized void method1347(@OriginalArg(0) PcmStream arg0) {
		arg0.method4658();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()I")
	@Override
	public final int method4404() {
		return 0;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	@Override
	public final synchronized void method4410(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1781 < 0) {
				this.method1345(arg0);
				return;
			}
			if (this.anInt1780 + arg0 < this.anInt1781) {
				this.anInt1780 += arg0;
				this.method1345(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1781 - this.anInt1780;
			this.method1345(local29);
			arg0 -= local29;
			this.anInt1780 += local29;
			this.method1344();
			@Pc(50) Class3_Sub6 local50 = (Class3_Sub6) this.aClass69_44.method2289();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method779(this);
				if (local58 < 0) {
					local50.anInt905 = 0;
					this.method1342(local50);
				} else {
					local50.anInt905 = local58;
					this.method1348(local50.aClass3_222, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "()Lclient!qb;")
	@Override
	public final PcmStream method4409() {
		return (PcmStream) this.aClass69_43.method2288();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ab;Lclient!cc;)V")
	private void method1348(@OriginalArg(0) Node arg0, @OriginalArg(1) Class3_Sub6 arg1) {
		while (arg0 != this.aClass69_44.aClass3_109 && ((Class3_Sub6) arg0).anInt905 <= arg1.anInt905) {
			arg0 = arg0.aClass3_222;
		}
		Static183.method3331(arg1, arg0);
		this.anInt1781 = ((Class3_Sub6) this.aClass69_44.aClass3_109.aClass3_222).anInt905;
	}
}
