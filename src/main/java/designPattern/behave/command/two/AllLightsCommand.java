package designPattern.behave.command.two;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllLightsCommand implements Command {
    private List<Light> lights;

    @Override
    public void execute() {
        lights.stream().filter(Light::isOn).forEach(Light::toggle);
    }
}
