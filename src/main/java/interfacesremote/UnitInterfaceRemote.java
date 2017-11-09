/**
 * 
 */
package interfacesremote;



import java.util.List;

import entities.Unit;

/**
 * @author Vincent RICHAUD
 *
 */
@Remote
public interface UnitInterfaceRemote {

	public Unit createUnit(Unit unit);
	
	public Unit findUnitById(Long id);
	
	public List<Unit> findUnits();
	
	public Unit updateUnit(Unit unit);
	
	public void deleteUnit(Unit unit);
}
