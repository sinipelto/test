import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class JagString implements StringInterface {

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "Lclient!na;")
    public static final JagString EMPTY = parse("");
    @OriginalMember(owner = "client!na", name = "T", descriptor = "[B")
	public byte[] chars;

	@OriginalMember(owner = "client!na", name = "lb", descriptor = "I")
	public int length;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "Z")
	private boolean aBoolean193 = true;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([Lclient!na;B)Lclient!na;")
    public static JagString concatenate(@OriginalArg(0) JagString[] arg0) {
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return method2355(0, arg0.length, arg0);
    }

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[Lclient!na;I)Lclient!na;")
	public static JagString method2355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) JagString[] arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			if (arg2[arg0 + local7] == null) {
				arg2[local7 + arg0] = Static193.aClass100_853;
			}
			local5 += arg2[local7 + arg0].length;
		}
		@Pc(39) byte[] local39 = new byte[local5];
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 0; local43 < arg1; local43++) {
			@Pc(52) JagString local52 = arg2[local43 + arg0];
			copy(local52.chars, 0, local39, local41, local52.length);
			local41 += local52.length;
		}
		@Pc(71) JagString local71 = new JagString();
		local71.length = local5;
		local71.chars = local39;
		return local71;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([BI[BII)V")
	public static void copy(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15;
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				local15 = arg4 - 1;
				@Pc(19) int local19 = arg1 + local15;
				@Pc(23) int local23 = arg3 + local15;
				local15 = local19 - local15;
				local15 += 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
					arg2[local23--] = arg0[local19--];
				}
				local15 -= 7;
				while (local19 >= local15) {
					arg2[local23--] = arg0[local19--];
				}
				return;
			}
		}
		local15 = arg4 + arg1;
		@Pc(115) int local115 = local15 - 7;
		while (arg1 < local115) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		local15 = local115 + 7;
		while (arg1 < local15) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!na;")
    public static JagString parse(@OriginalArg(0) String arg0) {
        @Pc(6) byte[] local6 = arg0.getBytes();
        @Pc(9) int local9 = local6.length;
        @Pc(13) JagString local13 = new JagString();
        @Pc(15) int local15 = 0;
        local13.chars = new byte[local9];
        while (local9 > local15) {
            @Pc(29) int local29 = local6[local15++] & 0xFF;
            if (local29 <= 45 && local29 >= 40) {
                if (local15 >= local9) {
                    break;
                }
                @Pc(51) int local51 = local6[local15++] & 0xFF;
                local13.chars[local13.length++] = (byte) (local51 + (local29 + -40) * 43 - 48);
            } else if (local29 != 0) {
                local13.chars[local13.length++] = (byte) local29;
            }
        }
        local13.method3156();
        return local13.method3151();
    }

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Ljava/net/URL;")
	public final URL method3107() throws MalformedURLException {
		return new URL(new String(this.chars, 0, this.length));
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!na;)Z")
	public final boolean strEquals(@OriginalArg(1) JagString arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (this.length == arg0.length) {
			@Pc(29) byte[] local29 = arg0.chars;
			@Pc(32) byte[] local32 = this.chars;
			for (@Pc(34) int local34 = 0; local34 < this.length; local34++) {
				if (local32[local34] != local29[local34]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)I")
	public final int parseHexString(@OriginalArg(1) int arg0) {
		@Pc(14) boolean local14 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.length; local24++) {
			@Pc(43) int local43 = this.chars[local24] & 0xFF;
			if (local24 == 0) {
				if (local43 == 45) {
					local14 = true;
					continue;
				}
				if (local43 == 43) {
					continue;
				}
			}
			if (local43 >= 48 && local43 <= 57) {
				local43 -= 48;
			} else if (local43 >= 65 && local43 <= 90) {
				local43 -= 55;
			} else if (local43 >= 97 && local43 <= 122) {
				local43 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local43) {
				throw new NumberFormatException();
			}
			if (local14) {
				local43 = -local43;
			}
			@Pc(117) int local117 = local43 + local22 * arg0;
			if (local117 / arg0 != local22) {
				throw new NumberFormatException();
			}
			local22 = local117;
			local20 = true;
		}
		if (!local20) {
			throw new NumberFormatException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!na;)Z")
	public final boolean equalsIgnoreCase(@OriginalArg(1) JagString arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.length == arg0.length) {
			for (@Pc(28) int local28 = 0; local28 < this.length; local28++) {
				@Pc(41) byte local41 = this.chars[local28];
				if (local41 >= 65 && local41 <= 90 || local41 >= -64 && local41 <= -34 && local41 != -41) {
					local41 = (byte) (local41 + 32);
				}
				@Pc(75) byte local75 = arg0.chars[local28];
				if (local75 >= 65 && local75 <= 90 || local75 >= -64 && local75 <= -34 && local75 != -41) {
					local75 = (byte) (local75 + 32);
				}
				if (local41 != local75) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	public final void method3112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.chars, 0, this.length, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.chars, 0, this.length);
		}
		arg2.drawString(local17, arg1, arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!na;Z)Lclient!na;")
	public final JagString method3113(@OriginalArg(0) JagString arg0) {
		if (!this.aBoolean193) {
			throw new IllegalArgumentException();
		}
		if (arg0.length + this.length > this.chars.length) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < arg0.length + this.length; local31 += local31) {
			}
			@Pc(51) byte[] local51 = new byte[local31];
			copy(this.chars, 0, local51, 0, this.length);
			this.chars = local51;
		}
		copy(arg0.chars, 0, this.chars, this.length, arg0.length);
		this.length += arg0.length;
		return this;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Lclient!na;")
	public final JagString toLowerCase() {
		@Pc(14) JagString local14 = new JagString();
		local14.length = this.length;
		local14.chars = new byte[this.length];
		for (@Pc(29) int local29 = 0; local29 < this.length; local29++) {
			@Pc(42) byte local42 = this.chars[local29];
			if (local42 >= 65 && local42 <= 90 || local42 >= -64 && local42 <= -34 && local42 != -41) {
				local42 = (byte) (local42 + 32);
			}
			local14.chars[local29] = local42;
		}
		return local14;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Lclient!na;")
	public final JagString encodeMessage() {
		@Pc(7) byte local7 = 2;
		@Pc(11) JagString local11 = new JagString();
		local11.length = this.length;
		local11.chars = new byte[this.length];
		for (@Pc(28) int local28 = 0; local28 < this.length; local28++) {
			@Pc(41) byte local41 = this.chars[local28];
			if (local41 >= 97 && local41 <= 122 || !(local41 < -32 || local41 > -2 || local41 == -9)) {
				if (local7 == 2) {
					local41 = (byte) (local41 - 32);
				}
				local7 = 0;
			} else if (local41 >= 65 && local41 <= 90 || !(local41 < -64 || local41 > -34 || local41 == -41)) {
				if (local7 == 0) {
					local41 = (byte) (local41 + 32);
				}
				local7 = 0;
			} else if (local41 == 46 || local41 == 33 || local41 == 63) {
				local7 = 2;
			} else if (local41 != 32) {
				local7 = 1;
			} else if (local7 != 2) {
				local7 = 1;
			}
			local11.chars[local28] = local41;
		}
		return local11;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)J")
	public final long longHashCode() {
		@Pc(1) long local1 = 0L;
		for (@Pc(9) int local9 = 0; local9 < this.length; local9++) {
			local1 = (long) (this.chars[local9] & 0xFF) + (local1 << 5) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)I")
	public final int length() {
		return this.length;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!na;II)Lclient!na;")
	public final JagString method3122(@OriginalArg(1) JagString arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.aBoolean193) {
			throw new IllegalArgumentException();
		} else if (arg1 >= 0 && arg1 <= arg2 && arg2 <= arg0.length) {
			if (this.length + arg2 - arg1 > this.chars.length) {
				@Pc(43) int local43;
				for (local43 = 1; local43 < this.length + arg0.length; local43 += local43) {
				}
				@Pc(63) byte[] local63 = new byte[local43];
				copy(this.chars, 0, local63, 0, this.length);
				this.chars = local63;
			}
			copy(arg0.chars, arg1, this.chars, this.length, arg2 - arg1);
			this.length += arg2 - arg1;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)Z")
	public final boolean isInt() {
		return this.method3141();
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)Lclient!na;")
	public final JagString method3124() {
		@Pc(7) JagString local7 = new JagString();
		local7.length = this.length;
		local7.chars = new byte[local7.length];
		for (@Pc(24) int local24 = 0; local24 < this.length; local24++) {
			local7.chars[this.length - local24 - 1] = this.chars[local24];
		}
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Lclient!na;")
	public final JagString toTitleCase() {
		@Pc(9) JagString local9 = new JagString();
		local9.length = this.length;
		local9.chars = new byte[this.length];
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.length; local22++) {
			@Pc(41) byte local41 = this.chars[local22];
			if (local41 == 95) {
				local20 = true;
				local9.chars[local22] = 32;
			} else if (local41 >= 97 && local41 <= 122 && local20) {
				local20 = false;
				local9.chars[local22] = (byte) (local41 - 32);
			} else {
				local9.chars[local22] = local41;
				local20 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(BLclient!na;)I")
	public final int method3126(@OriginalArg(1) JagString arg0) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = arg0.length;
		@Pc(20) int local20 = this.length;
		@Pc(23) int local23 = this.length;
		@Pc(26) int local26 = arg0.length;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		while (local20 != 0 && local17 != 0) {
			if (local12 == 156 || local12 == 230) {
				local12 = 101;
			} else if (local12 == 140 || local12 == 198) {
				local12 = 69;
			} else if (local12 == 223) {
				local12 = 115;
			} else {
				local12 = this.chars[local28] & 0xFF;
				local28++;
			}
			if (Static17.method530(local12)) {
				local23++;
			} else {
				local20--;
			}
			if (local14 == 156 || local14 == 230) {
				local14 = 101;
			} else if (local14 == 140 || local14 == 198) {
				local14 = 69;
			} else if (local14 == 223) {
				local14 = 115;
			} else {
				local14 = arg0.chars[local30] & 0xFF;
				local30++;
			}
			if (Static17.method530(local14)) {
				local26++;
			} else {
				local17--;
			}
			if (Static266.anIntArray471[local12] < Static266.anIntArray471[local14]) {
				return -1;
			}
			if (Static266.anIntArray471[local14] < Static266.anIntArray471[local12]) {
				return 1;
			}
		}
		if (local26 <= local23) {
			return local23 > local26 ? 1 : 0;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/net/URL;Z)Ljava/net/URL;")
	public final URL method3127(@OriginalArg(0) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.chars, 0, this.length));
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)Lclient!na;")
	public final JagString method3128(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(23) JagString local23 = new JagString();
		local23.chars = new byte[this.length + 1];
		local23.length = this.length + 1;
		copy(this.chars, 0, local23.chars, 0, this.length);
		local23.chars[this.length] = (byte) arg0;
		return local23;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(Z)V")
	public final void print() {
		@Pc(16) String local16;
		try {
			local16 = new String(this.chars, 0, this.length, "ISO-8859-1");
		} catch (@Pc(18) UnsupportedEncodingException local18) {
			local16 = new String(this.chars, 0, this.length);
		}
		System.out.println(local16);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(BLclient!na;)Z")
	public final boolean method3130(@OriginalArg(1) JagString arg0) {
		if (arg0.length > this.length) {
			return false;
		}
		@Pc(19) int local19 = this.length - arg0.length;
		for (@Pc(27) int local27 = 0; local27 < arg0.length; local27++) {
			if (this.chars[local19 + local27] != arg0.chars[local27]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!na;I)I")
	public final int indexOf(@OriginalArg(0) JagString arg0) {
		return this.indexOf(arg0, 0);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)I")
	public final int parseInt() {
		return this.parseHexString(10);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)V")
	public final void method3133(@OriginalArg(0) int arg0) {
		if (!this.aBoolean193) {
			throw new IllegalArgumentException();
		} else if (arg0 < 0) {
			throw new IllegalArgumentException();
		} else {
			@Pc(30) int local30;
			if (arg0 > this.chars.length) {
				for (local30 = 1; local30 < arg0; local30 += local30) {
				}
				@Pc(45) byte[] local45 = new byte[local30];
				copy(this.chars, 0, local45, 0, this.length);
				this.chars = local45;
			}
			for (local30 = this.length; local30 < arg0; local30++) {
				this.chars[local30] = 32;
			}
			this.length = arg0;
		}
	}

	@OriginalMember(owner = "client!na", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public final String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLjava/applet/Applet;)V")
	public final void method3134(@OriginalArg(1) Applet arg0) throws Throwable {
		@Pc(16) String local16 = new String(this.chars, 0, this.length);
		Static287.method1759(arg0, local16);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)I")
	public final int indexOf(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte local4 = (byte) arg0;
		for (@Pc(15) int local15 = arg1; local15 < this.length; local15++) {
			if (this.chars[local15] == local4) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)Lclient!na;")
	public final JagString substring(@OriginalArg(0) int arg0) {
		return this.substring(this.length, arg0);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)Lclient!na;")
	public final JagString substring(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) JagString local7 = new JagString();
		local7.length = arg0 - arg1;
		local7.chars = new byte[arg0 - arg1];
		copy(this.chars, arg1, local7.chars, 0, local7.length);
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Lclient!na;I)Z")
	public final boolean startsWith(@OriginalArg(0) JagString arg0) {
		if (this.length < arg0.length) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
			if (this.chars[local19] != arg0.chars[local19]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public final boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof JagString)) {
			throw new IllegalArgumentException();
		}
		return this.strEquals((JagString) arg0);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(Lclient!na;I)I")
	public final int method3139(@OriginalArg(0) JagString arg0) {
		@Pc(20) int local20;
		if (arg0.length < this.length) {
			local20 = arg0.length;
		} else {
			local20 = this.length;
		}
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			if ((this.chars[local27] & 0xFF) < (arg0.chars[local27] & 0xFF)) {
				return -1;
			}
			if ((arg0.chars[local27] & 0xFF) < (this.chars[local27] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.length > this.length) {
			return -1;
		} else if (arg0.length >= this.length) {
			return 0;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!na;ZLclient!na;)Lclient!na;")
	public final JagString method3140(@OriginalArg(0) JagString arg0, @OriginalArg(2) JagString arg1) {
		@Pc(8) int local8 = this.length;
		@Pc(14) int local14 = arg0.length - arg1.length;
		@Pc(16) int local16 = 0;
		while (true) {
			@Pc(22) int local22 = this.indexOf(arg1, local16);
			if (local22 < 0) {
				local16 = 0;
				@Pc(45) JagString local45 = Static87.allocate(local8);
				while (true) {
					@Pc(51) int local51 = this.indexOf(arg1, local16);
					if (local51 < 0) {
						while (local16 < this.length) {
							local45.append(this.chars[local16++] & 0xFF);
						}
						return local45;
					}
					while (local16 < local51) {
						local45.append(this.chars[local16++] & 0xFF);
					}
					local45.method3113(arg0);
					local16 += arg1.length;
				}
			}
			local16 = local22 + arg1.length;
			local8 += local14;
		}
	}

	@OriginalMember(owner = "client!na", name = "hashCode", descriptor = "()I")
	@Override
	public final int hashCode() {
		return this.method3154();
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IZ)Z")
	private boolean method3141() {
		@Pc(18) boolean local18 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.length; local28++) {
			@Pc(39) int local39 = this.chars[local28] & 0xFF;
			if (local28 == 0) {
				if (local39 == 45) {
					local24 = true;
					continue;
				}
				if (local39 == 43) {
					continue;
				}
			}
			if (local39 >= 48 && local39 <= 57) {
				local39 -= 48;
			} else if (local39 >= 65 && local39 <= 90) {
				local39 -= 55;
			} else if (local39 >= 97 && local39 <= 122) {
				local39 -= 87;
			} else {
				return false;
			}
			if (local39 >= 10) {
				return false;
			}
			if (local24) {
				local39 = -local39;
			}
			@Pc(110) int local110 = local39 + local26 * 10;
			if (local26 != local110 / 10) {
				return false;
			}
			local26 = local110;
			local18 = true;
		}
		return local18;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(BLclient!na;)Z")
	public final boolean method3142(@OriginalArg(1) JagString arg0) {
		if (this.length < arg0.length) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
			@Pc(30) byte local30 = this.chars[local21];
			@Pc(35) byte local35 = arg0.chars[local21];
			if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
				local35 = (byte) (local35 + 32);
			}
			if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
				local30 = (byte) (local30 + 32);
			}
			if (local30 != local35) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(I)Lclient!na;")
	public final JagString asString() {
		return this;
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "(I)Lclient!na;")
	public final JagString trim() {
		@Pc(17) int local17;
		for (local17 = 0; local17 < this.length && (this.chars[local17] >= 0 && this.chars[local17] <= 32 || (this.chars[local17] & 0xFF) == 160); local17++) {
		}
		@Pc(53) int local53;
		for (local53 = this.length; local53 > local17 && (this.chars[local53 - 1] >= 0 && this.chars[local53 - 1] <= 32 || (this.chars[local53 - 1] & 0xFF) == 160); local53--) {
		}
		if (local17 == 0 && this.length == local53) {
			return this;
		}
		@Pc(111) JagString local111 = new JagString();
		local111.length = local53 - local17;
		local111.chars = new byte[local111.length];
		for (@Pc(124) int local124 = 0; local124 < local111.length; local124++) {
			local111.chars[local124] = this.chars[local17 + local124];
		}
		return local111;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(III)Lclient!na;")
	public final JagString replaceSlashWithSpace() {
		@Pc(8) JagString str = new JagString();
		str.length = this.length;
		str.chars = new byte[this.length];
		for (@Pc(31) int i = 0; i < this.length; i++) {
			@Pc(44) byte c = this.chars[i];
			if (c == 47) {
				str.chars[i] = 32;
			} else {
				str.chars[i] = c;
			}
		}
		return str;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!na;II)I")
	public final int indexOf(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.length;
		if (arg1 >= this.length) {
			return local8 == 0 ? this.length : -1;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (local8 == 0) {
			return arg1;
		}
		@Pc(41) int local41 = this.length - local8;
		@Pc(44) byte[] local44 = arg0.chars;
		@Pc(48) byte local48 = local44[0];
		for (@Pc(50) int local50 = arg1; local50 <= local41; local50++) {
			if (local48 != this.chars[local50]) {
				do {
					local50++;
					if (local50 > local41) {
						return -1;
					}
				} while (local48 != this.chars[local50]);
			}
			@Pc(88) boolean local88 = true;
			@Pc(92) int local92 = local50 + 1;
			for (@Pc(94) int local94 = 1; local94 < local8; local94++) {
				if (local44[local94] != this.chars[local92]) {
					local88 = false;
					break;
				}
				local92++;
			}
			if (local88) {
				return local50;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)[Lclient!na;")
	public final JagString[] split(@OriginalArg(0) int delim) {
		@Pc(7) int matches = 0;
		for (@Pc(9) int i = 0; i < this.length; i++) {
			if (delim == this.chars[i]) {
				matches++;
			}
		}
		@Pc(37) JagString[] parts = new JagString[matches + 1];
		if (matches == 0) {
			parts[0] = this;
			return parts;
		}
		@Pc(47) int part = 0;
		@Pc(49) int start = 0;
		for (@Pc(51) int i = 0; i < matches; i++) {
			@Pc(68) int end;
			for (end = 0; delim != this.chars[end + start]; end++) {
			}
			parts[part++] = this.substring(start + end, start);
			start += end + 1;
		}
		parts[matches] = this.substring(this.length, start);
		return parts;
	}

	@OriginalMember(owner = "client!na", name = "i", descriptor = "(I)[B")
	public final byte[] method3148() {
		@Pc(7) byte[] local7 = new byte[this.length];
		copy(this.chars, 0, local7, 0, this.length);
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(IB)I")
	public final int charAt(@OriginalArg(0) int arg0) {
		return this.chars[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(B)Lclient!na;")
	public final JagString method3151() {
		@Pc(9) long local9 = this.longHashCode();
		@Pc(19) Class local19 = JagString.class;
		synchronized (local19) {
			@Pc(30) StringNode local30;
			if (Static148.aClass133_13 == null) {
				Static148.aClass133_13 = new HashTable(4096);
			} else {
				for (local30 = (StringNode) Static148.aClass133_13.get(local9); local30 != null; local30 = (StringNode) Static148.aClass133_13.nextWithKey()) {
					if (this.strEquals(local30.value)) {
						return local30.value;
					}
				}
			}
			local30 = new StringNode();
			local30.value = this;
			this.aBoolean193 = false;
			Static148.aClass133_13.put(local30, local9);
			return this;
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(IB)Lclient!na;")
	public final JagString append(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean193) {
			if (this.length == this.chars.length) {
				@Pc(44) int local44;
				for (local44 = 1; local44 <= this.length; local44 += local44) {
				}
				@Pc(61) byte[] local61 = new byte[local44];
				copy(this.chars, 0, local61, 0, this.length);
				this.chars = local61;
			}
			this.chars[this.length++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/applet/Applet;)Lclient!na;")
	public final JagString fromParameters(@OriginalArg(1) Applet arg0) {
		@Pc(19) String local19 = new String(this.chars, 0, this.length);
		@Pc(23) String local23 = arg0.getParameter(local19);
		return local23 == null ? null : Static230.method3952(local23);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(Z)I")
	public final int method3154() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.length; local14++) {
			local7 = (this.chars[local14] & 0xFF) + (local7 << 5) - local7;
		}
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public final int method3155(@OriginalArg(1) FontMetrics arg0) {
		@Pc(14) String local14;
		try {
			local14 = new String(this.chars, 0, this.length, "ISO-8859-1");
		} catch (@Pc(16) UnsupportedEncodingException local16) {
			local14 = new String(this.chars, 0, this.length);
		}
		return arg0.stringWidth(local14);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(B)Lclient!na;")
	public final JagString method3156() {
		if (!this.aBoolean193) {
			throw new IllegalArgumentException();
		}
		if (this.chars.length != this.length) {
			@Pc(26) byte[] local26 = new byte[this.length];
			copy(this.chars, 0, local26, 0, this.length);
			this.chars = local26;
		}
		return this;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;")
	public final Object browserControlCall(@OriginalArg(1) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.chars, 0, this.length);
		@Pc(17) Object local17 = Static287.method1757(local12, arg0);
		if (local17 instanceof String) {
			@Pc(24) byte[] local24 = ((String) local17).getBytes();
			local17 = Static10.decodeString(local24, local24.length, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "(I)J")
	public final long encode37() {
		@Pc(7) long local7 = 0L;
		for (@Pc(14) int local14 = 0; this.length > local14 && local14 < 12; local14++) {
			@Pc(32) byte local32 = this.chars[local14];
			local7 *= 37L;
			if (local32 >= 65 && local32 <= 90) {
				local7 += local32 + 1 - 65;
			} else if (local32 >= 97 && local32 <= 122) {
				local7 += local32 + 1 - 97;
			} else if (local32 >= 48 && local32 <= 57) {
				local7 += local32 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "(I)Lclient!na;")
	public final JagString method3159() {
		@Pc(9) JagString local9 = Base37.decode37(this.encode37());
		return local9 == null ? Static228.aClass100_967 : local9;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z[BIII)I")
	public final int encodeString(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		copy(this.chars, 0, arg0, arg1, arg2);
		return arg2;
	}
}
