package android.support.v4.util;

public class DebugUtils {
	public DebugUtils() {
		super();
	}

	public static void buildShortClassTag(Object cls, StringBuilder out) {
		if (cls == null) {
			out.append("null");
		} else {
			String simpleName = cls.getClass().getSimpleName();
			if (simpleName == null || simpleName.length() <= 0) {
				simpleName = cls.getClass().getName();
				int end = simpleName.lastIndexOf(46);
				if (end > 0) {
					simpleName = simpleName.substring(end + 1);
				}
			} else {
				out.append(simpleName);
				out.append('{');
				out.append(Integer.toHexString(System.identityHashCode(cls)));
			}
			out.append(simpleName);
			out.append('{');
			out.append(Integer.toHexString(System.identityHashCode(cls)));
		}
	}
}
