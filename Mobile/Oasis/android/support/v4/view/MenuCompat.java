package android.support.v4.view;

import android.view.MenuItem;

public class MenuCompat {
	public MenuCompat() {
		super();
	}

	@Deprecated
	public static void setShowAsAction(MenuItem item, int actionEnum) {
		MenuItemCompat.setShowAsAction(item, actionEnum);
	}
}
