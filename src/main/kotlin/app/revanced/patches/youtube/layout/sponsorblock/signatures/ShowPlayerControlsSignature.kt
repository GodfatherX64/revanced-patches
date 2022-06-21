package app.revanced.patches.youtube.layout.sponsorblock.signatures

import app.revanced.patcher.annotation.Name
import app.revanced.patcher.annotation.Version
import app.revanced.patcher.signature.implementation.method.MethodSignature
import app.revanced.patcher.signature.implementation.method.annotation.DirectPatternScanMethod
import app.revanced.patcher.signature.implementation.method.annotation.MatchingMethod
import app.revanced.patches.youtube.layout.sponsorblock.annotations.SponsorBlockCompatibility

@Name("show-player-controls-signature")
@MatchingMethod(
    "LYouTubeControlsOverlay;", "ac"
)
@DirectPatternScanMethod
@SponsorBlockCompatibility
@Version("0.0.1")
object ShowPlayerControlsSignature : MethodSignature(
    "V", null, listOf("Z","Z"), null,  null
)