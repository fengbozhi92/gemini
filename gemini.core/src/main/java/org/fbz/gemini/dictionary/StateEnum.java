package org.fbz.gemini.dictionary;

import java.util.Arrays;
import java.util.List;

public enum StateEnum {
    Enable(1, "启用"),Disable(2, "禁用");
    
    private final int value;
    private final String label;
    
    private StateEnum(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }
    
    public static String getEnumLabel(int value){
        StateEnum result = StateEnum.parse(value);
        return result != null ? result.getLabel() : null;
    }
    
    public static StateEnum parse(int value){
        StateEnum result = null;
        switch (value) {
        case 1:
            result = StateEnum.Enable;
            break;
        case 2:
            result = StateEnum.Disable;
            break;
        }
        return result;
    }
    
    public static List<StateEnum> getEnumValus(){
        return Arrays.asList(values());
    }
}
