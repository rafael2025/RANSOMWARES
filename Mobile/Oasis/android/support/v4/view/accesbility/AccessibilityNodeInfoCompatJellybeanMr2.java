package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatJellybeanMr2 {
	AccessibilityNodeInfoCompatJellybeanMr2() {
		super();
	}

	public static String getViewIdResourceName(Object info) {
		return ((AccessibilityNodeInfo) info).getViewIdResourceName();
	}

	public static void setViewIdResourceName(Object info, String viewId) {
		((AccessibilityNodeInfo) info).setViewIdResourceName(viewId);
	}
}
