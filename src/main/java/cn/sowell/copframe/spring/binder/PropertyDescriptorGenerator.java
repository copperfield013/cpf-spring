package cn.sowell.copframe.spring.binder;

import java.beans.PropertyDescriptor;

public interface PropertyDescriptorGenerator {

	PropertyDescriptor getPropertyDescriptor(Class<?> targetClass,
			String propertyName);

}
