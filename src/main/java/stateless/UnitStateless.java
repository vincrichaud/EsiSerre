/**
 * 
 */
package stateless;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Unit;
import interfaceslocal.UnitInterfaceLocal;
import interfacesremote.UnitInterfaceRemote;

/**
 * @author Vincent RICHAUD
 *
 */
@Stateless
public class UnitStateless implements UnitInterfaceLocal, UnitInterfaceRemote {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	public Unit createUnit(Unit unit) {
		em.persist(unit);
		return unit;
	}

	public Unit findUnitById(Long id) {
		return em.find(Unit.class, id);
	}

	public List<Unit> findUnits() {
		TypedQuery<Unit> query = em.createNamedQuery("findUnits", Unit.class);
		return query.getResultList();
	}

	public Unit updateUnit(Unit unit) {
		return em.merge(unit);
	}

	public void deleteUnit(Unit unit) {
		em.remove(unit);	
	}

	
}
