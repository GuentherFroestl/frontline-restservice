/*
 * FieldSpec.java
 *
 * Created on 9. Oktober 2005, 11:35
 */

package de.gammadata.tom.four_d_access.xml;

/**
 * 
 * @author günther
 */
public class FieldSpec {
	private String fieldName;
	private int fieldNumber;
	private int alphaLength;
	private int fieldTypeCode = 0;
	private String fieldType;
	private boolean fieldTypeCodeFlag = false;
	private boolean fieldTypeFlag = false;
	private OneObjectPointer oneObjectPointer;

	/** Creates a new instance of FieldSpec */
	public FieldSpec() {
	}

	public FieldSpec(String fieldName, int fieldNumber, int alphaLength,
			String fieldType, OneObjectPointer oneObjectPointer) {
		this.fieldName = fieldName;
		this.fieldNumber = fieldNumber;
		this.alphaLength = alphaLength;
		this.fieldType = fieldType;
		fieldTypeFlag = true;
		this.oneObjectPointer = oneObjectPointer;
	}

	public void setFieldName(String inp) {
		this.fieldName = inp;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldNumber(int inp) {
		this.fieldNumber = inp;
	}

	public int getFieldNumber() {
		return this.fieldNumber;
	}

	public void setAlphaLength(int inp) {
		this.alphaLength = inp;
	}

	public int getAlphaLength() {
		return this.alphaLength;
	}

	public void setFieldTypeCode(int inp) {
		this.fieldTypeCode = inp;
		fieldTypeCodeFlag = true;
	}

	public int getFieldTypeCode() {
		if (fieldTypeCodeFlag) {
			return this.fieldTypeCode;
		} else {
			return encodeFieldType(this.fieldType);
		}
	}

	public void setFieldType(String inp) {
		this.fieldType = inp;
		fieldTypeFlag = true;
	}

	public String getFieldType() {
		if (fieldTypeFlag) {
			return this.fieldType;
		} else {
			return decodeTypeCode(this.fieldTypeCode);
		}

	}

	public void setOneObjectPointer(OneObjectPointer oneObjectPointer) {
		this.oneObjectPointer = oneObjectPointer;
	}

	public OneObjectPointer getOneObjectPointer() {
		return this.oneObjectPointer;
	}

	private String decodeTypeCode(int typeCode) {
		return "not implemented";
	}

	private int encodeFieldType(String fieldType) {
		return -1;
	}
}
