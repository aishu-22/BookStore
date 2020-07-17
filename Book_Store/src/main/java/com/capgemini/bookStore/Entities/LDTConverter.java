package com.capgemini.bookStore.Entities;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/***************************************************************************************
 * @author:      Aishwarya Srivastava                                                  *
 * Description:  It is a entity class that provides the entities that are              * 
 *               going to be used in the application.                                  *
 * Version :     1.0                                                                   *
 * Created Date: 16-JULY-2020                                                           *
 ***************************************************************************************/
@Converter(autoApply = true)
public class LDTConverter implements AttributeConverter<LocalDate, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDate ldt) {
		if (ldt != null)
			return Date.valueOf(ldt); //convert LocalDate into java.sql.Date
		return null;
	}

	@Override
	public LocalDate convertToEntityAttribute(Date sqldt) {
		if (sqldt != null)
			return sqldt.toLocalDate();
		return null;
	}


}
