#include "de_dlr_droidcontutorial_DroidconNative.h"
#include "mylib.h"

jint Java_de_dlr_droidcontutorial_DroidconNative_calcFibonacci(JNIEnv*, jclass, jint n)
{
    return mylib::fibonacci(n);
}

jstring Java_de_dlr_droidcontutorial_DroidconNative_getName(JNIEnv* env, jclass)
{
    return env->NewStringUTF(mylib::getName().c_str());
}

void Java_de_dlr_droidcontutorial_DroidconNative_setName(JNIEnv* env, jclass, jstring name)
{
    const char* cstr = env->GetStringUTFChars(name, NULL);
    mylib::setName(cstr);
    env->ReleaseStringUTFChars(name, cstr);
}
