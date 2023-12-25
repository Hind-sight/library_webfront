package com.book.manager.dialect;

import com.fasterxml.jackson.databind.JsonNode;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;

/**
 * @author Vlad MIhalcea
 */
public class JsonNodeBinaryType
	extends AbstractSingleColumnStandardBasicType<JsonNode> {
	public JsonNodeBinaryType() {
		super( JsonBinarySqlTypeDescriptor.INSTANCE, JsonNodeTypeDescriptor.INSTANCE );
	}
	public String getName() {
		return "jsonb-node";
	}
}