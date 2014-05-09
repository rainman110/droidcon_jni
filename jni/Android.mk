LOCAL_PATH := $(call my-dir)

#
# build native library 
#
include $(CLEAR_VARS)

LOCAL_MODULE    := droidcon-native


### Add all source file names to be included in lib separated by a whitespace 
LOCAL_LDLIBS    := -llog -landroid 
LOCAL_SRC_FILES := mylib.cpp de_dlr_droidcontutorial_DroidconNative.cpp

include $(BUILD_SHARED_LIBRARY)

