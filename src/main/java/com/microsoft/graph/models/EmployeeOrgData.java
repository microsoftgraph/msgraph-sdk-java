package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmployeeOrgData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cost center associated with the user. Returned only on $select. Supports $filter.
     */
    private String costCenter;
    /**
     * The name of the division in which the user works. Returned only on $select. Supports $filter.
     */
    private String division;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new employeeOrgData and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EmployeeOrgData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a employeeOrgData
     */
    @javax.annotation.Nonnull
    public static EmployeeOrgData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmployeeOrgData();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the costCenter property value. The cost center associated with the user. Returned only on $select. Supports $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCostCenter() {
        return this.costCenter;
    }
    /**
     * Gets the division property value. The name of the division in which the user works. Returned only on $select. Supports $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDivision() {
        return this.division;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("costCenter", (n) -> { this.setCostCenter(n.getStringValue()); });
        deserializerMap.put("division", (n) -> { this.setDivision(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("costCenter", this.getCostCenter());
        writer.writeStringValue("division", this.getDivision());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the costCenter property value. The cost center associated with the user. Returned only on $select. Supports $filter.
     * @param value Value to set for the costCenter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCostCenter(@javax.annotation.Nullable final String value) {
        this.costCenter = value;
    }
    /**
     * Sets the division property value. The name of the division in which the user works. Returned only on $select. Supports $filter.
     * @param value Value to set for the division property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDivision(@javax.annotation.Nullable final String value) {
        this.division = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
