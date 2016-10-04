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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/AudioFileFlags/*</name>*/ extends Bits</*<name>*/AudioFileFlags/*</name>*/> {
    /*<values>*/
    public static final AudioFileFlags None = new AudioFileFlags(0L);
    public static final AudioFileFlags EraseFile = new AudioFileFlags(1L);
    public static final AudioFileFlags DontPageAlignAudioData = new AudioFileFlags(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/AudioFileFlags/*</name>*/[] values = _values(/*<name>*/AudioFileFlags/*</name>*/.class);

    public /*<name>*/AudioFileFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/AudioFileFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/AudioFileFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/AudioFileFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/AudioFileFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/AudioFileFlags/*</name>*/[] values() {
        return values.clone();
    }
}