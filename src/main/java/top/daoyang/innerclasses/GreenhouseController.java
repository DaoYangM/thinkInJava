package top.daoyang.innerclasses;

import top.daoyang.innerclasses.controller.Event;
import top.daoyang.innerclasses.controller.GreenhouseControls;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gs = new GreenhouseControls();
        gs.addEvent(gs.new Bell(900));
        Event[] eventList = {
                gs.new ThermostatNight(0),
                gs.new LightOn(200),
                gs.new LightOff(400),
                gs.new WaterOn(600),
                gs.new WaterOff(800),
                gs.new ThermostatDay(1400)
        };
        gs.addEvent(gs.new Restart(2000, eventList));
        if(args.length == 1)
            gs.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])
                    )
            );
        gs.run();
    }
}
