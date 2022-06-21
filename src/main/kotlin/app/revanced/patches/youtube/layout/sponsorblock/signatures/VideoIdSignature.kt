package app.revanced.patches.youtube.layout.sponsorblock.signatures

import app.revanced.patcher.annotation.Name
import app.revanced.patcher.annotation.Version
import app.revanced.patcher.extensions.or
import app.revanced.patcher.signature.implementation.method.MethodSignature
import app.revanced.patcher.signature.implementation.method.annotation.DirectPatternScanMethod
import app.revanced.patcher.signature.implementation.method.annotation.MatchingMethod
import app.revanced.patches.youtube.layout.sponsorblock.annotations.SponsorBlockCompatibility
import org.jf.dexlib2.AccessFlags
import org.jf.dexlib2.Opcode

@Name("video-id-signature")
@MatchingMethod(
    "Lcom/google/android/apps/youtube/app/common/player/PlaybackLifecycleMonitor;", "l"
)
@DirectPatternScanMethod
@SponsorBlockCompatibility
@Version("0.0.1")
object VideoIdSignature : MethodSignature(
    "V", AccessFlags.DECLARED_SYNCHRONIZED or AccessFlags.FINAL or AccessFlags.PUBLIC, listOf("L"), listOf(
        Opcode.INVOKE_INTERFACE,
    )
)