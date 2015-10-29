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
package com.bugvm.apple.uikit;

/*<imports>*/
import java.util.*;

import com.bugvm.apple.coregraphics.CGPoint;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDynamicItemBehavior/*</name>*/ 
    extends /*<extends>*/UIDynamicBehavior/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIDynamicItemBehaviorPtr extends Ptr<UIDynamicItemBehavior, UIDynamicItemBehaviorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDynamicItemBehavior.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIDynamicItemBehavior() {}
    protected UIDynamicItemBehavior(SkipInit skipInit) { super(skipInit); }
    public UIDynamicItemBehavior(List<UIDynamicItem> items) { super((SkipInit) null); initObject(init(items)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "items")
    public native List<UIDynamicItem> getItems();
    @Property(selector = "elasticity")
    public native @MachineSizedFloat double getElasticity();
    @Property(selector = "setElasticity:")
    public native void setElasticity(@MachineSizedFloat double v);
    @Property(selector = "friction")
    public native @MachineSizedFloat double getFriction();
    @Property(selector = "setFriction:")
    public native void setFriction(@MachineSizedFloat double v);
    @Property(selector = "density")
    public native @MachineSizedFloat double getDensity();
    @Property(selector = "setDensity:")
    public native void setDensity(@MachineSizedFloat double v);
    @Property(selector = "resistance")
    public native @MachineSizedFloat double getResistance();
    @Property(selector = "setResistance:")
    public native void setResistance(@MachineSizedFloat double v);
    @Property(selector = "angularResistance")
    public native @MachineSizedFloat double getAngularResistance();
    @Property(selector = "setAngularResistance:")
    public native void setAngularResistance(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "charge")
    public native @MachineSizedFloat double getCharge();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setCharge:")
    public native void setCharge(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isAnchored")
    public native boolean isAnchored();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAnchored:")
    public native void setAnchored(boolean v);
    @Property(selector = "allowsRotation")
    public native boolean allowsRotation();
    @Property(selector = "setAllowsRotation:")
    public native void setAllowsRotation(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithItems:")
    protected native @Pointer long init(List<UIDynamicItem> items);
    @Method(selector = "addItem:")
    public native void addItem(UIDynamicItem item);
    @Method(selector = "removeItem:")
    public native void removeItem(UIDynamicItem item);
    @Method(selector = "addLinearVelocity:forItem:")
    public native void addLinearVelocityForItem(@ByVal CGPoint velocity, UIDynamicItem item);
    @Method(selector = "linearVelocityForItem:")
    public native @ByVal CGPoint getLinearVelocityForItem(UIDynamicItem item);
    @Method(selector = "addAngularVelocity:forItem:")
    public native void addAngularVelocityForItem(@MachineSizedFloat double velocity, UIDynamicItem item);
    @Method(selector = "angularVelocityForItem:")
    public native @MachineSizedFloat double getAngularVelocityForItem(UIDynamicItem item);
    /*</methods>*/
}