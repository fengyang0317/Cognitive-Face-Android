package com.microsoft.projectoxford.face.samples.ui;

import android.app.Activity;

/**
 * Created by yfeng23 on 4/24/17.
 */

public class CommonModelClass
{
    public static CommonModelClass singletonObject;
    /** A private Constructor prevents any other class from instantiating. */

    private Activity baseActivity;

    public CommonModelClass()
    {
        //   Optional Code
    }
    public static synchronized CommonModelClass getSingletonObject()
    {
        if (singletonObject == null)
        {
            singletonObject = new CommonModelClass();
        }
        return singletonObject;
    }


    /**
     * used to clear CommonModelClass(SingletonClass) Memory
     */
    public void clear()
    {
        singletonObject = null;
    }


    public Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    //getters and setters starts from here.it is used to set and get a value

    public Activity getbaseActivity()
    {
        return baseActivity;
    }

    public void setbaseActivity(MainActivity baseActivity)
    {
        this.baseActivity = baseActivity;
    }

}