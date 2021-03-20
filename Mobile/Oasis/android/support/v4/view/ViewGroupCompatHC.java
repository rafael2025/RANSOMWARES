package android.support.v4.view;

import android.view.ViewGroup;

class ViewGroupCompatHC {
	private ViewGroupCompatHC() {
		super();
	}

	public static void setMotionEventSplittingEnabled(ViewGroup group, boolean split) {
		group.setMotionEventSplittingEnabled(split);
	}
}
