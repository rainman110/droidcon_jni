/*
 * mylib.h
 *
 *  Created on: 08.05.2014
 *      Author: sigg_ma
 */

#ifndef MYLIB_H_
#define MYLIB_H_

// Droidcon example library

#include <string>

namespace mylib {

    int         fibonacci(int n);
    std::string getName();
    void        setName(std::string name);

} // namespace

#endif /* MYLIB_H_ */
