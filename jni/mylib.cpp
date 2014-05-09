// Droidcon demo library
#include "mylib.h"

#include <string>
#include <android/log.h>
#define LOGD(LOG_TAG, ...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)

namespace mylib {


    // just some global variable/state of library
    std::string myname = "default name";

    int fibonacci(int n) {
        if (n < 0) {
            // 0th fibonacci not defined!
            return 0;
        }
        else if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


    std::string getName() {
        return myname;
    }


    void setName(std::string name) {
        myname = name;
    }


} // namespace

