package app.revanced.patches.youtube.layout.sponsorblock.signatures

import app.revanced.patcher.annotation.Name
import app.revanced.patcher.annotation.Version
import app.revanced.patcher.signature.implementation.method.MethodSignature
import app.revanced.patcher.signature.implementation.method.annotation.DirectPatternScanMethod
import app.revanced.patcher.signature.implementation.method.annotation.MatchingMethod
import app.revanced.patches.youtube.layout.sponsorblock.annotations.SponsorBlockCompatibility
import org.jf.dexlib2.Opcode

@Name("player-controller-set-time-reference-signature")
@MatchingMethod(
    "Lxqm;", "<init>"
)
@DirectPatternScanMethod
@SponsorBlockCompatibility
@Version("0.0.1")
object PlayerControllerSetTimeReferenceSignature : MethodSignature(
    null, null, null,
    listOf(Opcode.INVOKE_DIRECT_RANGE,),
    listOf("Media progress reported outside media playback: ")
)