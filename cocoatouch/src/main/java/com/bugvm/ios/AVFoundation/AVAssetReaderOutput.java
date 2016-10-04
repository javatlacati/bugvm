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
import java.util.*;

import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetReaderOutput/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetReaderOutputPtr extends Ptr<AVAssetReaderOutput, AVAssetReaderOutputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetReaderOutput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAssetReaderOutput() {}
    protected AVAssetReaderOutput(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mediaType")
    public native AVMediaType getMediaType();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "alwaysCopiesSampleData")
    public native boolean alwaysCopiesSampleData();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "setAlwaysCopiesSampleData:")
    public native void setAlwaysCopiesSampleData(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "supportsRandomAccess")
    public native boolean supportsRandomAccess();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setSupportsRandomAccess:")
    public native void setSupportsRandomAccess(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @WeaklyLinked
    @Method(selector = "copyNextSampleBuffer")
    public native @com.bugvm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CMSampleBuffer getNextSampleBuffer();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "resetForReadingTimeRanges:")
    public native void resetForReadingTimeRanges(@com.bugvm.rt.bro.annotation.Marshaler(CMTimeRange.AsValuedListMarshaler.class) List<CMTimeRange> timeRanges);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "markConfigurationAsFinal")
    public native void markConfigurationAsFinal();
    /*</methods>*/
}