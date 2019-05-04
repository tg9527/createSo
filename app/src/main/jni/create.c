#include <stdio.h>
#include <stdlib.h>
#include "com_lt_so_Create.h"

/*
 * Class:     com_lt_so_Create
 * Method:    helloFromC
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_lt_so_Create_helloFromC
  (JNIEnv * env, jclass jobject){
    return (*env) -> NewStringUTF(env,"hello from C !");
  };

/*
 * Class:     com_lt_so_Create
 * Method:    add
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_lt_so_Create_add
  (JNIEnv * env, jclass jobject, jint a, jint b){
    return a + b;
  };
