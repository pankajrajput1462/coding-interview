package designpattern.behave.command.two;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OnCommand implements Command {
    private Light light;

    @Override
    public void execute() {
        light.on();
    }
}
