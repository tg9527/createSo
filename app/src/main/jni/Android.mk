
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := create     #System.loadlibrary("create")
LOCAL_SRC_FILES := create.c   #create.c源文件的名字

include $(BUILD_SHARED_LIBRARY)