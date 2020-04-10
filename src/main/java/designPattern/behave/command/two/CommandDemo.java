package designPattern.behave.command.two;

import java.util.ArrayList;
import java.util.List;

//Client
public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light();
        Switch lightSwitch = new Switch();
        //Command
        Command onCommandLightOn = new OnCommand(light);
        lightSwitch.storeAndExecuteCommand(onCommandLightOn);
        Command onCommand = new ToggleCommand(light);
        //Command execute
        lightSwitch.storeAndExecuteCommand(onCommand);
        lightSwitch.storeAndExecuteCommand(onCommand);
        lightSwitch.storeAndExecuteCommand(onCommand);
        lightSwitch.storeAndExecuteCommand(onCommand);

        Light bedRoomLight = new Light();
        Light kitchenLight = new Light();

        List<Light> lights = new ArrayList<>();
        lights.add(bedRoomLight);
        lights.add(kitchenLight);
        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecuteCommand(allLightsCommand);
    }
}
