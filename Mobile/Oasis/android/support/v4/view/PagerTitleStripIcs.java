package android.support.v4.view;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

class PagerTitleStripIcs {
	private static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
		private static final String TAG = "SingleLineAllCapsTransform";
		private Locale mLocale;

		public SingleLineAllCapsTransform(Context context) {
			super();
			mLocale = context.getResources().getConfiguration().locale;
		}

		public CharSequence getTransformation(CharSequence source, View view) {
			source = super.getTransformation(source, view);
			if (source != null) {
				return source.toString().toUpperCase(mLocale);
			} else {
				return null;
			}
		}
	}


	PagerTitleStripIcs() {
		super();
	}

	public static void setSingleLineAllCaps(TextView text) {
		text.setTransformationMethod(new SingleLineAllCapsTransform(text.getContext()));
	}
}
