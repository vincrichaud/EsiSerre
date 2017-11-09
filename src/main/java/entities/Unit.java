/**
 * 
 */
package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * @author Vincent RICHAUD
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name="findUnits", query="SELECT u FROM Unit u")
})
public class Unit implements Serializable {

	/**
	 * 
	 */
	public Unit() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8247787855280353643L;

	/**
	 * @param idUnit
	 * @param name
	 */
	public Unit(Long idUnit, String name) {
		super();
		this.idUnit = idUnit;
		this.name = name;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Unit [idUnit=" + idUnit + ", name=" + name + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUnit == null) ? 0 : idUnit.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unit other = (Unit) obj;
		if (idUnit == null) {
			if (other.idUnit != null)
				return false;
		} else if (!idUnit.equals(other.idUnit))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	/**
	 * @param name
	 */
	public Unit(String name) {
		super();
		this.name = name;
	}


	/**
	 * @return the idUnit
	 */
	public Long getIdUnit() {
		return idUnit;
	}

	/**
	 * @param idUnit the idUnit to set
	 */
	public void setIdUnit(Long idUnit) {
		this.idUnit = idUnit;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idUnit;
	
	private String name;
	
	
}
