package cn.sowell.copframe.spring.propTranslator.translator;

import cn.sowell.copframe.spring.propTranslator.GetPropertyValueComposite;
import cn.sowell.copframe.spring.propTranslator.SetPropertyValueComposite;

public class DefaultPropertyValueTranslator extends AbstractPropertyValueTranslator{

	@Override
	public boolean canGet(GetPropertyValueComposite composite) {
		return true;
	}

	@Override
	public boolean canSet(SetPropertyValueComposite composite) {
		return true;
	}

	@Override
	public Object getValue(GetPropertyValueComposite composite) {
		return composite.getPropertyValue();
	}

	@Override
	public void setValue(SetPropertyValueComposite composite) {
		composite.setValueByExpression(composite.getToSetValue());
	}

	
	
	

}
