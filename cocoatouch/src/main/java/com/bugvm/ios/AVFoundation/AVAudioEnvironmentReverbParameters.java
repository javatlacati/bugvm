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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioEnvironmentReverbParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAudioEnvironmentReverbParametersPtr extends Ptr<AVAudioEnvironmentReverbParameters, AVAudioEnvironmentReverbParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioEnvironmentReverbParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioEnvironmentReverbParameters() {}
    protected AVAudioEnvironmentReverbParameters(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enable")
    public native boolean isEnable();
    @Property(selector = "setEnable:")
    public native void setEnable(boolean v);
    @Property(selector = "level")
    public native float getLevel();
    @Property(selector = "setLevel:")
    public native void setLevel(float v);
    @Property(selector = "filterParameters")
    public native AVAudioUnitEQFilterParameters getFilterParameters();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadFactoryReverbPreset:")
    public native void loadFactoryReverbPreset(com.bugvm.ios.AVFoundation.AVAudioUnitReverbPreset preset);
    /*</methods>*/
}