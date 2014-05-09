package de.dlr.droidcontutorial;

public class DroidconNative {
    static {
        // load droidcon-native.so from libs
        System.loadLibrary("droidcon-native");
    }

    // Declare a native methods
    public static native int    calcFibonacci(int number);
    public static native String getName();
    public static native void   setName(String s);
}
