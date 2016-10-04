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
package com.bugvm.ios.iAd;

/*<imports>*/

import com.bugvm.objc.annotation.*;
import com.bugvm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ADBannerViewDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "bannerViewWillLoadAd:")
    void willLoadAd(ADBannerView banner);
    @Method(selector = "bannerViewDidLoadAd:")
    void didLoadAd(ADBannerView banner);
    @Method(selector = "bannerView:didFailToReceiveAdWithError:")
    void didFailToReceiveAd(ADBannerView banner, NSError error);
    @Method(selector = "bannerViewActionShouldBegin:willLeaveApplication:")
    boolean actionShouldBegin(ADBannerView banner, boolean willLeave);
    @Method(selector = "bannerViewActionDidFinish:")
    void actionDidFinish(ADBannerView banner);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}