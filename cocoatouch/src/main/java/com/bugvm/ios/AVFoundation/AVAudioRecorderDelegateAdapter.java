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

import com.bugvm.objc.annotation.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioRecorderDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AVAudioRecorderDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("audioRecorderDidFinishRecording:successfully:")
    public void didFinishRecording(com.bugvm.ios.AVFoundation.AVAudioRecorder recorder, boolean flag) {}
    @NotImplemented("audioRecorderEncodeErrorDidOccur:error:")
    public void encodeErrorDidOccur(com.bugvm.ios.AVFoundation.AVAudioRecorder recorder, NSError error) {}
    /**
     * @since Available in iOS 2.2 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("audioRecorderBeginInterruption:")
    public void beginInterruption(com.bugvm.ios.AVFoundation.AVAudioRecorder recorder) {}
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @NotImplemented("audioRecorderEndInterruption:withOptions:")
    public void endInterruption(com.bugvm.ios.AVFoundation.AVAudioRecorder recorder, @MachineSizedUInt long flags) {}
    /*</methods>*/
}