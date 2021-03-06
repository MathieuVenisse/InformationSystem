package org.obeonetwork.sample.inheritanceassociations;

// Start of user code for import 
import java.util.Collection;

import org.obeonetwork.fwk.dao.exception.DaoException;
import org.obeonetwork.sample.inheritanceassociations.Class01ManyBIENDSub;

// End of user code for import

/**
 * This class provides the data access layer to the Class_01_Many_BI_END_Sub entity class.<br/>
 * This is the interface which represent the contrat of the DAO access.
 */
public interface IClass01ManyBIENDSubDao {

	/**
	 * Create a new element.
	 * @param class01ManyBIENDSub Element to create.
	 * @throws DaoException If a Dao problem occurs.
	 */
	public void createClass01ManyBIENDSub(Class01ManyBIENDSub class01ManyBIENDSub) throws DaoException;

	/**
	 * Update an existing element.
	 * @param class01ManyBIENDSub Element to update. 
     *            If the element has an id, it may use it.
	 * @throws DaoException If a Dao problem occurs.
	 */
	public void updateClass01ManyBIENDSub(Class01ManyBIENDSub class01ManyBIENDSub) throws DaoException;

	/**
	 * Delete an element.
     * Only id can be used to find which element must be deleted.
	 * @param class01ManyBIENDSub Element which will be delete. 
	 * @throws DaoException If a Dao problem occurs.
	 */
	public void deleteClass01ManyBIENDSub(Class01ManyBIENDSub class01ManyBIENDSub) throws DaoException;

	/**
	 * Find all elements.
	 * @return A list with all elements, without any filter.
	 * @throws DaoException If a Dao problem occurs.
	 */
	public Collection<Class01ManyBIENDSub> findAllClass01ManyBIENDSubs() throws DaoException;

	/**
	 * Find one entity by its primary key.
     * @param id The PK of the entity.
	 * @return The entity found.
	 * @throws DaoException If a Dao problem occurs.
	 */
	public Class01ManyBIENDSub findClass01ManyBIENDSubById(String id) throws DaoException;

	//Start of user code for technicals dao access api
	//End of user code for technical dao access api
}