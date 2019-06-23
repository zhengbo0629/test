package com.prac.java;

public enum DataTypeEnum {
	VARCHAR("22","q","b"),
	DOUBLE("DOUBLE","",""),
	Int("Int","","");

	
    private final String name;
    private final String group;
    private final String chinese;
    	
  
    DataTypeEnum(String name,String group,String chinese) {
        this.name = name;
        this.group=group;
        this.chinese=chinese;
    }

    public String getName() {
        return name;
    }
    public String getGroup(){
    	return group;
    }
    public String getChinese(){
    	return chinese;
    }
    public static void main(String[] args) {
		for (DataTypeEnum data :DataTypeEnum.values()) {
			System.out.println(data.toString(data));
		}
	}
    public String toString(DataTypeEnum temp) {
    	return temp.chinese+";"+temp.group;
    }

}
