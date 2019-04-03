/**  
 *jaas-loginmodule - PrincipalImpl.java
 * 
 * Data de criacao 21/01/2016
 *
 * Criado por Thiago Augusto
 * 
 * Copyright SystemGlass - Todos os direitos reservados.
 *
 */
package br.com.systemglass.security.Principals;

import java.io.Serializable;
import java.security.Principal;

/**
 * @author Thiago Augusto
 *
 */
public class RolePrincipal implements Principal, Serializable {
	private static final long serialVersionUID = 1L;

	private String name = null;

	/**
	 * @param userName
	 */
	public RolePrincipal(String name) {
		super();
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.security.Principal#getName()
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public final String toString() {
		return this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RolePrincipal other = (RolePrincipal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
