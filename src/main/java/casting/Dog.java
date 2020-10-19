package casting;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dog implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("woof");
    }
}
