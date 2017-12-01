package org.fbz.gemini.dictionary;

import java.util.Arrays;
import java.util.List;

public enum BooleanEnum {
    True(1, "是"),False(2, "否");
    
    private final int value;
    private final String label;
    
    private BooleanEnum(int value, String label) {
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
        BooleanEnum result = BooleanEnum.parse(value);
        return result != null ? result.getLabel() : null;
    }
    
    public static BooleanEnum parse(int value){
        BooleanEnum result = null;
        switch (value) {
        case 1:
            result = BooleanEnum.True;
            break;
        case 2:
            result = BooleanEnum.False;
            break;
        }
        return result;
    }
    
    public static List<BooleanEnum> getEnumValus(){
        return Arrays.asList(values());
    }
}
