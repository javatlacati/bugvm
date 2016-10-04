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
package com.bugvm.ios.AudioToolbox;

/*<imports>*/

import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAFChunkHeader/*</name>*/ 
    extends /*<extends>*/Struct<CAFChunkHeader>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CAFChunkHeaderPtr extends Ptr<CAFChunkHeader, CAFChunkHeaderPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAFChunkHeader() {}
    public CAFChunkHeader(CAFChunkType chunkType, long chunkSize) {
        this.setChunkType(chunkType);
        this.setChunkSize(chunkSize);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native CAFChunkType getChunkType();
    @StructMember(0) public native CAFChunkHeader setChunkType(CAFChunkType chunkType);
    @StructMember(1) public native long getChunkSize();
    @StructMember(1) public native CAFChunkHeader setChunkSize(long chunkSize);
    /*</members>*/
    /*<methods>*//*</methods>*/
}