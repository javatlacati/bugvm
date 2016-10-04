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
package com.bugvm.ios.AVFoundation;

/*<imports>*/

import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureDeviceFormat/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureDeviceFormatPtr extends Ptr<AVCaptureDeviceFormat, AVCaptureDeviceFormatPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureDeviceFormat.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCaptureDeviceFormat() {}
    protected AVCaptureDeviceFormat(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mediaType")
    public native AVMediaType getMediaType();
    @Property(selector = "formatDescription")
    public native CMFormatDescription getFormatDescription();
    @Property(selector = "videoSupportedFrameRateRanges")
    public native NSArray<com.bugvm.ios.AVFoundation.AVFrameRateRange> getVideoSupportedFrameRateRanges();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "videoFieldOfView")
    public native float getVideoFieldOfView();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "isVideoBinned")
    public native boolean isVideoBinned();
    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Property(selector = "isVideoStabilizationSupported")
    public native boolean isVideoStabilizationSupported();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "videoMaxZoomFactor")
    public native @MachineSizedFloat double getVideoMaxZoomFactor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "videoZoomFactorUpscaleThreshold")
    public native @MachineSizedFloat double getVideoZoomFactorUpscaleThreshold();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "minExposureDuration")
    public native @ByVal CMTime getMinExposureDuration();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "maxExposureDuration")
    public native @ByVal CMTime getMaxExposureDuration();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "minISO")
    public native float getMinISO();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "maxISO")
    public native float getMaxISO();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "isVideoHDRSupported")
    public native boolean isVideoHDRSupported();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "highResolutionStillImageDimensions")
    public native @ByVal CMVideoDimensions getHighResolutionStillImageDimensions();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "autoFocusSystem")
    public native com.bugvm.ios.AVFoundation.AVCaptureAutoFocusSystem getAutoFocusSystem();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "isVideoStabilizationModeSupported:")
    public native boolean isVideoStabilizationModeSupported(com.bugvm.ios.AVFoundation.AVCaptureVideoStabilizationMode videoStabilizationMode);
    /*</methods>*/
}