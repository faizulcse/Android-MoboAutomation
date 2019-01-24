package helper;

public class AppConstant {
	private AppConstant () { } // prevents instantiation
	
	public static final String CURRENT_DIR = System.getProperty("user.dir");

	public static final String ANDROID_DEVICE_SETTING = CURRENT_DIR + "/config/android.conf";
	public static final String IOS_SETTING_PATH = CURRENT_DIR + "/config/device/ios.conf";
	public static final String APP_FOLDER = CURRENT_DIR + "/app/";
}
