APP_BUILD_SCRIPT := $(call my-dir)/Android.mk

APP_OPTIM := release
APP_PLATFORM    := android-9
APP_STL         := gnustl_static
APP_CPPFLAGS    := -fexceptions -frtti
APP_ABI         := armeabi x86
APP_MODULES     := droidcon-native
