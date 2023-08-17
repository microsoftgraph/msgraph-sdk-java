package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AutonomousSystem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the autonomous system.
     */
    private String name;
    /**
     * The autonomous system number, assigned by IANA.
     */
    private Integer number;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The name of the autonomous system organization.
     */
    private String organization;
    /**
     * A displayable value for these autonomous system details.
     */
    private String value;
    /**
     * Instantiates a new autonomousSystem and sets the default values.
     */
    public AutonomousSystem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a autonomousSystem
     */
    @jakarta.annotation.Nonnull
    public static AutonomousSystem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutonomousSystem();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the autonomous system.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the number property value. The autonomous system number, assigned by IANA.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumber() {
        return this.number;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the organization property value. The name of the autonomous system organization.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOrganization() {
        return this.organization;
    }
    /**
     * Gets the value property value. A displayable value for these autonomous system details.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeIntegerValue("number", this.getNumber());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("organization", this.getOrganization());
        writer.writeStringValue("value", this.getValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the name property value. The name of the autonomous system.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the number property value. The autonomous system number, assigned by IANA.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final Integer value) {
        this.number = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the organization property value. The name of the autonomous system organization.
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final String value) {
        this.organization = value;
    }
    /**
     * Sets the value property value. A displayable value for these autonomous system details.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
