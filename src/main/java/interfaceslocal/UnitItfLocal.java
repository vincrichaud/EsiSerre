/**
 * 
 */
package interfaceslocal;

import java.util.List;

import javax.ejb.Local;

import entities.Unit;

/**
 * @author Vincent RICHAUD
 *
 */
@Local
public interface UnitItfLocal {

	public Unit createUnit(Unit unit);
	
	public Unit findUnitById(Long id);
	
	public List<Unit> findUnits();
	
	public Unit updateUnit(Unit unit);
	
	public void deleteUnit(Unit unit);
}
