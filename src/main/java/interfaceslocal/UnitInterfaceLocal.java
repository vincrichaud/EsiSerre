/**
 * 
 */
package interfaceslocal;

import java.util.List;

import entities.Unit;

/**
 * @author Vincent RICHAUD
 *
 */
@Local
public interface UnitInterfaceLocal {

	public Unit createUnit(Unit unit);
	
	public Unit findUnitById(Long id);
	
	public List<Unit> findUnits();
	
	public Unit updateUnit(Unit unit);
	
	public void deleteUnit(Unit unit);
}
