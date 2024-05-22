package pl;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import bl.OrokorraEJB;

@Named
@SessionScoped
public class AdminAtazakMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB private OrokorraEJB oEJB;
	public AdminAtazakMB() {
		// TODO Auto-generated constructor stub
	}

	public void baimenaSartuDB(BaimenaFormMB bfMB) {
		oEJB.baimenaSartu(bfMB.getLogina(), bfMB.getGela());
	}
}
