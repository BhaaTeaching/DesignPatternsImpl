package patterns;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import enums.DesignPatternsTypes;

public class Factory implements DesignPattern {
	private final Map<String, Contract> classTypeToClassInstance;
	
	public Factory(List<Contract> classes) {
		this.classTypeToClassInstance = classes.stream().collect(Collectors.toMap(key -> key.getType(), value -> value));
	}
	
	public Contract getInstance(String className) {
		return classTypeToClassInstance.get(className);
	}
	
	@Override
	public DesignPatternsTypes getType() {
		return DesignPatternsTypes.FACTORY;
	}
	
}

interface Contract {
	String getType();
}

class A implements Contract {
	
	@Override
	public String getType() {
		return "A";
	}
}

class B implements Contract {
	
	@Override
	public String getType() {
		return "B";
	}
}