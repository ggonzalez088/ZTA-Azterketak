package pl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TenpFormMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private float tenperatura=37.0F;
	public TenpFormMB() {
		// TODO Auto-generated constructor stub
	}
	
	public TenpFormMB(float tenperatura) {
		super();
		this.tenperatura = tenperatura;
	}

	public float getTenperatura() {
		return tenperatura;
	}
	public void setTenperatura(float tenperatura) {
		this.tenperatura = tenperatura;
	}
	public void resetForm() {
		tenperatura=37.0F;
	}

}
