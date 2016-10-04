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
package com.bugvm.ios.CoreMIDI;

/*<imports>*/

import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDINotification/*</name>*/ 
    extends /*<extends>*/Struct<MIDINotification>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDINotificationPtr extends Ptr<MIDINotification, MIDINotificationPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MIDINotification() {}
    public MIDINotification(MIDINotificationMessageID messageID, int messageSize) {
        this.setMessageID(messageID);
        this.setMessageSize(messageSize);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native MIDINotificationMessageID getMessageID();
    @StructMember(0) public native MIDINotification setMessageID(MIDINotificationMessageID messageID);
    @StructMember(1) public native int getMessageSize();
    @StructMember(1) public native MIDINotification setMessageSize(int messageSize);
    /*</members>*/
    /*<methods>*//*</methods>*/
}