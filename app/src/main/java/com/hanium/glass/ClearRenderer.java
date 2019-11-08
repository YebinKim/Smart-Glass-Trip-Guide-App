package com.hanium.glass;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

class ClearRenderer implements GLSurfaceView.Renderer {
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        // Do nothing special.
    }

    public void onSurfaceChanged(GL10 gl, int w, int h) {
        gl.glViewport(0, 0, w, h);
    }

    public void onDrawFrame(GL10 gl) {
        gl.glClearColor(mRed, mGreen, mBlue, 1.0f);
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
    }

    public void setColor(float r, float g, float b) {
        mRed = r;
        mGreen = g;
        mBlue = b;
    }

    private float mRed;
    private float mGreen;
    private float mBlue;
}

//class ClearRenderer implements GLSurfaceView.Renderer {
//    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
//        // Do nothing special.
//    }
//
//    public void onSurfaceChanged(GL10 gl, int w, int h) {
//        gl.glViewport(0, 0, w, h);
//    }
//
//    public void onDrawFrame(GL10 gl) {
//
//        gl.glClearColor(mRed, mGreen, mBlue, 1.0f);
//
//        gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
//    }
//
//    public void setColor(float r, float g, float b) {
//        mRed = r;
//        mGreen = g;
//        mBlue = b;
//    }
//
//    private float mRed;
//    private float mGreen;
//    private float mBlue;
//}
