package app.revanced.patches.youtube.layout.sponsorblock.utils.signature.resolver

import app.revanced.patcher.signature.implementation.method.MethodSignature
import app.revanced.patcher.signature.implementation.method.resolver.PatternScanResult
import app.revanced.patcher.signature.implementation.method.resolver.SignatureResolverResult
import app.revanced.patcher.util.proxy.ClassProxy
import org.jf.dexlib2.HiddenApiRestriction
import org.jf.dexlib2.iface.Annotation
import org.jf.dexlib2.iface.Method
import org.jf.dexlib2.iface.MethodImplementation
import org.jf.dexlib2.iface.MethodParameter
import org.jf.dexlib2.iface.reference.MethodReference

internal class SignatureResolverHelper(private val parent: ClassProxy) {
    private val emptyScanResult = PatternScanResult(-1, -1)
    private val emptyMethod = object : EmptyMethod() {}

    fun resolve(signature: MethodSignature) =
        SignatureResolverResult(parent, emptyScanResult, emptyMethod).findParentMethod(signature)

    internal abstract class EmptyMethod : Method {
        override fun validateReference() {
            TODO("Not yet implemented")
        }

        override fun compareTo(other: MethodReference): Int {
            TODO("Not yet implemented")
        }

        override fun getDefiningClass(): String {
            TODO("Not yet implemented")
        }

        override fun getName(): String {
            TODO("Not yet implemented")
        }

        override fun getParameterTypes(): MutableList<out CharSequence> {
            TODO("Not yet implemented")
        }

        override fun getReturnType(): String {
            TODO("Not yet implemented")
        }

        override fun getAnnotations(): MutableSet<out Annotation> {
            TODO("Not yet implemented")
        }

        override fun getAccessFlags(): Int {
            TODO("Not yet implemented")
        }

        override fun getHiddenApiRestrictions(): MutableSet<HiddenApiRestriction> {
            TODO("Not yet implemented")
        }

        override fun getParameters(): MutableList<out MethodParameter> {
            TODO("Not yet implemented")
        }

        override fun getImplementation(): MethodImplementation? {
            TODO("Not yet implemented")
        }
    }
}


