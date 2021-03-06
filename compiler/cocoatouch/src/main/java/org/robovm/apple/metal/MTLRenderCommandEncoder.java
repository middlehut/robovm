/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.metal;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeProtocolProxy/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/MTLRenderCommandEncoder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLCommandEncoder/*</implements>*/ {

    /*<ptr>*/public static class MTLRenderCommandEncoderPtr extends Ptr<MTLRenderCommandEncoder, MTLRenderCommandEncoderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLRenderCommandEncoder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 8.3 and later.
     */
    public void setVertexBytes(byte[] bytes, long index) {
        setVertexBytes(VM.getArrayValuesAddress(bytes), bytes.length, index);
    }
    public void setVertexBuffers(MTLBuffer[] buffers, long[] offsets, NSRange range) {
        MTLBuffer.MTLBufferPtr bptr = new MTLBuffer.MTLBufferPtr();
        bptr.set(buffers);
        MachineSizedUIntPtr lptr = new MachineSizedUIntPtr();
        lptr.set(offsets);
        setVertexBuffers(bptr, lptr, range);
    }
    public void setVertexTextures(MTLTexture[] textures, NSRange range) {
        MTLTexture.MTLTexturePtr ptr = new MTLTexture.MTLTexturePtr();
        ptr.set(textures);
        setVertexTextures(ptr, range);
    }
    public void setVertexSamplerStates(MTLSamplerState[] samplers, NSRange range) {
        MTLSamplerState.MTLSamplerStatePtr ptr = new MTLSamplerState.MTLSamplerStatePtr();
        ptr.set(samplers);
        setVertexSamplerStates(ptr, range);
    }
    public void setVertexSamplerStates(MTLSamplerState[] samplers, float[] lodMinClamps, float[] lodMaxClamps, NSRange range) {
        MTLSamplerState.MTLSamplerStatePtr sptr = new MTLSamplerState.MTLSamplerStatePtr();
        sptr.set(samplers);
        FloatPtr minptr = new FloatPtr();
        minptr.set(lodMinClamps);
        FloatPtr maxptr = new FloatPtr();
        maxptr.set(lodMaxClamps);
        setVertexSamplerStates(sptr, minptr, maxptr, range);
    }
    /**
     * @since Available in iOS 8.3 and later.
     */
    public void setFragmentBytes(byte[] bytes, long index) {
        setFragmentBytes(VM.getArrayValuesAddress(bytes), bytes.length, index);
    }
    public void setFragmentBuffers(MTLBuffer[] buffers, long[] offsets, NSRange range) {
        MTLBuffer.MTLBufferPtr bptr = new MTLBuffer.MTLBufferPtr();
        bptr.set(buffers);
        MachineSizedUIntPtr lptr = new MachineSizedUIntPtr();
        lptr.set(offsets);
        setFragmentBuffers(bptr, lptr, range);
    }
    public void setFragmentTextures(MTLTexture[] textures, NSRange range) {
        MTLTexture.MTLTexturePtr ptr = new MTLTexture.MTLTexturePtr();
        ptr.set(textures);
        setFragmentTextures(ptr, range);
    }
    public void setFragmentSamplerStates(MTLSamplerState[] samplers, NSRange range) {
        MTLSamplerState.MTLSamplerStatePtr ptr = new MTLSamplerState.MTLSamplerStatePtr();
        ptr.set(samplers);
        setFragmentSamplerStates(ptr, range);
    }
    public void setFragmentSamplerStates(MTLSamplerState[] samplers, float[] lodMinClamps, float[] lodMaxClamps, NSRange range) {
        MTLSamplerState.MTLSamplerStatePtr sptr = new MTLSamplerState.MTLSamplerStatePtr();
        sptr.set(samplers);
        FloatPtr minptr = new FloatPtr();
        minptr.set(lodMinClamps);
        FloatPtr maxptr = new FloatPtr();
        maxptr.set(lodMaxClamps);
        setFragmentSamplerStates(sptr, minptr, maxptr, range);
    }

    /*<methods>*/
    @Method(selector = "setRenderPipelineState:")
    public native void setRenderPipelineState(MTLRenderPipelineState pipelineState);
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Method(selector = "setVertexBytes:length:atIndex:")
    protected native void setVertexBytes(@Pointer long bytes, @MachineSizedUInt long length, @MachineSizedUInt long index);
    @Method(selector = "setVertexBuffer:offset:atIndex:")
    public native void setVertexBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index);
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Method(selector = "setVertexBufferOffset:atIndex:")
    public native void setVertexBufferOffset(@MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Method(selector = "setVertexBuffers:offsets:withRange:")
    protected native void setVertexBuffers(MTLBuffer.MTLBufferPtr buffers, MachineSizedUIntPtr offsets, @ByVal NSRange range);
    @Method(selector = "setVertexTexture:atIndex:")
    public native void setVertexTexture(MTLTexture texture, @MachineSizedUInt long index);
    @Method(selector = "setVertexTextures:withRange:")
    protected native void setVertexTextures(MTLTexture.MTLTexturePtr textures, @ByVal NSRange range);
    @Method(selector = "setVertexSamplerState:atIndex:")
    public native void setVertexSamplerState(MTLSamplerState sampler, @MachineSizedUInt long index);
    @Method(selector = "setVertexSamplerStates:withRange:")
    protected native void setVertexSamplerStates(MTLSamplerState.MTLSamplerStatePtr samplers, @ByVal NSRange range);
    @Method(selector = "setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    public native void setVertexSamplerState(MTLSamplerState sampler, float lodMinClamp, float lodMaxClamp, @MachineSizedUInt long index);
    @Method(selector = "setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    protected native void setVertexSamplerStates(MTLSamplerState.MTLSamplerStatePtr samplers, FloatPtr lodMinClamps, FloatPtr lodMaxClamps, @ByVal NSRange range);
    @Method(selector = "setViewport:")
    public native void setViewport(@ByVal MTLViewport viewport);
    @Method(selector = "setFrontFacingWinding:")
    public native void setFrontFacingWinding(MTLWinding frontFacingWinding);
    @Method(selector = "setCullMode:")
    public native void setCullMode(MTLCullMode cullMode);
    @Method(selector = "setDepthBias:slopeScale:clamp:")
    public native void setDepthBias(float depthBias, float slopeScale, float clamp);
    @Method(selector = "setScissorRect:")
    public native void setScissorRect(@ByVal MTLScissorRect rect);
    @Method(selector = "setTriangleFillMode:")
    public native void setTriangleFillMode(MTLTriangleFillMode fillMode);
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Method(selector = "setFragmentBytes:length:atIndex:")
    protected native void setFragmentBytes(@Pointer long bytes, @MachineSizedUInt long length, @MachineSizedUInt long index);
    @Method(selector = "setFragmentBuffer:offset:atIndex:")
    public native void setFragmentBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index);
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Method(selector = "setFragmentBufferOffset:atIndex:")
    public native void setFragmentBufferOffset(@MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Method(selector = "setFragmentBuffers:offsets:withRange:")
    protected native void setFragmentBuffers(MTLBuffer.MTLBufferPtr buffers, MachineSizedUIntPtr offset, @ByVal NSRange range);
    @Method(selector = "setFragmentTexture:atIndex:")
    public native void setFragmentTexture(MTLTexture texture, @MachineSizedUInt long index);
    @Method(selector = "setFragmentTextures:withRange:")
    protected native void setFragmentTextures(MTLTexture.MTLTexturePtr textures, @ByVal NSRange range);
    @Method(selector = "setFragmentSamplerState:atIndex:")
    public native void setFragmentSamplerState(MTLSamplerState sampler, @MachineSizedUInt long index);
    @Method(selector = "setFragmentSamplerStates:withRange:")
    protected native void setFragmentSamplerStates(MTLSamplerState.MTLSamplerStatePtr samplers, @ByVal NSRange range);
    @Method(selector = "setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    public native void setFragmentSamplerState(MTLSamplerState sampler, float lodMinClamp, float lodMaxClamp, @MachineSizedUInt long index);
    @Method(selector = "setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    protected native void setFragmentSamplerStates(MTLSamplerState.MTLSamplerStatePtr samplers, FloatPtr lodMinClamps, FloatPtr lodMaxClamps, @ByVal NSRange range);
    @Method(selector = "setBlendColorRed:green:blue:alpha:")
    public native void setBlendColor(float red, float green, float blue, float alpha);
    @Method(selector = "setDepthStencilState:")
    public native void setDepthStencilState(MTLDepthStencilState depthStencilState);
    @Method(selector = "setStencilReferenceValue:")
    public native void setStencilReferenceValue(int referenceValue);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "setStencilFrontReferenceValue:backReferenceValue:")
    public native void setStencilReferenceValue(int frontReferenceValue, int backReferenceValue);
    @Method(selector = "setVisibilityResultMode:offset:")
    public native void setVisibilityResultMode(MTLVisibilityResultMode mode, @MachineSizedUInt long offset);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setColorStoreAction:atIndex:")
    public native void setColorStoreAction(MTLStoreAction storeAction, @MachineSizedUInt long colorAttachmentIndex);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setDepthStoreAction:")
    public native void setDepthStoreAction(MTLStoreAction storeAction);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setStencilStoreAction:")
    public native void setStencilStoreAction(MTLStoreAction storeAction);
    @Method(selector = "drawPrimitives:vertexStart:vertexCount:instanceCount:")
    public native void drawPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount, @MachineSizedUInt long instanceCount);
    @Method(selector = "drawPrimitives:vertexStart:vertexCount:")
    public native void drawPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount);
    @Method(selector = "drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:")
    public native void drawIndexedPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long indexCount, MTLIndexType indexType, MTLBuffer indexBuffer, @MachineSizedUInt long indexBufferOffset, @MachineSizedUInt long instanceCount);
    @Method(selector = "drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:")
    public native void drawIndexedPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long indexCount, MTLIndexType indexType, MTLBuffer indexBuffer, @MachineSizedUInt long indexBufferOffset);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:")
    public native void drawPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long vertexStart, @MachineSizedUInt long vertexCount, @MachineSizedUInt long instanceCount, @MachineSizedUInt long baseInstance);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:")
    public native void drawIndexedPrimitives(MTLPrimitiveType primitiveType, @MachineSizedUInt long indexCount, MTLIndexType indexType, MTLBuffer indexBuffer, @MachineSizedUInt long indexBufferOffset, @MachineSizedUInt long instanceCount, @MachineSizedSInt long baseVertex, @MachineSizedUInt long baseInstance);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "drawPrimitives:indirectBuffer:indirectBufferOffset:")
    public native void drawPrimitives(MTLPrimitiveType primitiveType, MTLBuffer indirectBuffer, @MachineSizedUInt long indirectBufferOffset);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "drawIndexedPrimitives:indexType:indexBuffer:indexBufferOffset:indirectBuffer:indirectBufferOffset:")
    public native void drawIndexedPrimitives(MTLPrimitiveType primitiveType, MTLIndexType indexType, MTLBuffer indexBuffer, @MachineSizedUInt long indexBufferOffset, MTLBuffer indirectBuffer, @MachineSizedUInt long indirectBufferOffset);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "updateFence:afterStages:")
    public native void updateFence(MTLFence fence, MTLRenderStages stages);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "waitForFence:beforeStages:")
    public native void waitForFence(MTLFence fence, MTLRenderStages stages);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setTessellationFactorBuffer:offset:instanceStride:")
    public native void setTessellationFactorBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long instanceStride);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setTessellationFactorScale:")
    public native void setTessellationFactorScale(float scale);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "drawPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:instanceCount:baseInstance:")
    public native void drawPatches(@MachineSizedUInt long numberOfPatchControlPoints, @MachineSizedUInt long patchStart, @MachineSizedUInt long patchCount, MTLBuffer patchIndexBuffer, @MachineSizedUInt long patchIndexBufferOffset, @MachineSizedUInt long instanceCount, @MachineSizedUInt long baseInstance);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "drawIndexedPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:instanceCount:baseInstance:")
    public native void drawIndexedPatches(@MachineSizedUInt long numberOfPatchControlPoints, @MachineSizedUInt long patchStart, @MachineSizedUInt long patchCount, MTLBuffer patchIndexBuffer, @MachineSizedUInt long patchIndexBufferOffset, MTLBuffer controlPointIndexBuffer, @MachineSizedUInt long controlPointIndexBufferOffset, @MachineSizedUInt long instanceCount, @MachineSizedUInt long baseInstance);
    @Method(selector = "endEncoding")
    public native void endEncoding();
    @Method(selector = "insertDebugSignpost:")
    public native void insertDebugSignpost(String string);
    @Method(selector = "pushDebugGroup:")
    public native void pushDebugGroup(String string);
    @Method(selector = "popDebugGroup")
    public native void popDebugGroup();
    /*</methods>*/
}
