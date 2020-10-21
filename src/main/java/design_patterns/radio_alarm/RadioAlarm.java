package design_patterns.radio_alarm;

import lombok.experimental.Delegate;

public class RadioAlarm implements Radio,Alarm{
    @Delegate
    private Radio radio =new RadioImpl();
    @Delegate
    private Alarm alarm=new AlarmImpl();


}
