package rt4;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public static int anInt5443;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt5434 = 0;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!na;")
	public static final JagString aClass100_1042 = JagString.parse("Null");

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public static int anInt5444 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method4273() {
		@Pc(14) int playerX = PlayerList.self.xFine + Static132.anInt3291;
		@Pc(20) int playerZ = PlayerList.self.zFine + Static206.anInt4774;
		if (Camera.cameraX - playerX < -500 || Camera.cameraX - playerX > 500 || Camera.cameraZ - playerZ < -500 || Camera.cameraZ - playerZ > 500) {
			Camera.cameraX = playerX;
			Camera.cameraZ = playerZ;
		}
		if (Camera.cameraZ != playerZ) {
			Camera.cameraZ += (playerZ - Camera.cameraZ) / 16;
		}
		if (Camera.cameraX != playerX) {
			Camera.cameraX += (playerX - Camera.cameraX) / 16;
		}
		if (Preferences.aBoolean63) {
			for (@Pc(93) int local93 = 0; local93 < InterfaceList.keyQueueSize; local93++) {
				@Pc(104) int code = InterfaceList.keyCodes[local93];
				if (code == Keyboard.KEY_UP) {
					Camera.pitchTarget += 47;
				} else if (code == Keyboard.KEY_DOWN) {
					Camera.pitchTarget -= 17;
				} else if (code == Keyboard.KEY_LEFT) {
					Camera.yawTarget -= 65;
				} else if (code == Keyboard.KEY_RIGHT) {
					Camera.yawTarget += 191;
				}
			}
			Camera.clampCameraAngle();
		}
	}
}
