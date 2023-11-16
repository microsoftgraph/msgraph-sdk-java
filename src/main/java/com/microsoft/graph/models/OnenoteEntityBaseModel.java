package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnenoteEntityBaseModel extends Entity implements Parsable {
    /**
     * Instantiates a new OnenoteEntityBaseModel and sets the default values.
     */
    public OnenoteEntityBaseModel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnenoteEntityBaseModel
     */
    @jakarta.annotation.Nonnull
    public static OnenoteEntityBaseModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.notebook": return new Notebook();
                case "#microsoft.graph.onenoteEntityHierarchyModel": return new OnenoteEntityHierarchyModel();
                case "#microsoft.graph.onenoteEntitySchemaObjectModel": return new OnenoteEntitySchemaObjectModel();
                case "#microsoft.graph.onenotePage": return new OnenotePage();
                case "#microsoft.graph.onenoteResource": return new OnenoteResource();
                case "#microsoft.graph.onenoteSection": return new OnenoteSection();
                case "#microsoft.graph.sectionGroup": return new SectionGroup();
            }
        }
        return new OnenoteEntityBaseModel();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("self", (n) -> { this.setSelf(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the self property value. The endpoint where you can get details about the page. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSelf() {
        return this.BackingStore.get("self");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("self", this.getSelf());
    }
    /**
     * Sets the self property value. The endpoint where you can get details about the page. Read-only.
     * @param value Value to set for the self property.
     */
    public void setSelf(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("self", value);
    }
}
