package pl.edu.agh.wpo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FanController
{
    private State m_current_state;

    public FanController()
    {
        m_current_state = new Off();
    }
    public void set_state(State s)
    {
        m_current_state = s;
    }
    public void pull()
    {
        m_current_state.pull(this);
    }
}

interface State {
  void pull(FanController wrapper);
}

class Off implements State
{
    public void pull(FanController wrapper)
    {
        wrapper.set_state(new Low());
        System.out.println("   low speed");
    }
}

class Low implements State
{
    public void pull(FanController wrapper)
    {
        wrapper.set_state(new Medium());
        System.out.println("   medium speed");
    }
}

class Medium implements State
{
    public void pull(FanController wrapper)
    {
        wrapper.set_state(new High());
        System.out.println("   high speed");
    }
}

class High implements State
{
    public void pull(FanController wrapper)
    {
        wrapper.set_state(new Off());
        System.out.println("   turning off");
    }
}

public class  StateDemo
{
    public static void main(String[] args)
    {
        FanController chain = new FanController();
        while (true)
        {
            System.out.print("Press ");
            get_line();
            chain.pull();
        }
    }
    static String get_line()
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in))
          ;
        String line = null;
        try
        {
            line = in.readLine();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return line;
    }
}
