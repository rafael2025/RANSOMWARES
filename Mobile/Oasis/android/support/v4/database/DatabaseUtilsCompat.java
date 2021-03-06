package android.support.v4.database;

import android.text.TextUtils;

public class DatabaseUtilsCompat {
	private DatabaseUtilsCompat() {
		super();
	}

	public static String[] appendSelectionArgs(String[] originalValues, String[] newValues) {
		if (originalValues == null || originalValues.length == 0) {
			return newValues;
		} else {
			Object result = new Object[(originalValues.length + newValues.length)];
			System.arraycopy(originalValues, 0, result, 0, originalValues.length);
			System.arraycopy(newValues, 0, result, originalValues.length, newValues.length);
			return result;
		}
	}

	public static String concatenateWhere(String a, String b) {
		if (TextUtils.isEmpty(a)) {
			return b;
		} else if (TextUtils.isEmpty(b)) {
			return a;
		} else {
			return "(" + a + ") AND (" + b + ")";
		}
	}
}
