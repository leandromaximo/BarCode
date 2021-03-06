package br.com.barcard.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.barcard.util.StringUtil;

@FacesConverter(value = "telefoneConverter")
public class TelefoneConverter implements Converter {

	public String getAsObject(FacesContext fc, UIComponent component,
			String value) {
		if(!value.trim().equals("")){
			return (String) value.replace("(", "").replace(")", "").replace("-", "");
		}
		return new String();
	}

	public String getAsString(FacesContext fc, UIComponent component,
			Object value) {
		return StringUtil.maskTelefone(value.toString());
	}
}
