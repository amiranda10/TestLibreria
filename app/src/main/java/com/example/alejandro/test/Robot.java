package com.example.alejandro.test;

import android.widget.EditText;
import android.widget.TextView;

import rec.robotino.com.Bumper;
import rec.robotino.com.Com;
import rec.robotino.com.Motor;
import rec.robotino.com.OmniDrive;

/**
 * Created by Alejandro on 16/04/2015.
 */
public class Robot implements Runnable{

    protected final String hostname;
    protected final Com com;
    protected final Motor motor1;
    protected final Motor motor2;
    protected final Motor motor3;
    protected final OmniDrive omniDrive;
    protected final Bumper bumper;

    public Robot(String hostname)
    {
        this.hostname = hostname;
        com = new Com();
        motor1 = new Motor();
        motor2 = new Motor();
        motor3 = new Motor();
        omniDrive = new OmniDrive();
        bumper = new Bumper();
    }

    public  void run()
    {

    }
/*
    public void run()
    {
        System.out.println("Robot started.");

        try
        {
            System.out.println("Initializing...");
            init();
            System.out.println("Connecting...");
            connect(hostname);
            System.out.println("Connected.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            disconnect();
        }

        System.out.println("Done.");
    }

    protected void init()
    {
        motor1.setComId(com.id());
        motor1.setMotorNumber(0);

        motor2.setComId(com.id());
        motor2.setMotorNumber(1);

        motor3.setComId(com.id());
        motor3.setMotorNumber(2);

        omniDrive.setComId(com.id());

        bumper.setComId(com.id());
    }

    protected void connect(String hostname)
    {
        com.setAddress(hostname);
        com.connect();
    }

    protected void disconnect()
    {
        com.disconnect();
    }
    */
}
